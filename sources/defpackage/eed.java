package defpackage;

import androidx.datastore.preferences.protobuf.d;

/* JADX INFO: loaded from: classes2.dex */
public final class eed extends d {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final eed DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile omc PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        eed eedVar = new eed();
        DEFAULT_INSTANCE = eedVar;
        d.h(eed.class, eedVar);
    }

    public static void i(eed eedVar, long j) {
        eedVar.valueCase_ = 4;
        eedVar.value_ = Long.valueOf(j);
    }

    public static void j(eed eedVar, String str) {
        eedVar.getClass();
        eedVar.valueCase_ = 5;
        eedVar.value_ = str;
    }

    public static void k(eed eedVar, bed bedVar) {
        eedVar.getClass();
        eedVar.value_ = bedVar.a();
        eedVar.valueCase_ = 6;
    }

    public static void l(eed eedVar, double d) {
        eedVar.valueCase_ = 7;
        eedVar.value_ = Double.valueOf(d);
    }

    public static void m(eed eedVar, boolean z) {
        eedVar.valueCase_ = 1;
        eedVar.value_ = Boolean.valueOf(z);
    }

    public static void n(eed eedVar, float f) {
        eedVar.valueCase_ = 2;
        eedVar.value_ = Float.valueOf(f);
    }

    public static void o(eed eedVar, int i) {
        eedVar.valueCase_ = 3;
        eedVar.value_ = Integer.valueOf(i);
    }

    public static eed q() {
        return DEFAULT_INSTANCE;
    }

    public static ded y() {
        return (ded) ((mj7) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.d
    public final Object d(int i) {
        omc nj7Var;
        switch (qt4.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new i5e(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", ced.class});
            case 3:
                return new eed();
            case 4:
                return new ded(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                omc omcVar = PARSER;
                if (omcVar != null) {
                    return omcVar;
                }
                synchronized (eed.class) {
                    try {
                        nj7Var = PARSER;
                        if (nj7Var == null) {
                            nj7Var = new nj7();
                            PARSER = nj7Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return nj7Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double r() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float s() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String v() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final ced w() {
        return this.valueCase_ == 6 ? (ced) this.value_ : ced.j();
    }

    public final int x() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }
}
