package org.capnproto.examples.nginxlog;

public final class NginxlogLineCapnpFacade {
    /*
    host @0 :Text;
    clientIP @1 :Text;
    timestamp @2 :Text;
    method @3 :Text;
    url @4 :Text;
    proto @5 :Text;
    httpStatus @6 :Int16;
    responseLen @7 :Int32;
    referer @8 :Text;
    agent @9 :Text;
     */

    private NginxlogCapnp.NginxLogLine.Reader nginxLogLineCapnpReader;


    public NginxlogLineCapnpFacade( NginxlogCapnp.NginxLogLine.Reader theNginxLogLineCapnpReader) {
        this.nginxLogLineCapnpReader = theNginxLogLineCapnpReader;
    }

    public String getHost() {
        return this.nginxLogLineCapnpReader.getHost().toString();
    }

    public String getClientIP() {
        return this.nginxLogLineCapnpReader.getClientIP().toString();
    }

    public String getTimestamp() {
        return this.nginxLogLineCapnpReader.getTimestamp().toString();
    }

    public String getMethod() {
        return this.nginxLogLineCapnpReader.getMethod().toString();
    }

    public String getUrl() {
        return this.nginxLogLineCapnpReader.getUrl().toString();
    }

    public String getProto() {
        return this.nginxLogLineCapnpReader.getProto().toString();
    }

    public short getHttpStatus() {
        return this.nginxLogLineCapnpReader.getHttpStatus();
    }

    public int getResponseLen() {
        return this.nginxLogLineCapnpReader.getResponseLen();
    }

    public String getReferer() {
        return this.nginxLogLineCapnpReader.getReferer().toString();
    }

    public String getAgent() {
        return this.nginxLogLineCapnpReader.getAgent().toString();
    }

}

