// Copyright (c) 2013-2014 Sandstorm Development Group, Inc. and contributors
// Licensed under the MIT License:
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.

package org.capnproto.examples.nginxlog;

import org.capnproto.StructList;
import org.capnproto.examples.nginxlog.NginxlogCapnp.NginxLog;
import org.capnproto.examples.nginxlog.NginxlogCapnp.NginxLogLine;

import java.io.*;

public class MainNginxlogCapnp {

    public static void writeNginxLogLine() throws java.io.IOException {
        org.capnproto.MessageBuilder message = new org.capnproto.MessageBuilder();
        NginxLogLine.Builder anNginxLogLine = message.initRoot(NginxLogLine.factory);

        // SpringNut.access.log.43 192.168.69.129 - - [15/Apr/2018:13:01:47 +0200] "GET / HTTP/1.1" 200 2292 "-" "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36"

        anNginxLogLine.setHost("SpringNut");
        anNginxLogLine.setClientIP("192.168.69.129");
        anNginxLogLine.setReferer("");
        anNginxLogLine.setTimestamp("15/Apr/2018:13:01:47 +0200");
        anNginxLogLine.setMethod("GET");
        anNginxLogLine.setProto("HTTP/1.1");
        anNginxLogLine.setHttpStatus((short) 200);
        anNginxLogLine.setResponseLen(2292);
        anNginxLogLine.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");

        org.capnproto.SerializePacked.writeToUnbuffered(
                (new FileOutputStream(FileDescriptor.out)).getChannel(),
                message);
    }


    public static void writeNginxLogLines() throws java.io.IOException {
        org.capnproto.MessageBuilder message = new org.capnproto.MessageBuilder();
        NginxLog.Builder anNginxLog = message.initRoot(NginxLog.factory);
        StructList.Builder<NginxLogLine.Builder> someNginxLogLines = anNginxLog.initLines(2);

        // SpringNut.access.log.43 192.168.69.129 - - [15/Apr/2018:13:01:47 +0200] "GET / HTTP/1.1" 200 2292 "-" "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36"
        NginxLogLine.Builder anNginxLogLine = someNginxLogLines.get(0);
        anNginxLogLine.setHost("SpringNut");
        anNginxLogLine.setClientIP("192.168.69.129");
        anNginxLogLine.setReferer("");
        anNginxLogLine.setTimestamp("15/Apr/2018:13:01:47 +0200");
        anNginxLogLine.setMethod("GET");
        anNginxLogLine.setUrl("/");
        anNginxLogLine.setProto("HTTP/1.1");
        anNginxLogLine.setHttpStatus((short) 200);
        anNginxLogLine.setResponseLen(2292);
        anNginxLogLine.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");


        // nginx-workOflow-83.log.1 192.168.99.1 - - [06/Jun/2018:00:02:44 +0200] "GET /build/main.js HTTP/1.1" 200 287069 "http://workoflow.org/" "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36"
        NginxLogLine.Builder otherNginxLogLine = someNginxLogLines.get(1);
        otherNginxLogLine.setHost("workOflow");
        otherNginxLogLine.setClientIP("192.168.99.1");
        otherNginxLogLine.setReferer("http://workoflow.org/");
        otherNginxLogLine.setTimestamp("106/Jun/2018:00:02:44 +0200");
        otherNginxLogLine.setMethod("GET");
        otherNginxLogLine.setUrl("/build/main.js");
        otherNginxLogLine.setProto("HTTP/1.1");
        otherNginxLogLine.setHttpStatus((short) 200);
        otherNginxLogLine.setResponseLen(287069);
        otherNginxLogLine.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36");

        org.capnproto.SerializePacked.writeToUnbuffered(
                (new FileOutputStream(FileDescriptor.out)).getChannel(),
                message);
    }


