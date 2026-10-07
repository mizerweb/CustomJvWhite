package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.messages.c;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class a50 {
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ifh s;
    public final ifh t = new ifh(new qo7(15, this));

    public a50(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18) {
        this.a = context;
        this.b = ny8Var;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var2;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = ny8Var9;
        this.k = ny8Var13;
        this.l = ny8Var14;
        this.m = ny8Var10;
        this.n = ny8Var11;
        this.o = ny8Var12;
        this.p = ny8Var16;
        this.q = ny8Var17;
        this.r = ny8Var18;
        this.s = new ifh(new w40(ny8Var15, 0));
    }

    public static oji h(e70 e70Var) {
        y60 y60Var = e70Var.a;
        int i = y60Var == null ? -1 : x40.$EnumSwitchMapping$2[y60Var.ordinal()];
        if (i == 1) {
            return e70Var.d.b == 2 ? oji.VIDEO_MESSAGE : oji.VIDEO;
        }
        if (i == 2) {
            return oji.PHOTO;
        }
        if (i != 3) {
            return null;
        }
        return oji.FILE;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0259  */
    /* JADX WARN: Code duplicated, block: B:106:0x025f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0269  */
    /* JADX WARN: Code duplicated, block: B:112:0x0270  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:155:0x035b  */
    /* JADX WARN: Code duplicated, block: B:233:0x04ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:234:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:236:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:238:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:239:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:241:0x04da  */
    /* JADX WARN: Code duplicated, block: B:242:0x04de  */
    /* JADX WARN: Code duplicated, block: B:243:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:246:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:248:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:250:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:252:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:253:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:255:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:256:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:258:0x0503  */
    /* JADX WARN: Code duplicated, block: B:260:0x050a  */
    /* JADX WARN: Code duplicated, block: B:264:0x051e  */
    /* JADX WARN: Code duplicated, block: B:267:0x0542  */
    /* JADX WARN: Code duplicated, block: B:268:0x054d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0551  */
    /* JADX WARN: Code duplicated, block: B:271:0x055c  */
    /* JADX WARN: Code duplicated, block: B:349:0x06e4 A[PHI: r53 r54
  0x06e4: PHI (r53v1 c46) = (r53v0 c46), (r53v0 c46), (r53v0 c46), (r53v0 c46), (r53v3 c46), (r53v3 c46), (r53v3 c46), (r53v4 c46) binds: [B:600:0x0c49, B:669:0x0e78, B:614:0x0cf4, B:613:0x0cef, B:593:0x0c1d, B:420:0x0884, B:423:0x0894, B:348:0x06e0] A[DONT_GENERATE, DONT_INLINE]
  0x06e4: PHI (r54v1 long) = (r54v0 long), (r54v0 long), (r54v0 long), (r54v0 long), (r54v3 long), (r54v3 long), (r54v3 long), (r54v4 long) binds: [B:600:0x0c49, B:669:0x0e78, B:614:0x0cf4, B:613:0x0cef, B:593:0x0c1d, B:420:0x0884, B:423:0x0894, B:348:0x06e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:447:0x0901  */
    /* JADX WARN: Code duplicated, block: B:451:0x090b  */
    /* JADX WARN: Code duplicated, block: B:453:0x090e  */
    /* JADX WARN: Code duplicated, block: B:456:0x091a  */
    /* JADX WARN: Code duplicated, block: B:458:0x091d  */
    /* JADX WARN: Code duplicated, block: B:459:0x0922  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:464:0x0930  */
    /* JADX WARN: Code duplicated, block: B:466:0x0936  */
    /* JADX WARN: Code duplicated, block: B:472:0x0948  */
    /* JADX WARN: Code duplicated, block: B:473:0x094a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:474:0x094c  */
    /* JADX WARN: Code duplicated, block: B:486:0x099d  */
    /* JADX WARN: Code duplicated, block: B:487:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:561:0x0b36 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:562:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:563:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:565:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:567:0x0b44 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:568:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:569:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:56:0x0129  */
    /* JADX WARN: Code duplicated, block: B:572:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:574:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:577:0x0b86  */
    /* JADX WARN: Code duplicated, block: B:578:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:581:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:582:0x0ba3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:584:0x0ba6  */
    /* JADX WARN: Code duplicated, block: B:599:0x0c45  */
    /* JADX WARN: Code duplicated, block: B:602:0x0c4d  */
    /* JADX WARN: Code duplicated, block: B:604:0x0c54  */
    /* JADX WARN: Code duplicated, block: B:606:0x0c5b  */
    /* JADX WARN: Code duplicated, block: B:608:0x0c61  */
    /* JADX WARN: Code duplicated, block: B:609:0x0ca8  */
    /* JADX WARN: Code duplicated, block: B:611:0x0cac  */
    /* JADX WARN: Code duplicated, block: B:613:0x0cef  */
    /* JADX WARN: Code duplicated, block: B:614:0x0cf4  */
    /* JADX WARN: Code duplicated, block: B:615:0x0cf9  */
    /* JADX WARN: Code duplicated, block: B:617:0x0d12  */
    /* JADX WARN: Code duplicated, block: B:619:0x0d18  */
    /* JADX WARN: Code duplicated, block: B:621:0x0d1d  */
    /* JADX WARN: Code duplicated, block: B:623:0x0d27  */
    /* JADX WARN: Code duplicated, block: B:625:0x0d2b  */
    /* JADX WARN: Code duplicated, block: B:627:0x0d3c  */
    /* JADX WARN: Code duplicated, block: B:628:0x0d4a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:629:0x0d4c  */
    /* JADX WARN: Code duplicated, block: B:630:0x0d72  */
    /* JADX WARN: Code duplicated, block: B:633:0x0d7e  */
    /* JADX WARN: Code duplicated, block: B:635:0x0d91 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:659:0x0e38  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:662:0x0e4d  */
    /* JADX WARN: Code duplicated, block: B:664:0x0e57  */
    /* JADX WARN: Code duplicated, block: B:665:0x0e62  */
    /* JADX WARN: Code duplicated, block: B:667:0x0e66  */
    /* JADX WARN: Code duplicated, block: B:672:0x0ea8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:684:0x0e7d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x0e78 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0156  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0184  */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01da  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f9 A[PHI: r12
  0x01f9: PHI (r12v65 java.lang.CharSequence) = (r12v64 java.lang.CharSequence), (r12v67 java.lang.CharSequence) binds: [B:87:0x0206, B:82:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0215  */
    /* JADX WARN: Code duplicated, block: B:95:0x023b  */
    /* JADX WARN: Code duplicated, block: B:97:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x024a  */
    public final Object a(mm9 mm9Var, n11 n11Var, c cVar, c7k c7kVar, nq4 nq4Var) {
        y40 y40Var;
        c46 c46Var;
        String str;
        boolean z;
        boolean z2;
        long jB;
        CharSequence charSequence;
        ny8 ny8Var;
        ny8 ny8Var2;
        ny8 ny8Var3;
        rt2 rt2Var;
        c46 c46Var2;
        t50 eagVar;
        ArrayList arrayList;
        u8b u8bVar;
        int i;
        int i2;
        float[] fArrQ1;
        ArrayList arrayList2;
        Iterator it;
        yu3 yu3Var;
        float fB;
        t50 yv3Var;
        e70 e70VarH;
        o60 o60Var;
        String str2;
        y60 y60Var;
        d70 d70Var;
        o60 o60Var2;
        e70 e70Var;
        u4a u4aVar;
        ny8 ny8Var4;
        String str3;
        File file;
        e70 e70VarH2;
        String str4;
        d70 d70Var2;
        o60 o60Var3;
        t50 plgVar;
        long j;
        long j2;
        oji ojiVar;
        g58 g58Var;
        int i3;
        o60 o60Var4;
        long j3;
        long j4;
        p5e k5eVar;
        Object next;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        dea deaVar;
        int i10;
        int i11;
        g58 g58Var2;
        long j5;
        int iK;
        int i12;
        String str5;
        File file2;
        String strB;
        String strD;
        Uri uriB;
        bne bneVarA;
        e70 e70VarH3;
        b60 b60Var;
        Object objK;
        i1i i1iVar;
        int i13;
        Object poeVar;
        int i14;
        g58 g58VarA;
        t50 mxfVar;
        String strB2;
        boolean z3;
        int i15;
        int iD;
        int i16;
        int iD2;
        long jV;
        Drawable drawable;
        Drawable drawable2;
        t50 jh4Var;
        e70 e70VarL;
        c46 c46Var3;
        long j6;
        String string;
        int i17;
        String strA;
        c46 c46Var4;
        e70 e70VarK;
        d70 d70Var3;
        oji ojiVarH;
        int i18;
        p5e k5eVar2;
        CharSequence charSequenceK;
        CharSequence string2;
        i1i i1iVar2;
        int i19;
        i1i i1iVar3;
        n1i n1iVarT;
        int i20;
        mm9 mm9Var2 = mm9Var;
        m1i m1iVar = m1i.a;
        l1i l1iVar = l1i.a;
        x60 x60Var = x60.c;
        if (nq4Var instanceof y40) {
            y40Var = (y40) nq4Var;
            int i21 = y40Var.h;
            if ((i21 & Integer.MIN_VALUE) != 0) {
                y40Var.h = i21 - Integer.MIN_VALUE;
            } else {
                y40Var = new y40(this, nq4Var);
            }
        } else {
            y40Var = new y40(this, nq4Var);
        }
        Object obj = y40Var.f;
        Object obj2 = hu4.a;
        int i22 = y40Var.h;
        if (i22 == 0) {
            ch3.d0(obj);
            c46Var = mm9Var2.b().n;
            if (c46Var == null) {
                return u40.d;
            }
            sfa sfaVarB = mm9Var2.b();
            y60 y60Var2 = y60.c;
            boolean zB = sfaVarB.B(y60Var2);
            sfa sfaVarB2 = mm9Var2.b();
            y60 y60Var3 = y60.d;
            boolean zB2 = sfaVarB2.B(y60Var3);
            boolean zJ = mm9Var2.b().J();
            boolean zI = mm9Var2.b().I();
            if (mm9Var2.b().S()) {
                e5d e5dVar = (e5d) this.n.getValue();
                o5d o5dVarU = mm9Var2.b().u();
                boolean z4 = e5dVar.v(o5dVarU != null ? new Integer(o5dVarU.f) : null);
                boolean zBooleanValue = ((Boolean) ((e5d) this.n.getValue()).B().i()).booleanValue();
                boolean z5 = z4;
                boolean zB3 = mm9Var2.b().B(y60.p);
                boolean z6 = (z5 && mm9Var2.b().S()) || (((str = mm9Var2.b().g) == null || str.length() == 0) && mm9Var2.b().Y());
                int i23 = v40.b;
                if (((kg8) c46Var.b) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (((kke) c46Var.c) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jB = mvk.b(z6, zB, z, z2);
                charSequence = "";
                if (zI) {
                    c46Var4 = mm9Var2.b().n;
                    if (c46Var4 != null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    if (c46Var4.i() == 1 || (e70VarK = mm9Var2.b().k(y60Var3)) == null || (d70Var3 = e70VarK.d) == null) {
                        jh4Var = null;
                    } else {
                        ojiVarH = h(e70VarK);
                        u60 u60Var = e70VarK.q;
                        i18 = u60Var != null ? x40.$EnumSwitchMapping$0[u60Var.ordinal()] : -1;
                        if (i18 != 1) {
                            if (i18 != 2) {
                                k5eVar2 = new l5e(mm9Var2.b().a, e70VarK.w, e70VarK.t, ojiVarH);
                            } else {
                                k5eVar2 = new n5e(mm9Var2.b().a, e70VarK.w, e70VarK.t, ojiVarH);
                            }
                        } else if (d70Var3.a == 0) {
                            k5eVar2 = new o5e(mm9Var2.b().a, e70VarK.w, e70VarK.s, e70VarK.t, ojiVarH);
                        } else {
                            k5eVar2 = new k5e(mm9Var2.b().a, e70VarK.w, e70VarK.s, e70VarK.x, null, null, e70VarK.t, ojiVarH);
                        }
                        h50 h50VarB = d().b(k5eVar2);
                        if (mm9Var2.e().f) {
                            string2 = this.a.getString(R.string.chat_screen_message_audio_sender_self);
                        } else {
                            if (mm9Var2.b().J == 4) {
                                rt2 rt2Var2 = mm9Var2.a;
                                rt2Var2.K0();
                                charSequenceK = rt2Var2.j;
                                if (charSequenceK != null) {
                                    charSequence = charSequenceK;
                                }
                            } else {
                                charSequenceK = mm9Var2.e().k();
                                if (charSequenceK != null) {
                                    charSequence = charSequenceK;
                                }
                            }
                            string2 = charSequence;
                        }
                        if (((f5d) e()).D()) {
                            String str6 = d70Var3.u;
                            if (d70Var3.v == x60Var || str6 == null) {
                                i1iVar3 = null;
                            } else {
                                i1iVar3 = new i1i(((mea) this.j.getValue()).f(mm9Var2.a(), str6), !r5h.X0(str6));
                            }
                            if (c7kVar != null) {
                                n1iVarT = c7kVar.t(mm9Var2.b().a);
                            } else {
                                n1iVarT = null;
                            }
                            if (!cqk.d(n1iVarT, l1iVar) && d70Var3.v == x60Var) {
                                i20 = 2;
                            } else if (!cqk.d(n1iVarT, l1iVar) || cqk.d(n1iVarT, m1iVar)) {
                                i20 = 3;
                            } else {
                                i20 = 1;
                            }
                            i1iVar2 = i1iVar3;
                            i19 = i20;
                        } else {
                            i1iVar2 = null;
                            i19 = 0;
                        }
                        jh4Var = new oxi(mm9Var2.b().a, e70VarK.t, ((gti) this.l.getValue()).a(d70Var3, e70VarK, e70VarK.t), d().a(mm9Var2.b().a, h50VarB), ((d0j) this.i.getValue()).j, string2, i1iVar2, i19, ((f5d) e()).D());
                    }
                    plgVar = jh4Var;
                } else if (!zB || zB2) {
                    c46Var = c46Var;
                    jB = jB;
                    ny8Var = this.k;
                    ny8Var2 = this.g;
                    ny8Var3 = this.l;
                    sfa sfaVarB3 = mm9Var2.b();
                    rt2Var = mm9Var2.a;
                    c46Var2 = sfaVarB3.n;
                    if (c46Var2 == null) {
                        ore.p("Required value was null.");
                        eagVar = null;
                    } else if (c46Var2.i() == 0) {
                        eagVar = null;
                    } else if (c46Var2.i() == 1) {
                        e70VarH2 = c46Var2.h(0);
                        if (e70VarH2 != null) {
                            str4 = e70VarH2.t;
                            d70Var2 = e70VarH2.d;
                            if (d70Var2 != null) {
                                eagVar = new eag(mm9Var2.b().a, str4, ((gti) ny8Var3.getValue()).a(d70Var2, e70VarH2, str4), d().a(mm9Var2.b().a, c(e70VarH2, mm9Var2.b().a)), g(mm9Var), !((u4a) ny8Var2.getValue()).d());
                            } else {
                                o60Var3 = e70VarH2.b;
                                if (o60Var3 != null) {
                                    yv3Var = new h8g(mm9Var2.b().a, str4, ((quc) ny8Var.getValue()).a(o60Var3, e70VarH2, n11Var, rt2Var.A(), mm9Var2.b().b), d().a(mm9Var2.b().a, c(e70VarH2, mm9Var2.b().a)), g(mm9Var));
                                    eagVar = yv3Var;
                                } else {
                                    ore.p("Required value was null.");
                                }
                            }
                        } else {
                            ore.p("Required value was null.");
                        }
                        eagVar = null;
                    } else {
                        arrayList = new ArrayList(c46Var2.i());
                        u8bVar = new u8b(c46Var2.i());
                        i = c46Var2.i();
                        i2 = 0;
                        while (i2 < i) {
                            e70VarH = c46Var2.h(i2);
                            if (e70VarH == null) {
                                ny8Var4 = ny8Var;
                                ny8Var2 = ny8Var2;
                            } else {
                                o60Var = e70VarH.b;
                                str2 = e70VarH.t;
                                y60Var = e70VarH.a;
                                if (y60Var != y60.c || y60Var == y60.d) {
                                    u8bVar.b(c(e70VarH, mm9Var2.b().a));
                                    d70Var = e70VarH.d;
                                    if (d70Var != null) {
                                        arrayList.add(((gti) ny8Var3.getValue()).a(d70Var, e70VarH, str2));
                                    } else {
                                        if (o60Var != null) {
                                            g58 g58VarA2 = ((quc) ny8Var.getValue()).a(o60Var, e70VarH, n11Var, rt2Var.A(), mm9Var2.b().b);
                                            o60Var2 = o60Var;
                                            e70Var = e70VarH;
                                            arrayList.add(g58VarA2);
                                        } else {
                                            o60Var2 = o60Var;
                                            e70Var = e70VarH;
                                        }
                                        u4aVar = (u4a) ny8Var2.getValue();
                                        if (u4aVar.a) {
                                            ny8Var4 = ny8Var;
                                            if (!u4aVar.b().c.d.getBoolean("app.media.autoplay.gif", true) && o60Var2 != null && (str3 = o60Var2.j) != null && str3.length() > 0) {
                                                u60 u60Var2 = e70Var.q;
                                                u60Var2.getClass();
                                                if (u60Var2 == u60.a || u60Var2 == u60.d) {
                                                    str3 = str3;
                                                    ny8Var2 = ny8Var2;
                                                } else {
                                                    if (u60Var2.h()) {
                                                        rs6 rs6Var = (rs6) this.b.getValue();
                                                        long j7 = o60Var2.i;
                                                        ju6 ju6Var = (ju6) rs6Var;
                                                        ju6Var.getClass();
                                                        file = new File(ju6.j(ju6Var.b(), "gifCache"), zo5.j(j7, "gif_"));
                                                    } else {
                                                        file = null;
                                                    }
                                                    if (file == null || !file.exists()) {
                                                    }
                                                }
                                                ((wp6) this.c.getValue()).b(new pjh(mm9Var.b().a, str2, 0L, 0L, o60Var2.i, 0L, str3, true, false, 0L, "", 0, false, false, ns5.AUTOLOAD, null));
                                            }
                                        }
                                        ny8Var2 = ny8Var2;
                                    }
                                    ny8Var4 = ny8Var;
                                    ny8Var2 = ny8Var2;
                                } else {
                                    ny8Var4 = ny8Var;
                                    ny8Var2 = ny8Var2;
                                }
                            }
                            i2++;
                            mm9Var2 = mm9Var;
                            ny8Var2 = ny8Var2;
                            ny8Var = ny8Var4;
                        }
                        fArrQ1 = new float[0];
                        if (arrayList.size() > 1) {
                            arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    yu3Var = (yu3) it.next();
                                    if (yu3Var instanceof g58) {
                                        g58 g58Var3 = (g58) yu3Var;
                                        fB = b(g58Var3.c, g58Var3.d);
                                    } else if (yu3Var instanceof fti) {
                                        fti ftiVar = (fti) yu3Var;
                                        fB = b(ftiVar.c, ftiVar.d);
                                    } else {
                                        ore.o();
                                        eagVar = null;
                                    }
                                    arrayList2.add(Float.valueOf(fB));
                                } else {
                                    fArrQ1 = ww3.Q1(arrayList2);
                                }
                            }
                        }
                        float[] fArr = fArrQ1;
                        boolean zG = g(mm9Var);
                        o50 o50VarD = d();
                        yv3Var = new yv3(fArr, arrayList, e9i.G0(new n50(o50VarD.f, mm9Var.b().a, 0), o50VarD.d, j0g.a, null), u8bVar, zG);
                        eagVar = yv3Var;
                    }
                    plgVar = eagVar;
                    c46Var = c46Var;
                    jB = jB;
                } else {
                    if (mm9Var2.b().K()) {
                        Context context = this.a;
                        sfa sfaVarB4 = mm9Var2.b();
                        rt2 rt2Var3 = mm9Var2.a;
                        e60 e60VarO = sfaVarB4.o();
                        if (e60VarO == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        long j8 = e60VarO.e;
                        vg4 vg4VarW = rt2Var3.w();
                        boolean z7 = mm9Var2.e().f;
                        boolean z8 = !z7;
                        boolean z9 = !z7 && (e60VarO.i() || e60VarO.g() || e60VarO.j());
                        boolean z10 = z7 && (e60VarO.j() || e60VarO.g());
                        if (vg4VarW == null) {
                            string = context.getString(R.string.chat_screen_message_group_call_title);
                        } else if (z10) {
                            string = context.getString(R.string.chat_screen_message_call_title_reject);
                        } else if (z9) {
                            string = context.getString(R.string.chat_screen_message_call_title_missed);
                        } else {
                            string = !z7 ? context.getString(R.string.chat_screen_message_call_title_incoming) : context.getString(R.string.chat_screen_message_call_title_outgoing);
                        }
                        String str7 = string;
                        int i24 = R.drawable.icon_call_missed_fill;
                        if (z10) {
                            if (e60VarO.k()) {
                                i24 = R.drawable.icon_video_call_missed_fill;
                            }
                        } else if (z9) {
                            if (e60VarO.k()) {
                                i24 = R.drawable.icon_video_call_missed_fill;
                            }
                        } else if (z7) {
                            i24 = e60VarO.k() ? R.drawable.icon_video_call_outgoing_fill : R.drawable.icon_call_outgoing_fill;
                        } else {
                            i24 = e60VarO.k() ? R.drawable.icon_video_call_incoming_fill : R.drawable.icon_call_incoming_fill;
                        }
                        if (vg4VarW == null) {
                            i17 = R.string.chat_screen_message_group_call;
                        } else {
                            i17 = e60VarO.k() ? R.string.chat_screen_message_call_subtitle_video : R.string.chat_screen_message_call_subtitle_audio;
                        }
                        Long lValueOf = Long.valueOf(j8);
                        if (j8 == 0) {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            String[] strArr = woh.b;
                            strA = mxl.a(j8);
                        } else {
                            strA = null;
                        }
                        mxfVar = new yb1(str7, r5h.y1(context.getString(i17)).toString(), strA == null ? "" : strA, z9, context.getDrawable(i24), vg4VarW != null ? new vb1(vg4VarW.v(), e60VarO.k()) : new ub1(rt2Var3.A(), e60VarO.b, e60VarO.k()), z8);
                    } else if (mm9Var2.b().Q()) {
                        y40Var.d = c46Var;
                        y40Var.e = jB;
                        y40Var.h = 1;
                        Object objF = f(mm9Var2, y40Var);
                        if (objF == obj2) {
                            return obj2;
                        }
                        c46Var3 = c46Var;
                        obj = objF;
                        j6 = jB;
                    } else if (mm9Var2.b().W()) {
                        w60 w60VarW = mm9Var2.b().w();
                        if (w60VarW == null) {
                            plgVar = null;
                        } else {
                            c46 c46Var5 = mm9Var2.b().n;
                            boolean z11 = (c46Var5 == null || (e70VarL = c46Var5.l(y60.f)) == null) ? false : e70VarL.v;
                            long j9 = w60VarW.a;
                            long j10 = w60VarW.k;
                            plgVar = new plg(new tlg(j9, j10, j10, w60VarW.f(), w60VarW.l, w60VarW.o, w60VarW.c, w60VarW.d, false, false, 0L, 0, 15936), z11);
                        }
                    } else if (mm9Var2.b().L()) {
                        Integer numValueOf = Integer.valueOf(R.drawable.icon_comment_fill);
                        Integer numValueOf2 = Integer.valueOf(R.drawable.icon_phone_book_fill);
                        Context context2 = this.a;
                        f60 f60VarP = mm9Var2.b().p();
                        if (f60VarP == null) {
                            jh4Var = null;
                        } else {
                            vg4 vg4VarB = ((ih4) this.e.getValue()).b(f60VarP);
                            if (vg4VarB != null) {
                                z3 = true;
                                if (vg4VarB.f) {
                                    i15 = 1;
                                }
                                iD = qt4.D(i15);
                                if (iD != 0) {
                                    i16 = R.string.chat_screen_message_contact_subtitle_you;
                                } else if (iD != z3) {
                                    i16 = R.string.chat_screen_message_contact_subtitle_added;
                                } else if (iD != 2) {
                                    i16 = R.string.chat_screen_message_contact_subtitle_new;
                                } else {
                                    if (iD == 3) {
                                        ore.o();
                                        return null;
                                    }
                                    i16 = R.string.chat_screen_message_contact_subtitle_phone_book;
                                }
                                iD2 = qt4.D(i15);
                                if (iD2 != 0) {
                                    numValueOf = null;
                                    numValueOf2 = null;
                                } else if (iD2 != 1) {
                                    numValueOf2 = null;
                                } else if (iD2 != 2) {
                                    if (iD2 == 3) {
                                        ore.o();
                                        return null;
                                    }
                                    numValueOf = null;
                                }
                                if (vg4VarB != null) {
                                    jV = vg4VarB.v();
                                } else {
                                    jV = f60VarP.b;
                                }
                                long j11 = jV;
                                String strD2 = ((ih4) this.e.getValue()).d(f60VarP);
                                String str8 = f60VarP.f;
                                String string3 = (str8 != null ? str8 : "").toString();
                                String strA2 = ((ih4) this.e.getValue()).a(vg4VarB, f60VarP);
                                CharSequence charSequenceC = ((ih4) this.e.getValue()).c(f60VarP);
                                String string4 = context2.getString(i16);
                                if (numValueOf2 != null) {
                                    drawable = context2.getDrawable(numValueOf2.intValue());
                                } else {
                                    drawable = null;
                                }
                                if (numValueOf != null) {
                                    drawable2 = context2.getDrawable(numValueOf.intValue());
                                } else {
                                    drawable2 = null;
                                }
                                jh4Var = new jh4(j11, strD2, string3, strA2, charSequenceC, i15, string4, drawable, drawable2, mm9Var2.b().a);
                            } else {
                                z3 = true;
                            }
                            if (vg4VarB == null || vg4VarB.h() != z3) {
                                i15 = vg4VarB != null ? 3 : 4;
                            } else {
                                i15 = 2;
                            }
                            iD = qt4.D(i15);
                            if (iD != 0) {
                                i16 = R.string.chat_screen_message_contact_subtitle_you;
                            } else if (iD != z3) {
                                i16 = R.string.chat_screen_message_contact_subtitle_added;
                            } else if (iD != 2) {
                                i16 = R.string.chat_screen_message_contact_subtitle_new;
                            } else {
                                if (iD == 3) {
                                    ore.o();
                                    return null;
                                }
                                i16 = R.string.chat_screen_message_contact_subtitle_phone_book;
                            }
                            iD2 = qt4.D(i15);
                            if (iD2 != 0) {
                                numValueOf = null;
                                numValueOf2 = null;
                            } else if (iD2 != 1) {
                                numValueOf2 = null;
                            } else if (iD2 != 2) {
                                if (iD2 == 3) {
                                    ore.o();
                                    return null;
                                }
                                numValueOf = null;
                            }
                            if (vg4VarB != null) {
                                jV = vg4VarB.v();
                            } else {
                                jV = f60VarP.b;
                            }
                            long j12 = jV;
                            String strD3 = ((ih4) this.e.getValue()).d(f60VarP);
                            String str9 = f60VarP.f;
                            String string5 = (str9 != null ? str9 : "").toString();
                            String strA3 = ((ih4) this.e.getValue()).a(vg4VarB, f60VarP);
                            CharSequence charSequenceC2 = ((ih4) this.e.getValue()).c(f60VarP);
                            String string6 = context2.getString(i16);
                            if (numValueOf2 != null) {
                                drawable = context2.getDrawable(numValueOf2.intValue());
                            } else {
                                drawable = null;
                            }
                            if (numValueOf != null) {
                                drawable2 = context2.getDrawable(numValueOf.intValue());
                            } else {
                                drawable2 = null;
                            }
                            jh4Var = new jh4(j12, strD3, string5, strA3, charSequenceC2, i15, string6, drawable, drawable2, mm9Var2.b().a);
                        }
                        plgVar = jh4Var;
                    } else if (mm9Var2.b().V()) {
                        t60 t60VarV = mm9Var2.b().v();
                        if (t60VarV == null) {
                            String name = mm9.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, name, zo5.j(mm9Var2.b().a, "Message has attach type SHARE but don't have share object, mId:"), null);
                                }
                            }
                        } else if (n11Var.b || !((((nni) this.o.getValue()).m() && t60VarV.i) || t60VarV.j())) {
                            e70 e70VarK2 = mm9Var2.b().k(y60.g);
                            o60 o60Var5 = t60VarV.f;
                            if (o60Var5 != null) {
                                g58VarA = e70VarK2 == null ? null : ((quc) this.k.getValue()).a(o60Var5, e70VarK2, n11Var, mm9Var2.a.A(), mm9Var2.b().b);
                            } else {
                                g58VarA = null;
                            }
                            long j13 = t60VarV.a;
                            String str10 = t60VarV.b;
                            String strB3 = t60VarV.b();
                            String str11 = t60VarV.e;
                            String str12 = (str11 == null || str11.length() == 0) ? null : str11;
                            String str13 = t60VarV.c;
                            String str14 = (str13 == null || str13.length() == 0) ? null : str13;
                            String str15 = t60VarV.d;
                            mxfVar = new mxf(j13, str10, str12, str14, (str15 == null || str15.length() == 0) ? null : str15, strB3, g58VarA, mm9Var2.b().a, e70VarK2 != 0 ? e70VarK2.t : null, t60VarV.i, ((f5d) e()).g() && (strB2 = t60VarV.b()) != null && z5h.K0(strB2, (String) ((f5d) e()).a.f5.a(e5d.S6[319]).i(), false));
                        } else {
                            String name2 = mm9.class.getName();
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9 je9Var2 = je9.e;
                                if (a4cVar2.b(je9Var2)) {
                                    long j14 = mm9Var2.b().a;
                                    boolean z12 = t60VarV.i;
                                    boolean zJ2 = t60VarV.j();
                                    StringBuilder sbU = qt4.u(j14, "Ignore share attach on UI, mId:", ", contentLevel:", z12);
                                    sbU.append(", hasOnlyUrl:");
                                    sbU.append(zJ2);
                                    a4cVar2.c(je9Var2, name2, sbU.toString(), null);
                                }
                            }
                        }
                        mxfVar = null;
                    } else if (zJ) {
                        c46 c46Var6 = mm9Var2.b().n;
                        if (c46Var6 == null || (e70VarH3 = c46Var6.h(0)) == null || (b60Var = e70VarH3.e) == null) {
                            c46Var = c46Var;
                            jB = jB;
                            eagVar = null;
                        } else {
                            String string7 = this.a.getString(R.string.chat_screen_message_audio_title);
                            if (mm9Var2.e().f) {
                                objK = this.a.getString(R.string.chat_screen_message_audio_sender_self);
                            } else if (mm9Var2.b().J == 4) {
                                rt2 rt2Var4 = mm9Var2.a;
                                rt2Var4.K0();
                                objK = rt2Var4.j;
                            } else {
                                objK = mm9Var2.e().k();
                                if (objK == null) {
                                    objK = "";
                                }
                            }
                            h50 h50VarC = c(e70VarH3, mm9Var2.b().a);
                            if (((f5d) e()).n()) {
                                String str16 = b60Var.f;
                                i1i i1iVar4 = (b60Var.i != x60Var || str16 == null) ? null : new i1i(((mea) this.j.getValue()).f(mm9Var2.a(), str16), !r5h.X0(str16));
                                n1i n1iVarT2 = c7kVar != null ? c7kVar.t(mm9Var2.b().a) : null;
                                if (cqk.d(n1iVarT2, l1iVar) && b60Var.i == x60Var) {
                                    i14 = 2;
                                } else {
                                    i14 = (cqk.d(n1iVarT2, l1iVar) || cqk.d(n1iVarT2, m1iVar)) ? 3 : 1;
                                }
                                i1iVar = i1iVar4;
                                i13 = i14;
                            } else {
                                c46Var = c46Var;
                                objK = objK;
                                jB = jB;
                                i1iVar = null;
                                i13 = 0;
                            }
                            String str17 = e70VarH3.u;
                            if (str17 != null && !r5h.X0(str17)) {
                                File file3 = new File(str17);
                                try {
                                    poeVar = Boolean.valueOf(file3.exists() && file3.canRead());
                                } catch (Throwable th) {
                                    poeVar = new poe(th);
                                }
                                Object obj3 = Boolean.FALSE;
                                if (poeVar instanceof poe) {
                                    poeVar = obj3;
                                }
                                if (((Boolean) poeVar).booleanValue()) {
                                    ((wa0) this.r.getValue()).b(e70VarH3.t, str17, va0.OPUS);
                                }
                            }
                            long j15 = mm9Var2.a.a;
                            mg5 mg5Var = mm9Var2.b().H;
                            long j16 = mm9Var2.b().a;
                            long j17 = b60Var.a;
                            String str18 = (str17 == null && (str17 = b60Var.b) == null) ? "" : str17;
                            String str19 = e70VarH3.t;
                            String string8 = objK.toString();
                            byte[] bArr = b60Var.d;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            byte[] bArr2 = bArr;
                            long j18 = b60Var.c;
                            eagVar = new y90(j15, mg5Var, j16, j17, str18, str19, string7, string8, bArr2, mxl.a(j18), j18, ((u3d) this.f.getValue()).h, ((u3d) this.f.getValue()).i, d().a(mm9Var2.b().a, h50VarC), i1iVar, i13, ((f5d) e()).n());
                        }
                        plgVar = eagVar;
                        c46Var = c46Var;
                        jB = jB;
                    } else {
                        c46Var = c46Var;
                        jB = jB;
                        if (mm9Var2.b().P()) {
                            oji ojiVar2 = oji.FILE;
                            e70 e70VarK3 = mm9Var2.b().k(y60.j);
                            if (e70VarK3 == null) {
                                eagVar = null;
                            } else {
                                String str20 = e70VarK3.t;
                                u60 u60Var3 = e70VarK3.q;
                                j60 j60VarR = mm9Var2.b().r();
                                if (j60VarR == null) {
                                    eagVar = null;
                                } else {
                                    String str21 = j60VarR.c;
                                    long j19 = j60VarR.b;
                                    long j20 = j60VarR.a;
                                    e70 e70Var2 = j60VarR.d;
                                    String str22 = mm9Var2.b().g;
                                    boolean z13 = !(str22 == null || str22.length() == 0);
                                    if (e70Var2 == null || e70Var2.a != y60Var2 || e70Var2.b.e) {
                                        j = j19;
                                        j2 = j20;
                                        ojiVar = ojiVar2;
                                        g58Var = null;
                                    } else {
                                        quc qucVar = (quc) this.k.getValue();
                                        o60 o60Var6 = e70Var2.b;
                                        j2 = j20;
                                        long jA = mm9Var2.a.A();
                                        long j21 = mm9Var2.b().b;
                                        vvc vvcVar = qucVar.a;
                                        us0 us0Var = us0.e;
                                        ojiVar = ojiVar2;
                                        String str23 = o60Var6.a;
                                        String str24 = o60Var6.b;
                                        j = j19;
                                        if (o60Var6.i > 0) {
                                            u60Var3.getClass();
                                            if (u60Var3 != u60.d || qucVar.b(o60Var6, e70VarK3)) {
                                                str5 = e70VarK3.u;
                                                if (str5 != null || str5.length() == 0) {
                                                    str5 = null;
                                                }
                                                if (str5 != null) {
                                                    file2 = new File(str5);
                                                    if (!file2.exists()) {
                                                        file2 = null;
                                                    }
                                                } else {
                                                    file2 = null;
                                                }
                                                if (file2 != null) {
                                                    uriB = Uri.fromFile(file2);
                                                } else if (str24 != null || str24.length() == 0) {
                                                    strB = o60Var6.b(us0Var);
                                                    if (strB == null && strB.length() != 0) {
                                                        String strB4 = o60Var6.b(us0Var);
                                                        if (strB4 != null) {
                                                            uriB = Uri.parse(strB4);
                                                        } else {
                                                            uriB = null;
                                                        }
                                                    } else if (str23 != null || str23.length() == 0 || (strD = vs0.d(str23, us0Var, rs0.b)) == null) {
                                                        uriB = null;
                                                    } else {
                                                        uriB = Uri.parse(strD);
                                                    }
                                                } else {
                                                    uriB = Uri.parse(str24);
                                                }
                                                if (uriB == null || (uriB = ((t75) qucVar.d.getValue()).b(e70VarK3, false)) != null) {
                                                    Uri uri = uriB;
                                                    long j22 = o60Var6.i;
                                                    int i25 = o60Var6.c;
                                                    int i26 = o60Var6.d;
                                                    boolean z14 = o60Var6.e;
                                                    int iIntValue = ((Number) vvcVar.c.getValue()).intValue();
                                                    Uri uriB2 = ((t75) qucVar.d.getValue()).b(e70VarK3, false);
                                                    if (file2 != null) {
                                                        bneVarA = null;
                                                    } else {
                                                        bneVarA = vvcVar.a(o60Var6.c, o60Var6.d);
                                                    }
                                                    g58Var = new g58(j22, uri, i25, i26, z14, iIntValue, false, uriB2, bneVarA, null, null, o60Var6.b(us0Var), jA, j21, 3584);
                                                } else {
                                                    g58Var = g58.p;
                                                }
                                            } else {
                                                g58Var = g58.p;
                                            }
                                        } else {
                                            str5 = e70VarK3.u;
                                            if (str5 != null) {
                                                str5 = null;
                                            } else {
                                                str5 = null;
                                            }
                                            if (str5 != null) {
                                                file2 = new File(str5);
                                                if (!file2.exists()) {
                                                    file2 = null;
                                                }
                                            } else {
                                                file2 = null;
                                            }
                                            if (file2 != null) {
                                                uriB = Uri.fromFile(file2);
                                            } else if (str24 != null) {
                                                strB = o60Var6.b(us0Var);
                                                if (strB == null) {
                                                    if (str23 != null) {
                                                        uriB = null;
                                                    } else {
                                                        uriB = null;
                                                    }
                                                } else if (str23 != null) {
                                                    uriB = null;
                                                } else {
                                                    uriB = null;
                                                }
                                            } else {
                                                strB = o60Var6.b(us0Var);
                                                if (strB == null) {
                                                    if (str23 != null) {
                                                        uriB = null;
                                                    } else {
                                                        uriB = null;
                                                    }
                                                } else if (str23 != null) {
                                                    uriB = null;
                                                } else {
                                                    uriB = null;
                                                }
                                            }
                                            if (uriB == null) {
                                            }
                                            Uri uri2 = uriB;
                                            long j23 = o60Var6.i;
                                            int i27 = o60Var6.c;
                                            int i28 = o60Var6.d;
                                            boolean z15 = o60Var6.e;
                                            int iIntValue2 = ((Number) vvcVar.c.getValue()).intValue();
                                            Uri uriB3 = ((t75) qucVar.d.getValue()).b(e70VarK3, false);
                                            if (file2 != null) {
                                                bneVarA = null;
                                            } else {
                                                bneVarA = vvcVar.a(o60Var6.c, o60Var6.d);
                                            }
                                            g58Var = new g58(j23, uri2, i27, i28, z15, iIntValue2, false, uriB3, bneVarA, null, null, o60Var6.b(us0Var), jA, j21, 3584);
                                        }
                                    }
                                    fti ftiVarA = (e70Var2 == null || e70Var2.a != y60Var3) ? null : ((gti) this.l.getValue()).a(e70Var2.d, e70VarK3, str20);
                                    if (e70Var2 != null && e70Var2.h()) {
                                        i3 = 2;
                                    } else if (e70Var2 == null || !e70Var2.e() || e70Var2.b.e) {
                                        i3 = (e70Var2 == null || (o60Var4 = e70Var2.b) == null || !o60Var4.e) ? 4 : 3;
                                    } else {
                                        i3 = 1;
                                    }
                                    int i29 = u60Var3 != 0 ? x40.$EnumSwitchMapping$0[u60Var3.ordinal()] : -1;
                                    if (i29 == 1) {
                                        oji ojiVar3 = ojiVar;
                                        if (j2 == 0) {
                                            j3 = j;
                                            j4 = (long) ((e70VarK3.s / 100.0f) * j3);
                                        } else {
                                            j3 = j;
                                            j4 = e70VarK3.x;
                                        }
                                        k5eVar = new k5e(mm9Var.b().a, j60VarR.b, e70VarK3.s, j4, Long.valueOf(j2), Long.valueOf(j3), e70VarK3.t, ojiVar3);
                                    } else if (i29 == 2) {
                                        k5eVar = new n5e(mm9Var.b().a, j60VarR.b, e70VarK3.t, ojiVar);
                                    } else {
                                        if (i29 != 3 && i29 != 4 && i29 != 5) {
                                            ore.o();
                                            return null;
                                        }
                                        k5eVar = new l5e(mm9Var.b().a, j60VarR.b, e70VarK3.t, ojiVar);
                                    }
                                    h50 h50VarB2 = d().b(k5eVar);
                                    String strU = cqk.u(j60VarR);
                                    Iterator it2 = xp6.c.iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                    } while (!z5h.G0(((xp6) next).name(), strU, true));
                                    zp6 zp6VarC = (xp6) next;
                                    if (zp6VarC == null) {
                                        yp6 yp6Var = yp6.c;
                                        zp6VarC = mxl.c(strU);
                                    }
                                    zp6 zp6Var = zp6VarC;
                                    long j24 = j60VarR.a;
                                    long j25 = mm9Var.b().a;
                                    long j26 = j60VarR.b;
                                    mea meaVar = (mea) this.j.getValue();
                                    int iA = mm9Var.a();
                                    meaVar.getClass();
                                    int iK2 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
                                    int iE = ((vxb) meaVar.g()).e(iA);
                                    if (g58Var == null && ftiVarA == null) {
                                        iE = qv1.b(40.0f, yl5.d().getDisplayMetrics().density, iK2, iE);
                                    } else {
                                        if (g58Var != null) {
                                            i5 = g58Var.c;
                                        } else {
                                            if (ftiVarA != null) {
                                                i5 = ftiVarA.c;
                                            } else {
                                                i4 = 0;
                                            }
                                            if (g58Var != null) {
                                                i7 = g58Var.d;
                                            } else {
                                                if (ftiVarA != null) {
                                                    i7 = ftiVarA.d;
                                                } else {
                                                    i6 = 0;
                                                }
                                                if (g58Var != null) {
                                                    i9 = g58Var.f;
                                                } else {
                                                    if (ftiVarA != null) {
                                                        i9 = ftiVarA.e;
                                                    } else {
                                                        i8 = 0;
                                                    }
                                                    deaVar = (dea) mea.x.get();
                                                    if (deaVar != null) {
                                                        lsk.b(iE, iE, i4, i6, gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), i8, deaVar);
                                                        i10 = i8;
                                                        i11 = deaVar.a;
                                                        g58Var2 = g58Var;
                                                        if (i11 == deaVar.c) {
                                                            j5 = j25;
                                                            if (deaVar.b != deaVar.d) {
                                                                iE = i11;
                                                            }
                                                        } else {
                                                            j5 = j25;
                                                        }
                                                        iK = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
                                                        float f = iE;
                                                        i12 = (int) ((i10 / f) * f);
                                                        if (i12 > i10) {
                                                            iK = i10;
                                                        } else if (i12 >= iK) {
                                                            iK = i12;
                                                        }
                                                        lsk.c(iE, iK, iE, i10, deaVar);
                                                        iE = deaVar.a;
                                                    }
                                                    TextPaint textPaintA = meaVar.i().a(q9i.u.h());
                                                    eagVar = new aq6(j24, j5, str20, str21, j26, ky8.a(meaVar.h(), TextUtils.ellipsize(str21, textPaintA, iE, TextUtils.TruncateAt.MIDDLE), textPaintA, iE, 1, false, null, 0.0f, false, 496), zp6Var, e70VarK3.u, i3, g58Var2, ftiVarA, z13, d().a(mm9Var.b().a, h50VarB2));
                                                }
                                                i8 = i9;
                                                deaVar = (dea) mea.x.get();
                                                if (deaVar != null) {
                                                    lsk.b(iE, iE, i4, i6, gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), i8, deaVar);
                                                    i10 = i8;
                                                    i11 = deaVar.a;
                                                    g58Var2 = g58Var;
                                                    if (i11 == deaVar.c) {
                                                        j5 = j25;
                                                        if (deaVar.b != deaVar.d) {
                                                            iE = i11;
                                                        }
                                                    } else {
                                                        j5 = j25;
                                                    }
                                                    iK = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
                                                    float f2 = iE;
                                                    i12 = (int) ((i10 / f2) * f2);
                                                    if (i12 > i10) {
                                                        iK = i10;
                                                    } else if (i12 >= iK) {
                                                        iK = i12;
                                                    }
                                                    lsk.c(iE, iK, iE, i10, deaVar);
                                                    iE = deaVar.a;
                                                }
                                                TextPaint textPaintA2 = meaVar.i().a(q9i.u.h());
                                                eagVar = new aq6(j24, j5, str20, str21, j26, ky8.a(meaVar.h(), TextUtils.ellipsize(str21, textPaintA2, iE, TextUtils.TruncateAt.MIDDLE), textPaintA2, iE, 1, false, null, 0.0f, false, 496), zp6Var, e70VarK3.u, i3, g58Var2, ftiVarA, z13, d().a(mm9Var.b().a, h50VarB2));
                                            }
                                            i6 = i7;
                                            if (g58Var != null) {
                                                i9 = g58Var.f;
                                            } else {
                                                if (ftiVarA != null) {
                                                    i9 = ftiVarA.e;
                                                } else {
                                                    i8 = 0;
                                                }
                                                deaVar = (dea) mea.x.get();
                                                if (deaVar != null) {
                                                    lsk.b(iE, iE, i4, i6, gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), i8, deaVar);
                                                    i10 = i8;
                                                    i11 = deaVar.a;
                                                    g58Var2 = g58Var;
                                                    if (i11 == deaVar.c) {
                                                        j5 = j25;
                                                        if (deaVar.b != deaVar.d) {
                                                            iE = i11;
                                                        }
                                                    } else {
                                                        j5 = j25;
                                                    }
                                                    iK = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
                                                    float f3 = iE;
                                                    i12 = (int) ((i10 / f3) * f3);
                                                    if (i12 > i10) {
                                                        iK = i10;
                                                    } else if (i12 >= iK) {
                                                        iK = i12;
                                                    }
                                                    lsk.c(iE, iK, iE, i10, deaVar);
                                                    iE = deaVar.a;
                                                }
                                                TextPaint textPaintA3 = meaVar.i().a(q9i.u.h());
                                                eagVar = new aq6(j24, j5, str20, str21, j26, ky8.a(meaVar.h(), TextUtils.ellipsize(str21, textPaintA3, iE, TextUtils.TruncateAt.MIDDLE), textPaintA3, iE, 1, false, null, 0.0f, false, 496), zp6Var, e70VarK3.u, i3, g58Var2, ftiVarA, z13, d().a(mm9Var.b().a, h50VarB2));
                                            }
                                            i8 = i9;
                                            deaVar = (dea) mea.x.get();
                                            if (deaVar != null) {
                                                lsk.b(iE, iE, i4, i6, gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), i8, deaVar);
                                                i10 = i8;
                                                i11 = deaVar.a;
                                                g58Var2 = g58Var;
                                                if (i11 == deaVar.c) {
                                                    j5 = j25;
                                                    if (deaVar.b != deaVar.d) {
                                                        iE = i11;
                                                    }
                                                } else {
                                                    j5 = j25;
                                                }
                                                iK = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
                                                float f4 = iE;
                                                i12 = (int) ((i10 / f4) * f4);
                                                if (i12 > i10) {
                                                    iK = i10;
                                                } else if (i12 >= iK) {
                                                    iK = i12;
                                                }
                                                lsk.c(iE, iK, iE, i10, deaVar);
                                                iE = deaVar.a;
                                            }
                                            TextPaint textPaintA4 = meaVar.i().a(q9i.u.h());
                                            eagVar = new aq6(j24, j5, str20, str21, j26, ky8.a(meaVar.h(), TextUtils.ellipsize(str21, textPaintA4, iE, TextUtils.TruncateAt.MIDDLE), textPaintA4, iE, 1, false, null, 0.0f, false, 496), zp6Var, e70VarK3.u, i3, g58Var2, ftiVarA, z13, d().a(mm9Var.b().a, h50VarB2));
                                        }
                                        i4 = i5;
                                        if (g58Var != null) {
                                            i7 = g58Var.d;
                                        } else {
                                            if (ftiVarA != null) {
                                                i7 = ftiVarA.d;
                                            } else {
                                                i6 = 0;
                                            }
                                            if (g58Var != null) {
                                                i9 = g58Var.f;
                                            } else {
                                                if (ftiVarA != null) {
                                                    i9 = ftiVarA.e;
                                                } else {
                                                    i8 = 0;
                                                }
                                                deaVar = (dea) mea.x.get();
                                                if (deaVar != null) {
                                                    lsk.b(iE, iE, i4, i6, gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), i8, deaVar);
                                                    i10 = i8;
                                                    i11 = deaVar.a;
                                                    g58Var2 = g58Var;
                                                    if (i11 == deaVar.c) {
                                                        j5 = j25;
                                                        if (deaVar.b != deaVar.d) {
                                                            iE = i11;
                                                        }
                                                    } else {
                                                        j5 = j25;
                                                    }
                                                    iK = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
                                                    float f5 = iE;
                                                    i12 = (int) ((i10 / f5) * f5);
                                                    if (i12 > i10) {
                                                        iK = i10;
                                                    } else if (i12 >= iK) {
                                                        iK = i12;
                                                    }
                                                    lsk.c(iE, iK, iE, i10, deaVar);
                                                    iE = deaVar.a;
                                                }
                                                TextPaint textPaintA5 = meaVar.i().a(q9i.u.h());
                                                eagVar = new aq6(j24, j5, str20, str21, j26, ky8.a(meaVar.h(), TextUtils.ellipsize(str21, textPaintA5, iE, TextUtils.TruncateAt.MIDDLE), textPaintA5, iE, 1, false, null, 0.0f, false, 496), zp6Var, e70VarK3.u, i3, g58Var2, ftiVarA, z13, d().a(mm9Var.b().a, h50VarB2));
                                            }
                                            i8 = i9;
                                            deaVar = (dea) mea.x.get();
                                            if (deaVar != null) {
                                                lsk.b(iE, iE, i4, i6, gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), i8, deaVar);
                                                i10 = i8;
                                                i11 = deaVar.a;
                                                g58Var2 = g58Var;
                                                if (i11 == deaVar.c) {
                                                    j5 = j25;
                                                    if (deaVar.b != deaVar.d) {
                                                        iE = i11;
                                                    }
                                                } else {
                                                    j5 = j25;
                                                }
                                                iK = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
                                                float f6 = iE;
                                                i12 = (int) ((i10 / f6) * f6);
                                                if (i12 > i10) {
                                                    iK = i10;
                                                } else if (i12 >= iK) {
                                                    iK = i12;
                                                }
                                                lsk.c(iE, iK, iE, i10, deaVar);
                                                iE = deaVar.a;
                                            }
                                            TextPaint textPaintA6 = meaVar.i().a(q9i.u.h());
                                            eagVar = new aq6(j24, j5, str20, str21, j26, ky8.a(meaVar.h(), TextUtils.ellipsize(str21, textPaintA6, iE, TextUtils.TruncateAt.MIDDLE), textPaintA6, iE, 1, false, null, 0.0f, false, 496), zp6Var, e70VarK3.u, i3, g58Var2, ftiVarA, z13, d().a(mm9Var.b().a, h50VarB2));
                                        }
                                        i6 = i7;
                                        if (g58Var != null) {
                                            i9 = g58Var.f;
                                        } else {
                                            if (ftiVarA != null) {
                                                i9 = ftiVarA.e;
                                            } else {
                                                i8 = 0;
                                            }
                                            deaVar = (dea) mea.x.get();
                                            if (deaVar != null) {
                                                lsk.b(iE, iE, i4, i6, gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), i8, deaVar);
                                                i10 = i8;
                                                i11 = deaVar.a;
                                                g58Var2 = g58Var;
                                                if (i11 == deaVar.c) {
                                                    j5 = j25;
                                                    if (deaVar.b != deaVar.d) {
                                                        iE = i11;
                                                    }
                                                } else {
                                                    j5 = j25;
                                                }
                                                iK = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
                                                float f7 = iE;
                                                i12 = (int) ((i10 / f7) * f7);
                                                if (i12 > i10) {
                                                    iK = i10;
                                                } else if (i12 >= iK) {
                                                    iK = i12;
                                                }
                                                lsk.c(iE, iK, iE, i10, deaVar);
                                                iE = deaVar.a;
                                            }
                                            TextPaint textPaintA7 = meaVar.i().a(q9i.u.h());
                                            eagVar = new aq6(j24, j5, str20, str21, j26, ky8.a(meaVar.h(), TextUtils.ellipsize(str21, textPaintA7, iE, TextUtils.TruncateAt.MIDDLE), textPaintA7, iE, 1, false, null, 0.0f, false, 496), zp6Var, e70VarK3.u, i3, g58Var2, ftiVarA, z13, d().a(mm9Var.b().a, h50VarB2));
                                        }
                                        i8 = i9;
                                        deaVar = (dea) mea.x.get();
                                        if (deaVar != null) {
                                            lsk.b(iE, iE, i4, i6, gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), i8, deaVar);
                                            i10 = i8;
                                            i11 = deaVar.a;
                                            g58Var2 = g58Var;
                                            if (i11 == deaVar.c) {
                                                j5 = j25;
                                                if (deaVar.b != deaVar.d) {
                                                    iE = i11;
                                                }
                                            } else {
                                                j5 = j25;
                                            }
                                            iK = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
                                            float f8 = iE;
                                            i12 = (int) ((i10 / f8) * f8);
                                            if (i12 > i10) {
                                                iK = i10;
                                            } else if (i12 >= iK) {
                                                iK = i12;
                                            }
                                            lsk.c(iE, iK, iE, i10, deaVar);
                                            iE = deaVar.a;
                                        }
                                        TextPaint textPaintA8 = meaVar.i().a(q9i.u.h());
                                        eagVar = new aq6(j24, j5, str20, str21, j26, ky8.a(meaVar.h(), TextUtils.ellipsize(str21, textPaintA8, iE, TextUtils.TruncateAt.MIDDLE), textPaintA8, iE, 1, false, null, 0.0f, false, 496), zp6Var, e70VarK3.u, i3, g58Var2, ftiVarA, z13, d().a(mm9Var.b().a, h50VarB2));
                                    }
                                    g58Var2 = g58Var;
                                    j5 = j25;
                                    TextPaint textPaintA9 = meaVar.i().a(q9i.u.h());
                                    eagVar = new aq6(j24, j5, str20, str21, j26, ky8.a(meaVar.h(), TextUtils.ellipsize(str21, textPaintA9, iE, TextUtils.TruncateAt.MIDDLE), textPaintA9, iE, 1, false, null, 0.0f, false, 496), zp6Var, e70VarK3.u, i3, g58Var2, ftiVarA, z13, d().a(mm9Var.b().a, h50VarB2));
                                }
                            }
                            plgVar = eagVar;
                            c46Var = c46Var;
                            jB = jB;
                        } else {
                            if (z5) {
                                eagVar = ((r6d) this.t.getValue()).b(mm9Var, cVar);
                            } else if (zB3 && zBooleanValue) {
                                ntg ntgVarX = mm9Var.b().x();
                                if (ntgVarX == null) {
                                    eagVar = null;
                                } else {
                                    eagVar = new n1h(ntgVarX.b, ntgVarX.a, ntgVarX.c);
                                }
                            } else {
                                c46Var = c46Var;
                                jB = jB;
                                plgVar = null;
                            }
                            plgVar = eagVar;
                            c46Var = c46Var;
                            jB = jB;
                        }
                    }
                    plgVar = mxfVar;
                }
                return new u40(jB, plgVar, (kg8) c46Var.b);
            }
            zB2 = zB2;
            boolean zBooleanValue2 = ((Boolean) ((e5d) this.n.getValue()).B().i()).booleanValue();
            boolean z16 = z4;
            boolean zB4 = mm9Var2.b().B(y60.p);
            if (z16) {
            }
            int i210 = v40.b;
            if (((kg8) c46Var.b) != null) {
                z = true;
            } else {
                z = false;
            }
            if (((kke) c46Var.c) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            jB = mvk.b(z6, zB, z, z2);
            charSequence = "";
            if (zI) {
                c46Var4 = mm9Var2.b().n;
                if (c46Var4 != null) {
                    ore.p("Required value was null.");
                    return null;
                }
                if (c46Var4.i() == 1) {
                    jh4Var = null;
                } else {
                    ojiVarH = h(e70VarK);
                    u60 u60Var4 = e70VarK.q;
                    i18 = u60Var4 != null ? x40.$EnumSwitchMapping$0[u60Var4.ordinal()] : -1;
                    if (i18 != 1) {
                        if (i18 != 2) {
                            k5eVar2 = new l5e(mm9Var2.b().a, e70VarK.w, e70VarK.t, ojiVarH);
                        } else {
                            k5eVar2 = new n5e(mm9Var2.b().a, e70VarK.w, e70VarK.t, ojiVarH);
                        }
                    } else if (d70Var3.a == 0) {
                        k5eVar2 = new o5e(mm9Var2.b().a, e70VarK.w, e70VarK.s, e70VarK.t, ojiVarH);
                    } else {
                        k5eVar2 = new k5e(mm9Var2.b().a, e70VarK.w, e70VarK.s, e70VarK.x, null, null, e70VarK.t, ojiVarH);
                    }
                    h50 h50VarB3 = d().b(k5eVar2);
                    if (mm9Var2.e().f) {
                        string2 = this.a.getString(R.string.chat_screen_message_audio_sender_self);
                    } else {
                        if (mm9Var2.b().J == 4) {
                            rt2 rt2Var5 = mm9Var2.a;
                            rt2Var5.K0();
                            charSequenceK = rt2Var5.j;
                            if (charSequenceK != null) {
                                charSequence = charSequenceK;
                            }
                        } else {
                            charSequenceK = mm9Var2.e().k();
                            if (charSequenceK != null) {
                                charSequence = charSequenceK;
                            }
                        }
                        string2 = charSequence;
                    }
                    if (((f5d) e()).D()) {
                        String str25 = d70Var3.u;
                        if (d70Var3.v == x60Var) {
                            i1iVar3 = null;
                        } else {
                            i1iVar3 = null;
                        }
                        if (c7kVar != null) {
                            n1iVarT = c7kVar.t(mm9Var2.b().a);
                        } else {
                            n1iVarT = null;
                        }
                        if (!cqk.d(n1iVarT, l1iVar)) {
                            if (cqk.d(n1iVarT, l1iVar)) {
                                i20 = 3;
                            } else {
                                i20 = 3;
                            }
                        } else if (cqk.d(n1iVarT, l1iVar)) {
                            i20 = 3;
                        } else {
                            i20 = 3;
                        }
                        i1iVar2 = i1iVar3;
                        i19 = i20;
                    } else {
                        i1iVar2 = null;
                        i19 = 0;
                    }
                    jh4Var = new oxi(mm9Var2.b().a, e70VarK.t, ((gti) this.l.getValue()).a(d70Var3, e70VarK, e70VarK.t), d().a(mm9Var2.b().a, h50VarB3), ((d0j) this.i.getValue()).j, string2, i1iVar2, i19, ((f5d) e()).D());
                }
                plgVar = jh4Var;
            } else if (zB) {
                c46Var = c46Var;
                jB = jB;
                ny8Var = this.k;
                ny8Var2 = this.g;
                ny8Var3 = this.l;
                sfa sfaVarB5 = mm9Var2.b();
                rt2Var = mm9Var2.a;
                c46Var2 = sfaVarB5.n;
                if (c46Var2 == null) {
                    ore.p("Required value was null.");
                    eagVar = null;
                } else if (c46Var2.i() == 0) {
                    eagVar = null;
                } else if (c46Var2.i() == 1) {
                    e70VarH2 = c46Var2.h(0);
                    if (e70VarH2 != null) {
                        str4 = e70VarH2.t;
                        d70Var2 = e70VarH2.d;
                        if (d70Var2 != null) {
                            eagVar = new eag(mm9Var2.b().a, str4, ((gti) ny8Var3.getValue()).a(d70Var2, e70VarH2, str4), d().a(mm9Var2.b().a, c(e70VarH2, mm9Var2.b().a)), g(mm9Var), !((u4a) ny8Var2.getValue()).d());
                        } else {
                            o60Var3 = e70VarH2.b;
                            if (o60Var3 != null) {
                                yv3Var = new h8g(mm9Var2.b().a, str4, ((quc) ny8Var.getValue()).a(o60Var3, e70VarH2, n11Var, rt2Var.A(), mm9Var2.b().b), d().a(mm9Var2.b().a, c(e70VarH2, mm9Var2.b().a)), g(mm9Var));
                                eagVar = yv3Var;
                            } else {
                                ore.p("Required value was null.");
                            }
                        }
                    } else {
                        ore.p("Required value was null.");
                    }
                    eagVar = null;
                } else {
                    arrayList = new ArrayList(c46Var2.i());
                    u8bVar = new u8b(c46Var2.i());
                    i = c46Var2.i();
                    i2 = 0;
                    while (i2 < i) {
                        e70VarH = c46Var2.h(i2);
                        if (e70VarH == null) {
                            ny8Var4 = ny8Var;
                            ny8Var2 = ny8Var2;
                        } else {
                            o60Var = e70VarH.b;
                            str2 = e70VarH.t;
                            y60Var = e70VarH.a;
                            if (y60Var != y60.c) {
                                u8bVar.b(c(e70VarH, mm9Var2.b().a));
                                d70Var = e70VarH.d;
                                if (d70Var != null) {
                                    arrayList.add(((gti) ny8Var3.getValue()).a(d70Var, e70VarH, str2));
                                } else {
                                    if (o60Var != null) {
                                        g58 g58VarA3 = ((quc) ny8Var.getValue()).a(o60Var, e70VarH, n11Var, rt2Var.A(), mm9Var2.b().b);
                                        o60Var2 = o60Var;
                                        e70Var = e70VarH;
                                        arrayList.add(g58VarA3);
                                    } else {
                                        o60Var2 = o60Var;
                                        e70Var = e70VarH;
                                    }
                                    u4aVar = (u4a) ny8Var2.getValue();
                                    if (u4aVar.a) {
                                        ny8Var4 = ny8Var;
                                        if (!u4aVar.b().c.d.getBoolean("app.media.autoplay.gif", true)) {
                                        }
                                    }
                                    ny8Var2 = ny8Var2;
                                }
                                ny8Var4 = ny8Var;
                                ny8Var2 = ny8Var2;
                            } else {
                                u8bVar.b(c(e70VarH, mm9Var2.b().a));
                                d70Var = e70VarH.d;
                                if (d70Var != null) {
                                    arrayList.add(((gti) ny8Var3.getValue()).a(d70Var, e70VarH, str2));
                                } else {
                                    if (o60Var != null) {
                                        g58 g58VarA4 = ((quc) ny8Var.getValue()).a(o60Var, e70VarH, n11Var, rt2Var.A(), mm9Var2.b().b);
                                        o60Var2 = o60Var;
                                        e70Var = e70VarH;
                                        arrayList.add(g58VarA4);
                                    } else {
                                        o60Var2 = o60Var;
                                        e70Var = e70VarH;
                                    }
                                    u4aVar = (u4a) ny8Var2.getValue();
                                    if (u4aVar.a) {
                                        ny8Var4 = ny8Var;
                                        if (!u4aVar.b().c.d.getBoolean("app.media.autoplay.gif", true)) {
                                        }
                                    }
                                    ny8Var2 = ny8Var2;
                                }
                                ny8Var4 = ny8Var;
                                ny8Var2 = ny8Var2;
                            }
                        }
                        i2++;
                        mm9Var2 = mm9Var;
                        ny8Var2 = ny8Var2;
                        ny8Var = ny8Var4;
                    }
                    fArrQ1 = new float[0];
                    if (arrayList.size() > 1) {
                        arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                yu3Var = (yu3) it.next();
                                if (yu3Var instanceof g58) {
                                    g58 g58Var4 = (g58) yu3Var;
                                    fB = b(g58Var4.c, g58Var4.d);
                                } else if (yu3Var instanceof fti) {
                                    fti ftiVar2 = (fti) yu3Var;
                                    fB = b(ftiVar2.c, ftiVar2.d);
                                } else {
                                    ore.o();
                                    eagVar = null;
                                }
                                arrayList2.add(Float.valueOf(fB));
                            } else {
                                fArrQ1 = ww3.Q1(arrayList2);
                            }
                        }
                    }
                    float[] fArr2 = fArrQ1;
                    boolean zG2 = g(mm9Var);
                    o50 o50VarD2 = d();
                    yv3Var = new yv3(fArr2, arrayList, e9i.G0(new n50(o50VarD2.f, mm9Var.b().a, 0), o50VarD2.d, j0g.a, null), u8bVar, zG2);
                    eagVar = yv3Var;
                }
                plgVar = eagVar;
                c46Var = c46Var;
                jB = jB;
            } else {
                c46Var = c46Var;
                jB = jB;
                ny8Var = this.k;
                ny8Var2 = this.g;
                ny8Var3 = this.l;
                sfa sfaVarB6 = mm9Var2.b();
                rt2Var = mm9Var2.a;
                c46Var2 = sfaVarB6.n;
                if (c46Var2 == null) {
                    ore.p("Required value was null.");
                    eagVar = null;
                } else if (c46Var2.i() == 0) {
                    eagVar = null;
                } else if (c46Var2.i() == 1) {
                    e70VarH2 = c46Var2.h(0);
                    if (e70VarH2 != null) {
                        str4 = e70VarH2.t;
                        d70Var2 = e70VarH2.d;
                        if (d70Var2 != null) {
                            eagVar = new eag(mm9Var2.b().a, str4, ((gti) ny8Var3.getValue()).a(d70Var2, e70VarH2, str4), d().a(mm9Var2.b().a, c(e70VarH2, mm9Var2.b().a)), g(mm9Var), !((u4a) ny8Var2.getValue()).d());
                        } else {
                            o60Var3 = e70VarH2.b;
                            if (o60Var3 != null) {
                                yv3Var = new h8g(mm9Var2.b().a, str4, ((quc) ny8Var.getValue()).a(o60Var3, e70VarH2, n11Var, rt2Var.A(), mm9Var2.b().b), d().a(mm9Var2.b().a, c(e70VarH2, mm9Var2.b().a)), g(mm9Var));
                                eagVar = yv3Var;
                            } else {
                                ore.p("Required value was null.");
                            }
                        }
                    } else {
                        ore.p("Required value was null.");
                    }
                    eagVar = null;
                } else {
                    arrayList = new ArrayList(c46Var2.i());
                    u8bVar = new u8b(c46Var2.i());
                    i = c46Var2.i();
                    i2 = 0;
                    while (i2 < i) {
                        e70VarH = c46Var2.h(i2);
                        if (e70VarH == null) {
                            ny8Var4 = ny8Var;
                            ny8Var2 = ny8Var2;
                        } else {
                            o60Var = e70VarH.b;
                            str2 = e70VarH.t;
                            y60Var = e70VarH.a;
                            if (y60Var != y60.c) {
                                u8bVar.b(c(e70VarH, mm9Var2.b().a));
                                d70Var = e70VarH.d;
                                if (d70Var != null) {
                                    arrayList.add(((gti) ny8Var3.getValue()).a(d70Var, e70VarH, str2));
                                } else {
                                    if (o60Var != null) {
                                        g58 g58VarA5 = ((quc) ny8Var.getValue()).a(o60Var, e70VarH, n11Var, rt2Var.A(), mm9Var2.b().b);
                                        o60Var2 = o60Var;
                                        e70Var = e70VarH;
                                        arrayList.add(g58VarA5);
                                    } else {
                                        o60Var2 = o60Var;
                                        e70Var = e70VarH;
                                    }
                                    u4aVar = (u4a) ny8Var2.getValue();
                                    if (u4aVar.a) {
                                        ny8Var4 = ny8Var;
                                        if (!u4aVar.b().c.d.getBoolean("app.media.autoplay.gif", true)) {
                                        }
                                    }
                                    ny8Var2 = ny8Var2;
                                }
                                ny8Var4 = ny8Var;
                                ny8Var2 = ny8Var2;
                            } else {
                                u8bVar.b(c(e70VarH, mm9Var2.b().a));
                                d70Var = e70VarH.d;
                                if (d70Var != null) {
                                    arrayList.add(((gti) ny8Var3.getValue()).a(d70Var, e70VarH, str2));
                                } else {
                                    if (o60Var != null) {
                                        g58 g58VarA6 = ((quc) ny8Var.getValue()).a(o60Var, e70VarH, n11Var, rt2Var.A(), mm9Var2.b().b);
                                        o60Var2 = o60Var;
                                        e70Var = e70VarH;
                                        arrayList.add(g58VarA6);
                                    } else {
                                        o60Var2 = o60Var;
                                        e70Var = e70VarH;
                                    }
                                    u4aVar = (u4a) ny8Var2.getValue();
                                    if (u4aVar.a) {
                                        ny8Var4 = ny8Var;
                                        if (!u4aVar.b().c.d.getBoolean("app.media.autoplay.gif", true)) {
                                        }
                                    }
                                    ny8Var2 = ny8Var2;
                                }
                                ny8Var4 = ny8Var;
                                ny8Var2 = ny8Var2;
                            }
                        }
                        i2++;
                        mm9Var2 = mm9Var;
                        ny8Var2 = ny8Var2;
                        ny8Var = ny8Var4;
                    }
                    fArrQ1 = new float[0];
                    if (arrayList.size() > 1) {
                        arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                yu3Var = (yu3) it.next();
                                if (yu3Var instanceof g58) {
                                    g58 g58Var5 = (g58) yu3Var;
                                    fB = b(g58Var5.c, g58Var5.d);
                                } else if (yu3Var instanceof fti) {
                                    fti ftiVar3 = (fti) yu3Var;
                                    fB = b(ftiVar3.c, ftiVar3.d);
                                } else {
                                    ore.o();
                                    eagVar = null;
                                }
                                arrayList2.add(Float.valueOf(fB));
                            } else {
                                fArrQ1 = ww3.Q1(arrayList2);
                            }
                        }
                    }
                    float[] fArr3 = fArrQ1;
                    boolean zG3 = g(mm9Var);
                    o50 o50VarD3 = d();
                    yv3Var = new yv3(fArr3, arrayList, e9i.G0(new n50(o50VarD3.f, mm9Var.b().a, 0), o50VarD3.d, j0g.a, null), u8bVar, zG3);
                    eagVar = yv3Var;
                }
                plgVar = eagVar;
                c46Var = c46Var;
                jB = jB;
            }
            return new u40(jB, plgVar, (kg8) c46Var.b);
        }
        if (i22 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j6 = y40Var.e;
        c46Var3 = y40Var.d;
        ch3.d0(obj);
        long j27 = j6;
        plgVar = (t50) obj;
        jB = j27;
        c46Var = c46Var3;
        return new u40(jB, plgVar, (kg8) c46Var.b);
    }

    public final float b(int i, int i2) {
        if (i2 == 0 || i == 0) {
            return 1.0f;
        }
        float f = i / i2;
        if (!((f5d) e()).x()) {
            return f;
        }
        if (f >= 1.25f) {
            return 1.7777778f;
        }
        return f <= 0.8f ? 0.75f : 1.0f;
    }

    public final h50 c(e70 e70Var, long j) {
        p5e m5eVar;
        oji ojiVarH = h(e70Var);
        u60 u60Var = e70Var.q;
        int i = u60Var == null ? -1 : x40.$EnumSwitchMapping$0[u60Var.ordinal()];
        long j2 = e70Var.w;
        if (i != 1) {
            String str = e70Var.t;
            m5eVar = i != 2 ? new l5e(j, j2, str, ojiVarH) : new n5e(j, j2, str, ojiVarH);
        } else {
            m5eVar = j2 == 0 ? new m5e(j, e70Var.t, 0.0f, ojiVarH) : new o5e(j, j2, e70Var.s, e70Var.t, ojiVarH);
        }
        return d().b(m5eVar);
    }

    public final o50 d() {
        return (o50) this.h.getValue();
    }

    public final wo6 e() {
        return (wo6) this.m.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0184  */
    /* JADX WARN: Code duplicated, block: B:70:0x0186  */
    /* JADX WARN: Code duplicated, block: B:72:0x0189  */
    /* JADX WARN: Code duplicated, block: B:73:0x0195  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object f(mm9 mm9Var, nq4 nq4Var) {
        z40 z40Var;
        l60 l60Var;
        String str;
        vc9 vc9Var;
        String str2;
        mm9 mm9Var2;
        l60 l60Var2;
        String str3;
        String str4;
        vc9 vc9Var2;
        String str5;
        String str6;
        int iK;
        long jA;
        Integer num;
        Integer num2;
        int iV;
        if (nq4Var instanceof z40) {
            z40Var = (z40) nq4Var;
            int i = z40Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z40Var.k = i - Integer.MIN_VALUE;
            } else {
                z40Var = new z40(this, nq4Var);
            }
        } else {
            z40Var = new z40(this, nq4Var);
        }
        z40 z40Var2 = z40Var;
        Object obj = z40Var2.i;
        int i2 = z40Var2.k;
        if (i2 == 0) {
            ch3.d0(obj);
            sfa sfaVarB = mm9Var.b();
            l60Var = sfaVarB.Q() ? sfaVarB.n.l(y60.m).m : null;
            if (l60Var == null) {
                return null;
            }
            str = (String) this.s.getValue();
            vc9Var = l60Var.a;
            if (str == null || str.length() == 0) {
                Context context = this.a;
                String string = context.getString(R.string.chat_screen_message_geo_title);
                if (vc9Var.a == 1.401298464324817E-45d || vc9Var.b == 1.401298464324817E-45d) {
                    str2 = string;
                    String string2 = context.getString(R.string.chat_screen_message_geo_subtitle);
                    mm9Var2 = mm9Var;
                    l60Var2 = l60Var;
                    str3 = string2;
                    vc9Var = vc9Var;
                } else {
                    m60 m60Var = l60Var.i;
                    vc9 vc9Var3 = m60Var != null ? m60Var.a : null;
                    fih fihVar = (fih) this.d.getValue();
                    double d = vc9Var.a;
                    double d2 = vc9Var.b;
                    double d3 = vc9Var3 != null ? vc9Var3.a : 0.0d;
                    double d4 = vc9Var3 != null ? vc9Var3.b : 0.0d;
                    z40Var2.d = mm9Var;
                    z40Var2.e = l60Var;
                    z40Var2.f = str;
                    z40Var2.g = vc9Var;
                    z40Var2.h = string;
                    z40Var2.k = 1;
                    str2 = string;
                    Object objB = fihVar.b(d, d2, d3, d4, z40Var2);
                    hu4 hu4Var = hu4.a;
                    if (objB == hu4Var) {
                        return hu4Var;
                    }
                    mm9Var2 = mm9Var;
                    l60Var2 = l60Var;
                    obj = objB;
                    str4 = str;
                    vc9Var2 = vc9Var;
                }
                str5 = str2;
                str6 = str3;
                l60Var = l60Var2;
            } else {
                mm9Var2 = mm9Var;
                str5 = null;
                str6 = null;
            }
            iK = gm0.K(291.0f * yl5.d().getDisplayMetrics().density);
            int iK2 = gm0.K(163.0f * yl5.d().getDisplayMetrics().density);
            if (iK != 0 || iK2 == 0) {
                jA = bj8.a(0, 0);
            } else if (iK > 650 || iK2 > 450) {
                float f = iK;
                float f2 = iK2;
                float fMin = Math.min(Math.min(650.0f / f, 450.0f / f2), 1.0f);
                jA = bj8.a(gm0.K(f * fMin), gm0.K(f2 * fMin));
            } else {
                jA = bj8.a(iK, iK2);
            }
            num = new Integer(gm0.K(l60Var.g));
            if (num.intValue() > 0.0f) {
                num2 = num;
            } else {
                num2 = null;
            }
            if (num2 != null) {
                iV = oc9.v(num2.intValue(), 1, 21);
            } else {
                iV = 16;
            }
            int i3 = (int) (jA >> 32);
            int i4 = (int) (jA & 4294967295L);
            double d5 = vc9Var.b;
            double d6 = vc9Var.a;
            StringBuilder sbP = qv1.p("https://static-maps.yandex.ru/v1?lang=ru_RU&maptype=future_map&scale=1.5&size=", i3, ",", i4, "&z=");
            sbP.append(iV);
            sbP.append("&ll=");
            sbP.append(d5);
            sbP.append(",");
            sbP.append(d6);
            sbP.append("&apikey=");
            sbP.append(str);
            String string3 = sbP.toString();
            return new zj7(mm9Var2.b().a, str5, str6, vc9Var.a, vc9Var.b, l60Var.g, string3, string3.concat("&theme=dark"), ((double) i3) / ((double) i4));
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = z40Var2.h;
        vc9Var2 = z40Var2.g;
        str4 = z40Var2.f;
        l60Var2 = z40Var2.e;
        mm9Var2 = z40Var2.d;
        ch3.d0(obj);
        str3 = (String) obj;
        if (str3 == null || str3.length() == 0) {
            str3 = vc9Var2.a + "," + vc9Var2.b;
        }
        String str7 = str4;
        vc9Var = vc9Var2;
        str = str7;
        str5 = str2;
        str6 = str3;
        l60Var = l60Var2;
        iK = gm0.K(291.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(163.0f * yl5.d().getDisplayMetrics().density);
        if (iK != 0) {
            jA = bj8.a(0, 0);
        } else {
            jA = bj8.a(0, 0);
        }
        num = new Integer(gm0.K(l60Var.g));
        if (num.intValue() > 0.0f) {
            num2 = num;
        } else {
            num2 = null;
        }
        if (num2 != null) {
            iV = oc9.v(num2.intValue(), 1, 21);
        } else {
            iV = 16;
        }
        int i5 = (int) (jA >> 32);
        int i6 = (int) (jA & 4294967295L);
        double d7 = vc9Var.b;
        double d8 = vc9Var.a;
        StringBuilder sbP2 = qv1.p("https://static-maps.yandex.ru/v1?lang=ru_RU&maptype=future_map&scale=1.5&size=", i5, ",", i6, "&z=");
        sbP2.append(iV);
        sbP2.append("&ll=");
        sbP2.append(d7);
        sbP2.append(",");
        sbP2.append(d8);
        sbP2.append("&apikey=");
        sbP2.append(str);
        String string4 = sbP2.toString();
        return new zj7(mm9Var2.b().a, str5, str6, vc9Var.a, vc9Var.b, l60Var.g, string4, string4.concat("&theme=dark"), ((double) i5) / ((double) i6));
    }

    public final boolean g(mm9 mm9Var) {
        long jLongValue = ((Number) ((e5d) this.n.getValue()).U1.a(e5d.S6[149]).i()).longValue();
        if (jLongValue == 3) {
            if ((mm9Var.b().B & 2) == 0) {
                return true;
            }
        } else if (jLongValue == 2) {
            if (mm9Var.b().J == 4) {
                return true;
            }
            sfa sfaVar = mm9Var.b().q;
            if ((sfaVar != null ? sfaVar.J : 0) == 4) {
                return true;
            }
        } else if (jLongValue == 1) {
            return true;
        }
        return false;
    }
}
