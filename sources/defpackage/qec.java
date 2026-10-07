package defpackage;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qec extends ve5 {
    public final ks6 l;

    public qec(Context context, ks6 ks6Var, z55 z55Var) {
        c79 c79VarW = yab.w();
        if (z55Var.b) {
            c79VarW.add("video/av01");
        }
        if (z55Var.a) {
            c79VarW.add("video/x-vnd.on2.vp9");
        }
        c79VarW.add("video/avc");
        c79 c79VarJ = yab.j(c79VarW);
        c79 c79VarW2 = yab.w();
        if (z55Var.c) {
            c79VarW2.add("audio/opus");
        }
        c79VarW2.add("audio/mp4a-latm");
        c79VarW2.add("audio/mp4");
        c79 c79VarJ2 = yab.j(c79VarW2);
        oe5 oe5Var = new oe5();
        String[] strArr = (String[]) c79VarJ.toArray(new String[0]);
        oe5Var.m = c98.o((String[]) Arrays.copyOf(strArr, strArr.length));
        String[] strArr2 = (String[]) c79VarJ2.toArray(new String[0]);
        oe5Var.v = c98.o((String[]) Arrays.copyOf(strArr2, strArr2.length));
        super(new pe5(oe5Var), ks6Var, context);
        this.l = ks6Var;
    }
}