    public static void writeAndReadNginxLogLines(File theFile) throws java.io.IOException {

        org.capnproto.MessageBuilder aMessageToWrite = new org.capnproto.MessageBuilder();

        NginxLog.Builder anNginxLogToWrite = aMessageToWrite.initRoot(NginxLog.factory);

        StructList.Builder<NginxLogLine.Builder> someNginxLogLines = anNginxLogToWrite.initLines(2);

        // SpringNut.access.log.43 192.168.69.129 - - [15/Apr/2018:13:01:47 +0200] "GET / HTTP/1.1" 200 2292 "-" "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36"
        NginxLogLine.Builder anNginxLogLine = someNginxLogLines.get(0);
        anNginxLogLine.setHost("SpringNut");
        anNginxLogLine.setClientIP("192.168.69.129");
        anNginxLogLine.setReferer("");
        anNginxLogLine.setTimestamp("15/Apr/2018:13:01:47 +0200");
        anNginxLogLine.setMethod("GET");
        anNginxLogLine.setUrl("/");
        anNginxLogLine.setProto("HTTP/1.1");
        anNginxLogLine.setHttpStatus((short) 200);
        anNginxLogLine.setResponseLen(2292);
        anNginxLogLine.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");


        // nginx-workOflow-83.log.1 192.168.99.1 - - [06/Jun/2018:00:02:44 +0200] "GET /build/main.js HTTP/1.1" 200 287069 "http://workoflow.org/" "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36"
        NginxLogLine.Builder otherNginxLogLine = someNginxLogLines.get(1);
        otherNginxLogLine.setHost("workOflow");
        otherNginxLogLine.setClientIP("192.168.99.1");
        otherNginxLogLine.setReferer("");
        otherNginxLogLine.setTimestamp("106/Jun/2018:00:02:44 +0200");
        otherNginxLogLine.setMethod("GET");
        otherNginxLogLine.setUrl("/build/main.js");
        otherNginxLogLine.setProto("HTTP/1.1");
        otherNginxLogLine.setHttpStatus((short) 200);
        otherNginxLogLine.setResponseLen(287069);
        otherNginxLogLine.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36");

        FileOutputStream anOutputStream = null;
        try {
            anOutputStream = new FileOutputStream(theFile);
            org.capnproto.SerializePacked.writeToUnbuffered( anOutputStream.getChannel(), aMessageToWrite);
        }
        finally {
            if( !( anOutputStream == null)) {
                anOutputStream.close();
            }
        }



        // Now READ

        org.capnproto.MessageReader aMessageRead =
                org.capnproto.SerializePacked.readFromUnbuffered(
                        (new FileInputStream(theFile)).getChannel());

        NginxLog.Reader aReadNginxLog = aMessageRead.getRoot(NginxLog.factory);
        for(NginxLogLine.Reader aLine : aReadNginxLog.getLines()) {
            System.out.println("host=" + aLine.getHost());
            System.out.println("clientIP=" + aLine.getClientIP());
            System.out.println("referrer=" + aLine.getReferer());
            System.out.println("timestamp=" + aLine.getTimestamp());
            System.out.println("method=" + aLine.getMethod());
            System.out.println("proto=" + aLine.getProto());
            System.out.println("httpStatus=" + aLine.getHttpStatus());
            System.out.println("responseLen=" + aLine.getResponseLen());
            System.out.println("agent=" + aLine.getAgent());

        }
    }



    public static void printNginxLogLine() throws java.io.IOException {
        org.capnproto.MessageReader message =
                org.capnproto.SerializePacked.readFromUnbuffered(
                        (new FileInputStream(FileDescriptor.in)).getChannel());

    }

    public static void usage() {
        System.out.println("usage: anNginxLogLine [write | read]");
    }

    public static void main(String[] args) {
        System.out.println( "Running:" + MainNginxlogCapnp.class.getCanonicalName());
        try {
            if (args.length < 1) {
                usage();
            } else if (args[0].equals("write")) {
                writeNginxLogLine();
            } else if (args[0].equals("writel")) {
                writeNginxLogLines();
            } else if (args[0].equals("read")) {
                printNginxLogLine();
            } else if (args[0].equals("writeandreads")) {
                File aFile = File.createTempFile("tempfile", ".capnp.nginxlog");
                try {
                    writeAndReadNginxLogLines(aFile);
                } finally {
                    if (!(aFile == null)) {
                        // aFile.delete();
                    }
                }
            } else {
                usage();
            }
        } catch (java.io.IOException e) {
            System.out.println("io exception: " + e);
        }
    }
}
