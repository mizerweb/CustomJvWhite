package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class x2b implements d8h {
    public final nmc a = new nmc();

    @Override // defpackage.d8h
    public final int F() {
        return 2;
    }

    @Override // defpackage.d8h
    public final void k(byte[] bArr, int i, int i2, c8h c8hVar, qg4 qg4Var) {
        yy4 yy4VarA;
        nmc nmcVar = this.a;
        nmcVar.L(i2 + i, bArr);
        nmcVar.N(i);
        ArrayList arrayList = new ArrayList();
        while (nmcVar.a() > 0) {
            lvb.O("Incomplete Mp4Webvtt Top Level box header found.", nmcVar.a() >= 8);
            int iM = nmcVar.m();
            if (nmcVar.m() == 1987343459) {
                int i3 = iM - 8;
                CharSequence charSequenceF = null;
                xy4 xy4VarB = null;
                while (i3 > 0) {
                    lvb.O("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM2 = nmcVar.m();
                    int iM3 = nmcVar.m();
                    int i4 = iM2 - 8;
                    byte[] bArr2 = nmcVar.a;
                    int i5 = nmcVar.b;
                    String str = vqi.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    nmcVar.O(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM3 == 1937011815) {
                        hfc hfcVar = new hfc();
                        wuj.e(str2, hfcVar);
                        xy4VarB = hfcVar.b();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = wuj.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (xy4VarB != null) {
                    xy4VarB.a = charSequenceF;
                    xy4VarB.b = null;
                    yy4VarA = xy4VarB.a();
                } else {
                    Pattern pattern = wuj.a;
                    hfc hfcVar2 = new hfc();
                    hfcVar2.k = charSequenceF;
                    yy4VarA = hfcVar2.b().a();
                }
                arrayList.add(yy4VarA);
            } else {
                nmcVar.O(iM - 8);
            }
        }
        qg4Var.accept(new bz4(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
