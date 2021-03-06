package org.capnproto.examples.couplemodels;

public final class CoupleModelsNginxlogLineCapnpCached extends NginxlogLineBean {
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

    private static final short MASK_Host        = 1 << 0;
    private static final short MASK_ClientIP    = 1 << 1;
    private static final short MASK_Timestamp   = 1 << 2;
    private static final short MASK_Method      = 1 << 3;
    private static final short MASK_Url         = 1 << 4;
    private static final short MASK_Proto       = 1 << 5;
    private static final short MASK_HttpStatus  = 1 << 6;
    private static final short MASK_ResponseLen = 1 << 7;
    private static final short MASK_Referer     = 1 << 8;
    private static final short MASK_Agent       = 1 << 9;

    private CoupleModelsCapnp.NginxLogLine.Reader nginxLogLineCapnpReader;

    private short cachedFlags = (short) 0;

    public CoupleModelsNginxlogLineCapnpCached(CoupleModelsCapnp.NginxLogLine.Reader theNginxLogLineCapnpReader) {
        this.nginxLogLineCapnpReader = theNginxLogLineCapnpReader;
    }

    @Override
    public String getHost() {
        if( (this.cachedFlags & MASK_Host) == 0) {
            this.host = this.nginxLogLineCapnpReader.getHost().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Host);
        }
        return this.host;
    }

    @Override
    public void setHost(String host) {
        this.host = host;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Host);
    }


    @Override
    public String getClientIP() {
        if( (this.cachedFlags & MASK_ClientIP) == 0) {
            this.clientIP = this.nginxLogLineCapnpReader.getClientIP().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_ClientIP);
        }
        return this.clientIP;
    }

    @Override
    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_ClientIP);
    }

    @Override
    public String getTimestamp() {
        if( (this.cachedFlags & MASK_Timestamp) == 0) {
            this.timestamp = this.nginxLogLineCapnpReader.getTimestamp().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Timestamp);
        }
        return this.timestamp;
    }


    @Override
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Timestamp);
    }


    @Override
    public String getMethod() {
        if( (this.cachedFlags & MASK_Method) == 0) {
            this.method = this.nginxLogLineCapnpReader.getMethod().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Method);
        }
        return this.method;
    }


    @Override
    public void setMethod(String method) {
        this.method = method;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Method);
    }



    @Override
    public String getUrl() {
        if( (this.cachedFlags & MASK_Url) == 0) {
            this.url = this.nginxLogLineCapnpReader.getUrl().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Url);
        }
        return this.url;
    }


    @Override
    public void setUrl(String url) {
        this.url = url;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Url);
    }


    @Override
    public String getProto() {
        if( (this.cachedFlags & MASK_Proto) == 0) {
            this.proto = this.nginxLogLineCapnpReader.getProto().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Proto);
        }
        return this.proto;
    }


    @Override
    public void setProto(String proto) {
        this.proto = proto;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Proto);
    }


    @Override
    public short getHttpStatus() {
        if( (this.cachedFlags & MASK_HttpStatus) == 0) {
            this.httpStatus = this.nginxLogLineCapnpReader.getHttpStatus();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_HttpStatus);
        }
        return this.httpStatus;
    }


    @Override
    public void setHttpStatus(short httpStatus) {
        this.httpStatus = httpStatus;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_HttpStatus);
    }


    @Override
    public int getResponseLen() {
        if( (this.cachedFlags & MASK_ResponseLen) == 0) {
            this.responseLen = this.nginxLogLineCapnpReader.getResponseLen();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_ResponseLen);
        }
        return this.responseLen;
    }


    @Override
    public void setResponseLen(int responseLen) {
        this.responseLen = responseLen;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_ResponseLen);
    }


    @Override
    public String getReferer() {
        if( (this.cachedFlags & MASK_Referer) == 0) {
            this.referer = this.nginxLogLineCapnpReader.getReferer().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Referer);
        }
        return this.referer;
    }


    @Override
    public void setReferer(String referer) {
        this.referer = referer;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Referer);
    }

    @Override
    public String getAgent() {
        if( (this.cachedFlags & MASK_Agent) == 0) {
            this.agent = this.nginxLogLineCapnpReader.getAgent().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Agent);
        }
        return this.agent;
    }


    @Override
    public void setAgent(String agent) {
        this.agent = agent;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Agent);
    }



}

