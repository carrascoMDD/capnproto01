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

package org.capnproto.examples.couplemodels;

import org.capnproto.StructList;
import org.capnproto.examples.couplemodels.CoupleModelsCapnp.CoupleModels;
import org.capnproto.examples.couplemodels.CoupleModelsCapnp.LogLine;
import org.capnproto.examples.couplemodels.CoupleModelsCapnp.LogLine.Line;
import org.capnproto.examples.couplemodels.CoupleModelsCapnp.NginxLogLine;
import org.capnproto.examples.couplemodels.CoupleModelsCapnp.DmesgLogLine;

import java.io.*;

public class MainCoupleModelsCapnp {

    public static void writeAndReadNginxLogLines(File theFile) throws IOException {

        org.capnproto.MessageBuilder aMessageToWrite = new org.capnproto.MessageBuilder();
        CoupleModels.Builder aCoupleModels= aMessageToWrite.initRoot(CoupleModels.factory);

        StructList.Builder<LogLine.Builder> someEntries = aCoupleModels.initEntries(4);

        // SpringNut.access.log.43 192.168.69.129 - - [15/Apr/2018:13:01:47 +0200] "GET / HTTP/1.1" 200 2292 "-" "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36"
        LogLine.Builder aLogLine = someEntries.get(0);
        Line.Builder aLine = aLogLine.initLine();
        NginxLogLine.Builder anNginxLogLine = aLine.initNginxLogLine();
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
        LogLine.Builder otherLogLine = someEntries.get(1);
        Line.Builder otherLine = otherLogLine.initLine();
        NginxLogLine.Builder otherNginxLogLine = otherLine.initNginxLogLine();
        otherNginxLogLine.setHost("workOflow");
        otherNginxLogLine.setClientIP("192.168.99.1");
        otherNginxLogLine.setReferer("http://workoflow.org/");
        otherNginxLogLine.setTimestamp("06/Jun/2018:00:02:44 +0200");
        otherNginxLogLine.setMethod("GET");
        otherNginxLogLine.setUrl("/build/main.js");
        otherNginxLogLine.setProto("HTTP/1.1");
        otherNginxLogLine.setHttpStatus((short) 200);
        otherNginxLogLine.setResponseLen(287069);
        otherNginxLogLine.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36");


        // kern  :info  : [dom nov 25 18:10:20 2018] Initializing cgroup subsys cpuacct
        LogLine.Builder anotherLogLine = someEntries.get(2);
        Line.Builder anotherLine = anotherLogLine.initLine();
        DmesgLogLine.Builder aDmesgLogLine = anotherLine.initDmesgLogLine();
        aDmesgLogLine.setSource("kern");
        aDmesgLogLine.setLevel("info");
        aDmesgLogLine.setTimestamp("dom nov 25 18:10:20 2018");
        aDmesgLogLine.setMessage("Initializing cgroup subsys cpuacct");

        //kern  :notice: [dom nov 25 18:10:20 2018] Linux version 3.13.0-162-generic (buildd@lgw01-amd64-035) (gcc version 4.8.4 (Ubuntu 4.8.4-2ubuntu1~14.04.4) ) #212-Ubuntu SMP Mon Oct 29 12:08:50 UTC 2018 (Ubuntu 3.13.0-162.212-generic 3.13.11-ckt39)
        LogLine.Builder yetanotherLogLine = someEntries.get(3);
        Line.Builder yetanotherLine = yetanotherLogLine.initLine();
        DmesgLogLine.Builder otherDmesgLogLine = yetanotherLine.initDmesgLogLine();
        otherDmesgLogLine.setSource("kern");
        otherDmesgLogLine.setLevel("notice");
        otherDmesgLogLine.setTimestamp("dom nov 25 18:10:20 2018");
        otherDmesgLogLine.setMessage("Linux version 3.13.0-162-generic (buildd@lgw01-amd64-035) (gcc version 4.8.4 (Ubuntu 4.8.4-2ubuntu1~14.04.4) ) #212-Ubuntu SMP Mon Oct 29 12:08:50 UTC 2018 (Ubuntu 3.13.0-162.212-generic 3.13.11-ckt39)");


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

        CoupleModels.Reader aReadCoupleModels = aMessageRead.getRoot(CoupleModels.factory);
        for(LogLine.Reader anEntry : aReadCoupleModels.getEntries()) {
            Line.Reader aLineToRead = anEntry.getLine();
            switch( aLine.which()) {
                case NGINX_LOG_LINE:
                    NginxLogLine.Reader anNginxLogLineToRead = aLineToRead.getNginxLogLine();
                    System.out.println("\nNGINX_LOG_LINE");
                    System.out.println("host=" + anNginxLogLineToRead.getHost());
                    System.out.println("clientIP=" + anNginxLogLineToRead.getClientIP());
                    System.out.println("referrer=" + anNginxLogLineToRead.getReferer());
                    System.out.println("timestamp=" + anNginxLogLineToRead.getTimestamp());
                    System.out.println("method=" + anNginxLogLineToRead.getMethod());
                    System.out.println("proto=" + anNginxLogLineToRead.getProto());
                    System.out.println("httpStatus=" + anNginxLogLineToRead.getHttpStatus());
                    System.out.println("responseLen=" + anNginxLogLineToRead.getResponseLen());
                    System.out.println("agent=" + anNginxLogLineToRead.getAgent());
                    break;

                case DMESG_LOG_LINE:
                    System.out.println("\nDMESG_LOG_LINE");
                    DmesgLogLine.Reader anDmesgLogLineToRead = aLineToRead.getDmesgLogLine();
                    System.out.println("source=" + anDmesgLogLineToRead.getSource());
                    System.out.println("level=" + anDmesgLogLineToRead.getLevel());
                    System.out.println("timestamp=" + anDmesgLogLineToRead.getTimestamp());
                    System.out.println("message=" + anDmesgLogLineToRead.getMessage());
                    break;

                case _NOT_IN_SCHEMA:
                    System.out.println("\n_NOT_IN_SCHEMA");
                    break;

                default:
                    System.out.println("\ndefault");

            }
        }
    }



    public static void printNginxLogLine() throws IOException {
        org.capnproto.MessageReader message =
                org.capnproto.SerializePacked.readFromUnbuffered(
                        (new FileInputStream(FileDescriptor.in)).getChannel());

    }

    public static void usage() {
        System.out.println("usage: anNginxLogLine [write | read]");
    }

    public static void main(String[] args) {
        System.out.println( "Running:" + MainCoupleModelsCapnp.class.getCanonicalName());
        try {
            File aFile = File.createTempFile("tempfile", ".capnp.couplemodels");
            try {
                writeAndReadNginxLogLines(aFile);
            } finally {
                if (!(aFile == null)) {
                    // aFile.delete();
                }
            }
        } catch (IOException e) {
            System.out.println("io exception: " + e);
        }
    }
}
