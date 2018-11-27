// Generated by Cap'n Proto compiler, DO NOT EDIT
// source: addressbook.capnp

package org.capnproto.examples.addressbook;

public final class Addressbook {
  public static class Person {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)4);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return Person.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final int getId() {
        return _getIntField(0);
      }
      public final void setId(int value) {
        _setIntField(0, value);
      }

      public final boolean hasName() {
        return !_pointerFieldIsNull(0);
      }
      public final org.capnproto.Text.Builder getName() {
        return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
      }
      public final void setName(org.capnproto.Text.Reader value) {
        _setPointerField(org.capnproto.Text.factory, 0, value);
      }
      public final void setName(String value) {
        _setPointerField(org.capnproto.Text.factory, 0, new org.capnproto.Text.Reader(value));
      }
      public final org.capnproto.Text.Builder initName(int size) {
        return _initPointerField(org.capnproto.Text.factory, 0, size);
      }
      public final boolean hasEmail() {
        return !_pointerFieldIsNull(1);
      }
      public final org.capnproto.Text.Builder getEmail() {
        return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
      }
      public final void setEmail(org.capnproto.Text.Reader value) {
        _setPointerField(org.capnproto.Text.factory, 1, value);
      }
      public final void setEmail(String value) {
        _setPointerField(org.capnproto.Text.factory, 1, new org.capnproto.Text.Reader(value));
      }
      public final org.capnproto.Text.Builder initEmail(int size) {
        return _initPointerField(org.capnproto.Text.factory, 1, size);
      }
      public final boolean hasPhones() {
        return !_pointerFieldIsNull(2);
      }
      public final org.capnproto.StructList.Builder<Addressbook.Person.PhoneNumber.Builder> getPhones() {
        return _getPointerField(Addressbook.Person.PhoneNumber.listFactory, 2, null, 0);
      }
      public final void setPhones(org.capnproto.StructList.Reader<Addressbook.Person.PhoneNumber.Reader> value) {
        _setPointerField(Addressbook.Person.PhoneNumber.listFactory, 2, value);
      }
      public final org.capnproto.StructList.Builder<Addressbook.Person.PhoneNumber.Builder> initPhones(int size) {
        return _initPointerField(Addressbook.Person.PhoneNumber.listFactory, 2, size);
      }
      public final Employment.Builder getEmployment() {
        return new Person.Employment.Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final Employment.Builder initEmployment() {
        _setShortField(2,(short)0);
        _clearPointerField(3);
  return new Person.Employment.Builder(segment, data, pointers, dataSize, pointerCount);
      }

    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public final int getId() {
        return _getIntField(0);
      }

      public boolean hasName() {
        return !_pointerFieldIsNull(0);
      }
      public org.capnproto.Text.Reader getName() {
        return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
      }

      public boolean hasEmail() {
        return !_pointerFieldIsNull(1);
      }
      public org.capnproto.Text.Reader getEmail() {
        return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
      }

      public final boolean hasPhones() {
        return !_pointerFieldIsNull(2);
      }
      public final org.capnproto.StructList.Reader<Addressbook.Person.PhoneNumber.Reader> getPhones() {
        return _getPointerField(Addressbook.Person.PhoneNumber.listFactory, 2, null, 0);
      }

      public Employment.Reader getEmployment() {
        return new Person.Employment.Reader(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

    }

    public static class PhoneNumber {
      public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)1);
      public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
        public Factory() {
        }
        public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
          return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
        }
        public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
          return new Builder(segment, data, pointers, dataSize, pointerCount);
        }
        public final org.capnproto.StructSize structSize() {
          return Person.PhoneNumber.STRUCT_SIZE;
        }
        public final Reader asReader(Builder builder) {
          return builder.asReader();
        }
      }
      public static final Factory factory = new Factory();
      public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
        new org.capnproto.StructList.Factory<Builder, Reader>(factory);
      public static final class Builder extends org.capnproto.StructBuilder {
        Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
          super(segment, data, pointers, dataSize, pointerCount);
        }
        public final Reader asReader() {
          return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
        }
        public final boolean hasNumber() {
          return !_pointerFieldIsNull(0);
        }
        public final org.capnproto.Text.Builder getNumber() {
          return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
        }
        public final void setNumber(org.capnproto.Text.Reader value) {
          _setPointerField(org.capnproto.Text.factory, 0, value);
        }
        public final void setNumber(String value) {
          _setPointerField(org.capnproto.Text.factory, 0, new org.capnproto.Text.Reader(value));
        }
        public final org.capnproto.Text.Builder initNumber(int size) {
          return _initPointerField(org.capnproto.Text.factory, 0, size);
        }
        public final Addressbook.Person.PhoneNumber.Type getType() {
          switch(_getShortField(0)) {
            case 0 : return Addressbook.Person.PhoneNumber.Type.MOBILE;
            case 1 : return Addressbook.Person.PhoneNumber.Type.HOME;
            case 2 : return Addressbook.Person.PhoneNumber.Type.WORK;
            default: return Addressbook.Person.PhoneNumber.Type._NOT_IN_SCHEMA;
          }
        }
        public final void setType(Addressbook.Person.PhoneNumber.Type value) {
          _setShortField(0, (short)value.ordinal());
        }

      }

      public static final class Reader extends org.capnproto.StructReader {
        Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
          super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
        }

        public boolean hasNumber() {
          return !_pointerFieldIsNull(0);
        }
        public org.capnproto.Text.Reader getNumber() {
          return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
        }

        public final Addressbook.Person.PhoneNumber.Type getType() {
          switch(_getShortField(0)) {
            case 0 : return Addressbook.Person.PhoneNumber.Type.MOBILE;
            case 1 : return Addressbook.Person.PhoneNumber.Type.HOME;
            case 2 : return Addressbook.Person.PhoneNumber.Type.WORK;
            default: return Addressbook.Person.PhoneNumber.Type._NOT_IN_SCHEMA;
          }
        }

      }

      public enum Type {
        MOBILE,
        HOME,
        WORK,
        _NOT_IN_SCHEMA,
      }

    }


    public static class Employment {
      public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)4);
      public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
        public Factory() {
        }
        public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
          return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
        }
        public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
          return new Builder(segment, data, pointers, dataSize, pointerCount);
        }
        public final org.capnproto.StructSize structSize() {
          return Person.Employment.STRUCT_SIZE;
        }
        public final Reader asReader(Builder builder) {
          return builder.asReader();
        }
      }
      public static final Factory factory = new Factory();
      public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
        new org.capnproto.StructList.Factory<Builder, Reader>(factory);
      public static final class Builder extends org.capnproto.StructBuilder {
        Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
          super(segment, data, pointers, dataSize, pointerCount);
        }
        public Which which() {
          switch(_getShortField(2)) {
            case 0 : return Which.UNEMPLOYED;
            case 1 : return Which.EMPLOYER;
            case 2 : return Which.SCHOOL;
            case 3 : return Which.SELF_EMPLOYED;
            default: return Which._NOT_IN_SCHEMA;
          }
        }
        public final Reader asReader() {
          return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
        }
        public final boolean isUnemployed() {
          return which() == Person.Employment.Which.UNEMPLOYED;
        }
        public final org.capnproto.Void getUnemployed() {
          assert which() == Person.Employment.Which.UNEMPLOYED:
                      "Must check which() before get()ing a union member.";
          return org.capnproto.Void.VOID;
        }
        public final void setUnemployed(org.capnproto.Void value) {
          _setShortField(2, (short)Person.Employment.Which.UNEMPLOYED.ordinal());
        }

        public final boolean isEmployer() {
          return which() == Person.Employment.Which.EMPLOYER;
        }
        public final boolean hasEmployer() {
          if (which() != Person.Employment.Which.EMPLOYER) return false;
          return !_pointerFieldIsNull(3);
        }
        public final org.capnproto.Text.Builder getEmployer() {
          return _getPointerField(org.capnproto.Text.factory, 3, null, 0, 0);
        }
        public final void setEmployer(org.capnproto.Text.Reader value) {
          _setShortField(2, (short)Person.Employment.Which.EMPLOYER.ordinal());
          _setPointerField(org.capnproto.Text.factory, 3, value);
        }
        public final void setEmployer(String value) {
          _setShortField(2, (short)Person.Employment.Which.EMPLOYER.ordinal());
          _setPointerField(org.capnproto.Text.factory, 3, new org.capnproto.Text.Reader(value));
        }
        public final org.capnproto.Text.Builder initEmployer(int size) {
          _setShortField(2, (short)Person.Employment.Which.EMPLOYER.ordinal());
          return _initPointerField(org.capnproto.Text.factory, 3, size);
        }
        public final boolean isSchool() {
          return which() == Person.Employment.Which.SCHOOL;
        }
        public final boolean hasSchool() {
          if (which() != Person.Employment.Which.SCHOOL) return false;
          return !_pointerFieldIsNull(3);
        }
        public final org.capnproto.Text.Builder getSchool() {
          return _getPointerField(org.capnproto.Text.factory, 3, null, 0, 0);
        }
        public final void setSchool(org.capnproto.Text.Reader value) {
          _setShortField(2, (short)Person.Employment.Which.SCHOOL.ordinal());
          _setPointerField(org.capnproto.Text.factory, 3, value);
        }
        public final void setSchool(String value) {
          _setShortField(2, (short)Person.Employment.Which.SCHOOL.ordinal());
          _setPointerField(org.capnproto.Text.factory, 3, new org.capnproto.Text.Reader(value));
        }
        public final org.capnproto.Text.Builder initSchool(int size) {
          _setShortField(2, (short)Person.Employment.Which.SCHOOL.ordinal());
          return _initPointerField(org.capnproto.Text.factory, 3, size);
        }
        public final boolean isSelfEmployed() {
          return which() == Person.Employment.Which.SELF_EMPLOYED;
        }
        public final org.capnproto.Void getSelfEmployed() {
          assert which() == Person.Employment.Which.SELF_EMPLOYED:
                      "Must check which() before get()ing a union member.";
          return org.capnproto.Void.VOID;
        }
        public final void setSelfEmployed(org.capnproto.Void value) {
          _setShortField(2, (short)Person.Employment.Which.SELF_EMPLOYED.ordinal());
        }

      }

      public static final class Reader extends org.capnproto.StructReader {
        Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
          super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
        }

        public Which which() {
          switch(_getShortField(2)) {
            case 0 : return Which.UNEMPLOYED;
            case 1 : return Which.EMPLOYER;
            case 2 : return Which.SCHOOL;
            case 3 : return Which.SELF_EMPLOYED;
            default: return Which._NOT_IN_SCHEMA;
          }
        }
        public final boolean isUnemployed() {
          return which() == Person.Employment.Which.UNEMPLOYED;
        }
        public final org.capnproto.Void getUnemployed() {
          assert which() == Person.Employment.Which.UNEMPLOYED:
                      "Must check which() before get()ing a union member.";
          return org.capnproto.Void.VOID;
        }

        public final boolean isEmployer() {
          return which() == Person.Employment.Which.EMPLOYER;
        }
        public boolean hasEmployer() {
          if (which() != Person.Employment.Which.EMPLOYER) return false;
          return !_pointerFieldIsNull(3);
        }
        public org.capnproto.Text.Reader getEmployer() {
          return _getPointerField(org.capnproto.Text.factory, 3, null, 0, 0);
        }

        public final boolean isSchool() {
          return which() == Person.Employment.Which.SCHOOL;
        }
        public boolean hasSchool() {
          if (which() != Person.Employment.Which.SCHOOL) return false;
          return !_pointerFieldIsNull(3);
        }
        public org.capnproto.Text.Reader getSchool() {
          return _getPointerField(org.capnproto.Text.factory, 3, null, 0, 0);
        }

        public final boolean isSelfEmployed() {
          return which() == Person.Employment.Which.SELF_EMPLOYED;
        }
        public final org.capnproto.Void getSelfEmployed() {
          assert which() == Person.Employment.Which.SELF_EMPLOYED:
                      "Must check which() before get()ing a union member.";
          return org.capnproto.Void.VOID;
        }

      }

      public enum Which {
        UNEMPLOYED,
        EMPLOYER,
        SCHOOL,
        SELF_EMPLOYED,
        _NOT_IN_SCHEMA,
      }
    }


  }


  public static class AddressBook {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)0,(short)1);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return AddressBook.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final boolean hasPeople() {
        return !_pointerFieldIsNull(0);
      }
      public final org.capnproto.StructList.Builder<Addressbook.Person.Builder> getPeople() {
        return _getPointerField(Addressbook.Person.listFactory, 0, null, 0);
      }
      public final void setPeople(org.capnproto.StructList.Reader<Addressbook.Person.Reader> value) {
        _setPointerField(Addressbook.Person.listFactory, 0, value);
      }
      public final org.capnproto.StructList.Builder<Addressbook.Person.Builder> initPeople(int size) {
        return _initPointerField(Addressbook.Person.listFactory, 0, size);
      }
    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public final boolean hasPeople() {
        return !_pointerFieldIsNull(0);
      }
      public final org.capnproto.StructList.Reader<Addressbook.Person.Reader> getPeople() {
        return _getPointerField(Addressbook.Person.listFactory, 0, null, 0);
      }

    }

  }



