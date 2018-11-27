package org.capnproto.examples.couplemodels;

public final class CoupleModelsDmesglogLineCapnpCached extends DmesglogLineBean {
    /*
    source @0 :Text;
    level @1 :Text;
    timestamp @2 :Text;
    message @3 :Text;
    */

    private static final int MASK_Source        = 1 << 0;
    private static final int MASK_Level    = 1 << 1;
    private static final int MASK_Timestamp   = 1 << 2;
    private static final int MASK_Message      = 1 << 3;
    

    private CoupleModelsCapnp.DmesgLogLine.Reader dmesgLogLineCapnpReader;

    private int cachedFlags = (short) 0;

    public CoupleModelsDmesglogLineCapnpCached(CoupleModelsCapnp.DmesgLogLine.Reader theDmesgLogLineCapnpReader) {
        this.dmesgLogLineCapnpReader = theDmesgLogLineCapnpReader;
    }

    @Override
    public String getSource() {
        if( (this.cachedFlags & MASK_Source) == 0) {
            this.source = this.dmesgLogLineCapnpReader.getSource().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Source);
        }
        return this.source;
    }

    @Override
    public void setSource(String source) {
        this.source = source;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Source);
    }


    @Override
    public String getLevel() {
        if( (this.cachedFlags & MASK_Level) == 0) {
            this.level = this.dmesgLogLineCapnpReader.getLevel().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Level);
        }
        return this.level;
    }

    @Override
    public void setLevel(String level) {
        this.level = level;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Level);
    }

    @Override
    public String getTimestamp() {
        if( (this.cachedFlags & MASK_Timestamp) == 0) {
            this.timestamp = this.dmesgLogLineCapnpReader.getTimestamp().toString();
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
    public String getMessage() {
        if( (this.cachedFlags & MASK_Message) == 0) {
            this.message = this.dmesgLogLineCapnpReader.getMessage().toString();
            this.cachedFlags = (short) ( this.cachedFlags | MASK_Message);
        }
        return this.message;
    }


    @Override
    public void setMessage(String message) {
        this.message = message;
        this.cachedFlags = (short) ( this.cachedFlags | MASK_Message);
    }


}

