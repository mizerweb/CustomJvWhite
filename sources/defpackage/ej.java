package defpackage;

import com.facebook.animated.gif.GifImage;
import com.facebook.animated.webp.WebPImage;

/* JADX INFO: loaded from: classes2.dex */
public final class ej {
    public static final dj a;
    public static final dj b;

    static {
        dj djVar;
        dj djVar2 = null;
        try {
            djVar = (dj) GifImage.class.newInstance();
        } catch (Throwable unused) {
            djVar = null;
        }
        a = djVar;
        try {
            djVar2 = (dj) WebPImage.class.newInstance();
        } catch (Throwable unused2) {
        }
        b = djVar2;
    }

    public ej(rj5 rj5Var, k2d k2dVar, boolean z) {
    }

    public static wt3 a(p76 p76Var, d68 d68Var) {
        dj djVar = a;
        if (djVar == null) {
            c.i("To encode animated gif please add the dependency to the animated-gif module");
            return null;
        }
        au3 au3VarA = au3.A(p76Var.a);
        au3VarA.getClass();
        try {
            cba cbaVar = (cba) au3VarA.K();
            return c(p76Var.j, d68Var, cbaVar.o() != null ? djVar.c(cbaVar.o(), d68Var) : djVar.a(cbaVar.y(), cbaVar.I(), d68Var));
        } finally {
            au3VarA.close();
        }
    }

    public static wt3 b(p76 p76Var, d68 d68Var) {
        dj djVar = b;
        if (djVar == null) {
            c.i("To encode animated webp please add the dependency to the animated-webp module");
            return null;
        }
        au3 au3VarA = au3.A(p76Var.a);
        au3VarA.getClass();
        try {
            cba cbaVar = (cba) au3VarA.K();
            return c(p76Var.j, d68Var, cbaVar.o() != null ? djVar.c(cbaVar.o(), d68Var) : djVar.a(cbaVar.y(), cbaVar.I(), d68Var));
        } finally {
            au3VarA.close();
        }
    }

    public static wt3 c(String str, d68 d68Var, cj cjVar) {
        d68Var.getClass();
        gj gjVar = new gj(cjVar);
        gjVar.b = null;
        gjVar.c = null;
        gjVar.d = str;
        try {
            gj gjVar2 = new gj(gjVar);
            au3.E(gjVar.b);
            gjVar.b = null;
            au3.I(gjVar.c);
            gjVar.c = null;
            wt3 wt3Var = new wt3();
            wt3Var.d = gjVar2;
            wt3Var.e = true;
            return wt3Var;
        } catch (Throwable th) {
            au3.E(gjVar.b);
            gjVar.b = null;
            au3.I(gjVar.c);
            gjVar.c = null;
            throw th;
        }
    }
}