public static final class Schemas {
public static final org.capnproto.SegmentReader b_98808e9832e8bc18 =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u0018\u00bc\u00e8\u0032\u0098\u008e\u0080\u0098" +
   "\u0012\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0074\u00e1\u006e\u00f8\u0019\u002e\u00b3\u009e" +
   "\u0004\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00ca\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0017\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u002d\u0000\u0000\u0000\u001f\u0001\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0061\u0064\u0064\u0072\u0065\u0073\u0073\u0062" +
   "\u006f\u006f\u006b\u002e\u0063\u0061\u0070\u006e" +
   "\u0070\u003a\u0050\u0065\u0072\u0073\u006f\u006e" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u00d0\u008a\u009e\u009c\u00b2\u0090\u004e\u0081" +
   "\u0001\u0000\u0000\u0000\u0062\u0000\u0000\u0000" +
   "\u0050\u0068\u006f\u006e\u0065\u004e\u0075\u006d" +
   "\u0062\u0065\u0072\u0000\u0000\u0000\u0000\u0000" +
   "\u0014\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u007d\u0000\u0000\u0000\u001a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0078\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0084\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0081\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u007c\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0088\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0002\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0085\u0000\u0000\u0000\u0032\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0080\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u008c\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0003\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0089\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0084\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u00a0\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u003d\u0069\u00c3\u00bd\u00d4\u002b\u000b\u00bb" +
   "\u009d\u0000\u0000\u0000\u005a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0069\u0064\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0061\u006d\u0065\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0065\u006d\u0061\u0069\u006c\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0070\u0068\u006f\u006e\u0065\u0073\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u00d0\u008a\u009e\u009c\u00b2\u0090\u004e\u0081" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0065\u006d\u0070\u006c\u006f\u0079\u006d\u0065" +
   "\u006e\u0074\u0000\u0000\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_814e90b29c9e8ad0 =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u00d0\u008a\u009e\u009c\u00b2\u0090\u004e\u0081" +
   "\u0019\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0018\u00bc\u00e8\u0032\u0098\u008e\u0080\u0098" +
   "\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u002a\u0001\u0000\u0000" +
   "\u0025\u0000\u0000\u0000\u0017\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u002d\u0000\u0000\u0000\u0077\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0061\u0064\u0064\u0072\u0065\u0073\u0073\u0062" +
   "\u006f\u006f\u006b\u002e\u0063\u0061\u0070\u006e" +
   "\u0070\u003a\u0050\u0065\u0072\u0073\u006f\u006e" +
   "\u002e\u0050\u0068\u006f\u006e\u0065\u004e\u0075" +
   "\u006d\u0062\u0065\u0072\u0000\u0000\u0000\u0000" +
   "\u0004\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u002f\u0006\u0085\u00d5\u0004\u00bd\u00e0\u0091" +
   "\u0001\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
   "\u0054\u0079\u0070\u0065\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0029\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0024\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0030\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u002d\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0028\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0034\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u006e\u0075\u006d\u0062\u0065\u0072\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0074\u0079\u0070\u0065\u0000\u0000\u0000\u0000" +
   "\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u002f\u0006\u0085\u00d5\u0004\u00bd\u00e0\u0091" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000f\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_91e0bd04d585062f =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u002f\u0006\u0085\u00d5\u0004\u00bd\u00e0\u0091" +
   "\u0025\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
   "\u00d0\u008a\u009e\u009c\u00b2\u0090\u004e\u0081" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u0052\u0001\u0000\u0000" +
   "\u0029\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0025\u0000\u0000\u0000\u004f\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0061\u0064\u0064\u0072\u0065\u0073\u0073\u0062" +
   "\u006f\u006f\u006b\u002e\u0063\u0061\u0070\u006e" +
   "\u0070\u003a\u0050\u0065\u0072\u0073\u006f\u006e" +
   "\u002e\u0050\u0068\u006f\u006e\u0065\u004e\u0075" +
   "\u006d\u0062\u0065\u0072\u002e\u0054\u0079\u0070" +
   "\u0065\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u000c\u0000\u0000\u0000\u0001\u0000\u0002\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\r\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006d\u006f\u0062\u0069\u006c\u0065\u0000\u0000" +
   "\u0068\u006f\u006d\u0065\u0000\u0000\u0000\u0000" +
   "\u0077\u006f\u0072\u006b\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_bb0b2bd4bdc3693d =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u003d\u0069\u00c3\u00bd\u00d4\u002b\u000b\u00bb" +
   "\u0019\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0018\u00bc\u00e8\u0032\u0098\u008e\u0080\u0098" +
   "\u0004\u0000\u0007\u0000\u0001\u0000\u0004\u0000" +
   "\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\"\u0001\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u00e7\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0061\u0064\u0064\u0072\u0065\u0073\u0073\u0062" +
   "\u006f\u006f\u006b\u002e\u0063\u0061\u0070\u006e" +
   "\u0070\u003a\u0050\u0065\u0072\u0073\u006f\u006e" +
   "\u002e\u0065\u006d\u0070\u006c\u006f\u0079\u006d" +
   "\u0065\u006e\u0074\u0000\u0000\u0000\u0000\u0000" +
   "\u0010\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0061\u0000\u0000\u0000\u005a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0060\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u006c\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u00fe\u00ff\u0003\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0005\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0069\u0000\u0000\u0000\u004a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0068\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0074\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0002\u0000\u00fd\u00ff\u0003\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0006\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0071\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006c\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0078\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0003\u0000\u00fc\u00ff\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0075\u0000\u0000\u0000\u006a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0074\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0080\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0075\u006e\u0065\u006d\u0070\u006c\u006f\u0079" +
   "\u0065\u0064\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0065\u006d\u0070\u006c\u006f\u0079\u0065\u0072" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0073\u0063\u0068\u006f\u006f\u006c\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0073\u0065\u006c\u0066\u0045\u006d\u0070\u006c" +
   "\u006f\u0079\u0065\u0064\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_f934d9b354a8a134 =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u0034\u00a1\u00a8\u0054\u00b3\u00d9\u0034\u00f9" +
   "\u0012\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
   "\u0074\u00e1\u006e\u00f8\u0019\u002e\u00b3\u009e" +
   "\u0001\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00f2\u0000\u0000\u0000" +
   "\u0021\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u003f\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0061\u0064\u0064\u0072\u0065\u0073\u0073\u0062" +
   "\u006f\u006f\u006b\u002e\u0063\u0061\u0070\u006e" +
   "\u0070\u003a\u0041\u0064\u0064\u0072\u0065\u0073" +
   "\u0073\u0042\u006f\u006f\u006b\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0004\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\r\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0024\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0070\u0065\u006f\u0070\u006c\u0065\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0018\u00bc\u00e8\u0032\u0098\u008e\u0080\u0098" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000e\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
}
}
