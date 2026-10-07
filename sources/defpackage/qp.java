package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface qp {
    public static final pp a = new pp();

    default void debugApiRequest(to toVar, op opVar, uo uoVar) {
    }

    default vu8 debugApiResponseFail(to toVar, op opVar, vu8 vu8Var) {
        return vu8Var;
    }

    default vu8 debugApiResponseOk(to toVar, op opVar, vu8 vu8Var) {
        return vu8Var;
    }

    default void debugIoException(to toVar, op opVar, IOException iOException) {
    }
}
