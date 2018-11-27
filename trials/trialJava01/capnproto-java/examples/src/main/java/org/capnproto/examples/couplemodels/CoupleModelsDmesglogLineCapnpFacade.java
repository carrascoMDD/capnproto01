package org.capnproto.examples.couplemodels;

public final class CoupleModelsDmesglogLineCapnpFacade {
    /*
    source @0 :Text;
    level @1 :Text;
    timestamp @2 :Text;
    message @3 :Text;
     */

    private CoupleModelsCapnp.DmesgLogLine.Reader dmesgLogLineCapnpReader;


    public CoupleModelsDmesglogLineCapnpFacade(CoupleModelsCapnp.DmesgLogLine.Reader theNginxLogLineCapnpReader) {
        this.dmesgLogLineCapnpReader = theNginxLogLineCapnpReader;
    }

    public String getSource() {
        return this.dmesgLogLineCapnpReader.getSource().toString();
    }

    public String getLevel() {
        return this.dmesgLogLineCapnpReader.getLevel().toString();
    }

    public String getTimestamp() {
        return this.dmesgLogLineCapnpReader.getTimestamp().toString();
    }

    public String getMessage() {
        return this.dmesgLogLineCapnpReader.getMessage().toString();
    }

}

