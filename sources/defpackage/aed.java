package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.b;
import androidx.datastore.preferences.protobuf.c;
import androidx.datastore.preferences.protobuf.d;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class aed extends d {
    private static final aed DEFAULT_INSTANCE;
    private static volatile omc PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private fm9 preferences_ = fm9.b;

    static {
        aed aedVar = new aed();
        DEFAULT_INSTANCE = aedVar;
        d.h(aed.class, aedVar);
    }

    public static fm9 i(aed aedVar) {
        fm9 fm9Var = aedVar.preferences_;
        if (!fm9Var.a) {
            aedVar.preferences_ = fm9Var.b();
        }
        return aedVar.preferences_;
    }

    public static ydd k() {
        return (ydd) ((mj7) DEFAULT_INSTANCE.d(5));
    }

    public static aed l(FileInputStream fileInputStream) {
        aed aedVar = DEFAULT_INSTANCE;
        b bVar = new b(fileInputStream);
        xh6 xh6VarA = xh6.a();
        d dVar = (d) aedVar.d(4);
        try {
            pwd pwdVar = pwd.c;
            pwdVar.getClass();
            l3f l3fVarA = pwdVar.a(dVar.getClass());
            c cVar = (c) bVar.b;
            if (cVar == null) {
                cVar = new c(bVar);
            }
            l3fVarA.d(dVar, cVar, xh6VarA);
            l3fVarA.a(dVar);
            if (dVar.g()) {
                return (aed) dVar;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
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
                return new i5e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", zdd.a});
            case 3:
                return new aed();
            case 4:
                return new ydd(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                omc omcVar = PARSER;
                if (omcVar != null) {
                    return omcVar;
                }
                synchronized (aed.class) {
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

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
