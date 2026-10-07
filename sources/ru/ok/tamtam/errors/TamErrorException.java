package ru.ok.tamtam.errors;

import defpackage.p90;
import defpackage.yhh;
import defpackage.zo5;

/* JADX INFO: loaded from: classes.dex */
public class TamErrorException extends Exception {
    public final yhh a;

    public TamErrorException(yhh yhhVar, String str) {
        super(zo5.p(yhhVar.b, " ", str));
        this.a = yhhVar;
    }

    public static boolean a(Throwable th) {
        return (th instanceof TamErrorException) && p90.C(((TamErrorException) th).a.b);
    }

    public static boolean b(Throwable th) {
        return (th instanceof TamErrorException) && "io.exception".equals(((TamErrorException) th).a.b);
    }

    public TamErrorException(yhh yhhVar) {
        super(yhhVar.b);
        this.a = yhhVar;
    }
}
