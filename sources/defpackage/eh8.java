package defpackage;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipInputStream;
import one.me.messages.list.loader.MessageModel;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class eh8 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;

    public eh8(yx6 yx6Var, sr8 sr8Var) {
        this.a = 2;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:141:0x0236  */
    /* JADX WARN: Code duplicated, block: B:161:0x0276  */
    /* JADX WARN: Code duplicated, block: B:178:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:195:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:212:0x0323  */
    /* JADX WARN: Code duplicated, block: B:233:0x037b  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:269:0x0400  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:295:0x0456  */
    /* JADX WARN: Code duplicated, block: B:312:0x0493  */
    /* JADX WARN: Code duplicated, block: B:329:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:346:0x0503  */
    /* JADX WARN: Code duplicated, block: B:361:0x0545  */
    /* JADX WARN: Code duplicated, block: B:376:0x0587  */
    /* JADX WARN: Code duplicated, block: B:398:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:420:0x0619  */
    /* JADX WARN: Code duplicated, block: B:437:0x0656  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:454:0x0695  */
    /* JADX WARN: Code duplicated, block: B:480:0x070f  */
    /* JADX WARN: Code duplicated, block: B:499:0x0754  */
    /* JADX WARN: Code duplicated, block: B:516:0x0791  */
    /* JADX WARN: Code duplicated, block: B:533:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:564:0x085d  */
    /* JADX WARN: Code duplicated, block: B:579:0x089d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:92:0x015a  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) throws IOException {
        dh8 dh8Var;
        qr8 qr8Var;
        rr8 rr8Var;
        sh9 sh9Var;
        uh9 uh9Var;
        wh9 wh9Var;
        xh9 xh9Var;
        yh9 yh9Var;
        zh9 zh9Var;
        dr9 dr9Var;
        wr9 wr9Var;
        xr9 xr9Var;
        yr9 yr9Var;
        iw9 iw9Var;
        bx9 bx9Var;
        iz9 iz9Var;
        p1a p1aVar;
        z1a z1aVar;
        a2a a2aVar;
        eaa eaaVar;
        zma zmaVar;
        woa woaVar;
        xoa xoaVar;
        yoa yoaVar;
        zoa zoaVar;
        esa esaVar;
        fsa fsaVar;
        hsa hsaVar;
        eta etaVar;
        zva zvaVar;
        int i = this.a;
        boolean z = false;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.b;
        Object obj2 = hu4.a;
        Object objW = null;
        switch (i) {
            case 0:
                if (lq4Var instanceof dh8) {
                    dh8Var = (dh8) lq4Var;
                    int i2 = dh8Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        dh8Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        dh8Var = new dh8(this, lq4Var);
                    }
                } else {
                    dh8Var = new dh8(this, lq4Var);
                }
                Object obj3 = dh8Var.d;
                int i3 = dh8Var.e;
                if (i3 == 0) {
                    ch3.d0(obj3);
                    Object ygeVar = new yge((ag9) obj, null);
                    dh8Var.e = 1;
                    return yx6Var.emit(ygeVar, dh8Var) == obj2 ? obj2 : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj3);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lq4Var instanceof qr8) {
                    qr8Var = (qr8) lq4Var;
                    int i4 = qr8Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qr8Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        qr8Var = new qr8(this, lq4Var);
                    }
                } else {
                    qr8Var = new qr8(this, lq4Var);
                }
                Object obj4 = qr8Var.d;
                int i5 = qr8Var.e;
                if (i5 == 0) {
                    ch3.d0(obj4);
                    Object num = new Integer(((rt2) obj).b.r0);
                    qr8Var.e = 1;
                    return yx6Var.emit(num, qr8Var) == obj2 ? obj2 : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj4);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lq4Var instanceof rr8) {
                    rr8Var = (rr8) lq4Var;
                    int i6 = rr8Var.e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        rr8Var.e = i6 - Integer.MIN_VALUE;
                    } else {
                        rr8Var = new rr8(this, lq4Var);
                    }
                } else {
                    rr8Var = new rr8(this, lq4Var);
                }
                Object obj5 = rr8Var.d;
                int i7 = rr8Var.e;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ch3.d0(obj5);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj5);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    vg4 vg4Var = ((n63) it.next()).a;
                    long jV = vg4Var.v();
                    String strK = vg4Var.k();
                    String str = strK == null ? "" : strK;
                    String strZ = vg4Var.z(us0.a);
                    Uri uriK = strZ != null ? sb8.K(strZ) : null;
                    CharSequence charSequenceU = vg4Var.u();
                    arrayList.add(new rq8(jV, str, uriK, charSequenceU == null ? "" : charSequenceU));
                }
                rr8Var.e = 1;
                return yx6Var.emit(arrayList, rr8Var) == obj2 ? obj2 : sbiVar;
            case 3:
                if (lq4Var instanceof sh9) {
                    sh9Var = (sh9) lq4Var;
                    int i8 = sh9Var.e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        sh9Var.e = i8 - Integer.MIN_VALUE;
                    } else {
                        sh9Var = new sh9(this, lq4Var);
                    }
                } else {
                    sh9Var = new sh9(this, lq4Var);
                }
                Object obj6 = sh9Var.d;
                int i9 = sh9Var.e;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ch3.d0(obj6);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj6);
                if (((List) obj).isEmpty()) {
                    return sbiVar;
                }
                sh9Var.e = 1;
                return yx6Var.emit(obj, sh9Var) == obj2 ? obj2 : sbiVar;
            case 4:
                if (lq4Var instanceof uh9) {
                    uh9Var = (uh9) lq4Var;
                    int i10 = uh9Var.e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        uh9Var.e = i10 - Integer.MIN_VALUE;
                    } else {
                        uh9Var = new uh9(this, lq4Var);
                    }
                } else {
                    uh9Var = new uh9(this, lq4Var);
                }
                Object obj7 = uh9Var.d;
                int i11 = uh9Var.e;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ch3.d0(obj7);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj7);
                if (r5h.X0((String) obj)) {
                    return sbiVar;
                }
                uh9Var.e = 1;
                return yx6Var.emit(obj, uh9Var) == obj2 ? obj2 : sbiVar;
            case 5:
                if (lq4Var instanceof wh9) {
                    wh9Var = (wh9) lq4Var;
                    int i12 = wh9Var.e;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        wh9Var.e = i12 - Integer.MIN_VALUE;
                    } else {
                        wh9Var = new wh9(this, lq4Var);
                    }
                } else {
                    wh9Var = new wh9(this, lq4Var);
                }
                Object obj8 = wh9Var.d;
                int i13 = wh9Var.e;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ch3.d0(obj8);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj8);
                File file = (File) obj;
                if (!file.exists() || file.length() <= 0) {
                    return sbiVar;
                }
                wh9Var.e = 1;
                return yx6Var.emit(obj, wh9Var) == obj2 ? obj2 : sbiVar;
            case 6:
                if (lq4Var instanceof xh9) {
                    xh9Var = (xh9) lq4Var;
                    int i14 = xh9Var.e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        xh9Var.e = i14 - Integer.MIN_VALUE;
                    } else {
                        xh9Var = new xh9(this, lq4Var);
                    }
                } else {
                    xh9Var = new xh9(this, lq4Var);
                }
                Object obj9 = xh9Var.d;
                int i15 = xh9Var.e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ch3.d0(obj9);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj9);
                File file2 = (File) obj;
                if (lu6.m0(file2).equals("zip")) {
                    File fileCreateTempFile = File.createTempFile("log_", ".txt");
                    ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file2));
                    try {
                        zipInputStream.getNextEntry();
                        lu6.s0(fileCreateTempFile, gm0.I(new BufferedReader(new InputStreamReader(zipInputStream, pt2.a), 8192)));
                        zipInputStream.close();
                        file2 = fileCreateTempFile;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(zipInputStream, th);
                            throw th2;
                        }
                    }
                }
                xh9Var.e = 1;
                return yx6Var.emit(file2, xh9Var) == obj2 ? obj2 : sbiVar;
            case 7:
                if (lq4Var instanceof yh9) {
                    yh9Var = (yh9) lq4Var;
                    int i16 = yh9Var.e;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        yh9Var.e = i16 - Integer.MIN_VALUE;
                    } else {
                        yh9Var = new yh9(this, lq4Var);
                    }
                } else {
                    yh9Var = new yh9(this, lq4Var);
                }
                Object obj10 = yh9Var.d;
                int i17 = yh9Var.e;
                if (i17 != 0) {
                    if (i17 == 1) {
                        ch3.d0(obj10);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj10);
                if (((List) obj).isEmpty()) {
                    return sbiVar;
                }
                yh9Var.e = 1;
                return yx6Var.emit(obj, yh9Var) == obj2 ? obj2 : sbiVar;
            case 8:
                if (lq4Var instanceof zh9) {
                    zh9Var = (zh9) lq4Var;
                    int i18 = zh9Var.e;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        zh9Var.e = i18 - Integer.MIN_VALUE;
                    } else {
                        zh9Var = new zh9(this, lq4Var);
                    }
                } else {
                    zh9Var = new zh9(this, lq4Var);
                }
                Object obj11 = zh9Var.d;
                int i19 = zh9Var.e;
                if (i19 != 0) {
                    if (i19 == 1) {
                        ch3.d0(obj11);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj11);
                if (r5h.X0((String) obj)) {
                    return sbiVar;
                }
                zh9Var.e = 1;
                return yx6Var.emit(obj, zh9Var) == obj2 ? obj2 : sbiVar;
            case 9:
                if (lq4Var instanceof dr9) {
                    dr9Var = (dr9) lq4Var;
                    int i20 = dr9Var.e;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        dr9Var.e = i20 - Integer.MIN_VALUE;
                    } else {
                        dr9Var = new dr9(this, lq4Var);
                    }
                } else {
                    dr9Var = new dr9(this, lq4Var);
                }
                Object obj12 = dr9Var.d;
                int i21 = dr9Var.e;
                if (i21 == 0) {
                    ch3.d0(obj12);
                    int iOrdinal = ((ssc) obj).ordinal();
                    if (iOrdinal == 0) {
                        z = true;
                    } else if (iOrdinal != 1) {
                        ore.o();
                    }
                    Object objValueOf = Boolean.valueOf(z);
                    dr9Var.e = 1;
                    return yx6Var.emit(objValueOf, dr9Var) == obj2 ? obj2 : sbiVar;
                }
                if (i21 == 1) {
                    ch3.d0(obj12);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lq4Var instanceof wr9) {
                    wr9Var = (wr9) lq4Var;
                    int i22 = wr9Var.e;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        wr9Var.e = i22 - Integer.MIN_VALUE;
                    } else {
                        wr9Var = new wr9(this, lq4Var);
                    }
                } else {
                    wr9Var = new wr9(this, lq4Var);
                }
                Object obj13 = wr9Var.d;
                int i23 = wr9Var.e;
                if (i23 == 0) {
                    ch3.d0(obj13);
                    int iOrdinal2 = ((lhd) obj).ordinal();
                    if (iOrdinal2 == 0) {
                        z = true;
                    } else if (iOrdinal2 != 1) {
                        ore.o();
                    }
                    Object objValueOf2 = Boolean.valueOf(z);
                    wr9Var.e = 1;
                    return yx6Var.emit(objValueOf2, wr9Var) == obj2 ? obj2 : sbiVar;
                }
                if (i23 == 1) {
                    ch3.d0(obj13);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lq4Var instanceof xr9) {
                    xr9Var = (xr9) lq4Var;
                    int i24 = xr9Var.e;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        xr9Var.e = i24 - Integer.MIN_VALUE;
                    } else {
                        xr9Var = new xr9(this, lq4Var);
                    }
                } else {
                    xr9Var = new xr9(this, lq4Var);
                }
                Object obj14 = xr9Var.d;
                int i25 = xr9Var.e;
                if (i25 == 0) {
                    ch3.d0(obj14);
                    Object objValueOf3 = Boolean.valueOf(!((List) obj).isEmpty());
                    xr9Var.e = 1;
                    return yx6Var.emit(objValueOf3, xr9Var) == obj2 ? obj2 : sbiVar;
                }
                if (i25 == 1) {
                    ch3.d0(obj14);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lq4Var instanceof yr9) {
                    yr9Var = (yr9) lq4Var;
                    int i26 = yr9Var.e;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        yr9Var.e = i26 - Integer.MIN_VALUE;
                    } else {
                        yr9Var = new yr9(this, lq4Var);
                    }
                } else {
                    yr9Var = new yr9(this, lq4Var);
                }
                Object obj15 = yr9Var.d;
                int i27 = yr9Var.e;
                if (i27 == 0) {
                    ch3.d0(obj15);
                    Object objValueOf4 = Boolean.valueOf(!((List) obj).isEmpty());
                    yr9Var.e = 1;
                    return yx6Var.emit(objValueOf4, yr9Var) == obj2 ? obj2 : sbiVar;
                }
                if (i27 == 1) {
                    ch3.d0(obj15);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lq4Var instanceof iw9) {
                    iw9Var = (iw9) lq4Var;
                    int i28 = iw9Var.e;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        iw9Var.e = i28 - Integer.MIN_VALUE;
                    } else {
                        iw9Var = new iw9(this, lq4Var);
                    }
                } else {
                    iw9Var = new iw9(this, lq4Var);
                }
                Object obj16 = iw9Var.d;
                int i29 = iw9Var.e;
                if (i29 != 0) {
                    if (i29 == 1) {
                        ch3.d0(obj16);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj16);
                if (!(obj instanceof qw9)) {
                    return sbiVar;
                }
                iw9Var.e = 1;
                return yx6Var.emit(obj, iw9Var) == obj2 ? obj2 : sbiVar;
            case 14:
                if (lq4Var instanceof bx9) {
                    bx9Var = (bx9) lq4Var;
                    int i30 = bx9Var.e;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        bx9Var.e = i30 - Integer.MIN_VALUE;
                    } else {
                        bx9Var = new bx9(this, lq4Var);
                    }
                } else {
                    bx9Var = new bx9(this, lq4Var);
                }
                Object obj17 = bx9Var.d;
                int i31 = bx9Var.e;
                if (i31 != 0) {
                    if (i31 == 1) {
                        ch3.d0(obj17);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj17);
                if (!(obj instanceof qw9)) {
                    return sbiVar;
                }
                bx9Var.e = 1;
                return yx6Var.emit(obj, bx9Var) == obj2 ? obj2 : sbiVar;
            case 15:
                if (lq4Var instanceof iz9) {
                    iz9Var = (iz9) lq4Var;
                    int i32 = iz9Var.e;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        iz9Var.e = i32 - Integer.MIN_VALUE;
                    } else {
                        iz9Var = new iz9(this, lq4Var);
                    }
                } else {
                    iz9Var = new iz9(this, lq4Var);
                }
                Object obj18 = iz9Var.d;
                int i33 = iz9Var.e;
                if (i33 != 0) {
                    if (i33 == 1) {
                        ch3.d0(obj18);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj18);
                if (!((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                iz9Var.e = 1;
                return yx6Var.emit(obj, iz9Var) == obj2 ? obj2 : sbiVar;
            case 16:
                if (lq4Var instanceof p1a) {
                    p1aVar = (p1a) lq4Var;
                    int i34 = p1aVar.e;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        p1aVar.e = i34 - Integer.MIN_VALUE;
                    } else {
                        p1aVar = new p1a(this, lq4Var);
                    }
                } else {
                    p1aVar = new p1a(this, lq4Var);
                }
                Object obj19 = p1aVar.d;
                int i35 = p1aVar.e;
                if (i35 == 0) {
                    ch3.d0(obj19);
                    jp4 jp4Var = (jp4) obj;
                    if ((jp4Var instanceof fp4) || cqk.d(jp4Var, gp4.a)) {
                        z = true;
                    } else if (!cqk.d(jp4Var, hp4.a)) {
                        ore.o();
                    }
                    Object objValueOf5 = Boolean.valueOf(z);
                    p1aVar.e = 1;
                    return yx6Var.emit(objValueOf5, p1aVar) == obj2 ? obj2 : sbiVar;
                }
                if (i35 == 1) {
                    ch3.d0(obj19);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lq4Var instanceof z1a) {
                    z1aVar = (z1a) lq4Var;
                    int i36 = z1aVar.e;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        z1aVar.e = i36 - Integer.MIN_VALUE;
                    } else {
                        z1aVar = new z1a(this, lq4Var);
                    }
                } else {
                    z1aVar = new z1a(this, lq4Var);
                }
                Object obj20 = z1aVar.d;
                int i37 = z1aVar.e;
                if (i37 != 0) {
                    if (i37 == 1) {
                        ch3.d0(obj20);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj20);
                t1a t1aVar = (t1a) obj;
                long j = t1aVar.a;
                Object l4dVar = j == 0 ? l4d.c : new l4d(j, t1aVar.c);
                z1aVar.e = 1;
                return yx6Var.emit(l4dVar, z1aVar) == obj2 ? obj2 : sbiVar;
            case 18:
                if (lq4Var instanceof a2a) {
                    a2aVar = (a2a) lq4Var;
                    int i38 = a2aVar.e;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        a2aVar.e = i38 - Integer.MIN_VALUE;
                    } else {
                        a2aVar = new a2a(this, lq4Var);
                    }
                } else {
                    a2aVar = new a2a(this, lq4Var);
                }
                Object obj21 = a2aVar.d;
                int i39 = a2aVar.e;
                if (i39 != 0) {
                    if (i39 == 1) {
                        ch3.d0(obj21);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj21);
                if (((l1j) obj).f != k1j.f) {
                    return sbiVar;
                }
                a2aVar.e = 1;
                return yx6Var.emit(obj, a2aVar) == obj2 ? obj2 : sbiVar;
            case 19:
                if (lq4Var instanceof eaa) {
                    eaaVar = (eaa) lq4Var;
                    int i40 = eaaVar.e;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        eaaVar.e = i40 - Integer.MIN_VALUE;
                    } else {
                        eaaVar = new eaa(this, lq4Var);
                    }
                } else {
                    eaaVar = new eaa(this, lq4Var);
                }
                Object obj22 = eaaVar.d;
                int i41 = eaaVar.e;
                if (i41 != 0) {
                    if (i41 == 1) {
                        ch3.d0(obj22);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj22);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    vg4 vg4VarW = ((rt2) it2.next()).w();
                    if (vg4VarW != null) {
                        arrayList2.add(vg4VarW);
                    }
                }
                eaaVar.e = 1;
                return yx6Var.emit(arrayList2, eaaVar) == obj2 ? obj2 : sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                if (lq4Var instanceof zma) {
                    zmaVar = (zma) lq4Var;
                    int i42 = zmaVar.e;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        zmaVar.e = i42 - Integer.MIN_VALUE;
                    } else {
                        zmaVar = new zma(this, lq4Var);
                    }
                } else {
                    zmaVar = new zma(this, lq4Var);
                }
                Object obj23 = zmaVar.d;
                int i43 = zmaVar.e;
                if (i43 != 0) {
                    if (i43 == 1) {
                        ch3.d0(obj23);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj23);
                if (((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                zmaVar.e = 1;
                return yx6Var.emit(obj, zmaVar) == obj2 ? obj2 : sbiVar;
            case 21:
                if (lq4Var instanceof woa) {
                    woaVar = (woa) lq4Var;
                    int i44 = woaVar.e;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        woaVar.e = i44 - Integer.MIN_VALUE;
                    } else {
                        woaVar = new woa(this, lq4Var);
                    }
                } else {
                    woaVar = new woa(this, lq4Var);
                }
                Object obj24 = woaVar.d;
                int i45 = woaVar.e;
                if (i45 != 0) {
                    if (i45 == 1) {
                        ch3.d0(obj24);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj24);
                if (!(obj instanceof rga)) {
                    return sbiVar;
                }
                woaVar.e = 1;
                return yx6Var.emit(obj, woaVar) == obj2 ? obj2 : sbiVar;
            case 22:
                if (lq4Var instanceof xoa) {
                    xoaVar = (xoa) lq4Var;
                    int i46 = xoaVar.e;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        xoaVar.e = i46 - Integer.MIN_VALUE;
                    } else {
                        xoaVar = new xoa(this, lq4Var);
                    }
                } else {
                    xoaVar = new xoa(this, lq4Var);
                }
                Object obj25 = xoaVar.d;
                int i47 = xoaVar.e;
                if (i47 != 0) {
                    if (i47 == 1) {
                        ch3.d0(obj25);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj25);
                if (!(obj instanceof jga)) {
                    return sbiVar;
                }
                xoaVar.e = 1;
                return yx6Var.emit(obj, xoaVar) == obj2 ? obj2 : sbiVar;
            case 23:
                if (lq4Var instanceof yoa) {
                    yoaVar = (yoa) lq4Var;
                    int i48 = yoaVar.e;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        yoaVar.e = i48 - Integer.MIN_VALUE;
                    } else {
                        yoaVar = new yoa(this, lq4Var);
                    }
                } else {
                    yoaVar = new yoa(this, lq4Var);
                }
                Object obj26 = yoaVar.d;
                int i49 = yoaVar.e;
                if (i49 != 0) {
                    if (i49 == 1) {
                        ch3.d0(obj26);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj26);
                tga tgaVar = (tga) obj;
                if ((tgaVar instanceof rga) || (tgaVar instanceof jga)) {
                    return sbiVar;
                }
                yoaVar.e = 1;
                return yx6Var.emit(obj, yoaVar) == obj2 ? obj2 : sbiVar;
            case 24:
                if (lq4Var instanceof zoa) {
                    zoaVar = (zoa) lq4Var;
                    int i50 = zoaVar.e;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        zoaVar.e = i50 - Integer.MIN_VALUE;
                    } else {
                        zoaVar = new zoa(this, lq4Var);
                    }
                } else {
                    zoaVar = new zoa(this, lq4Var);
                }
                Object obj27 = zoaVar.d;
                int i51 = zoaVar.e;
                if (i51 != 0) {
                    if (i51 == 1 || i51 == 2) {
                        ch3.d0(obj27);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj27);
                List list2 = (List) obj;
                if (list2.size() == 1) {
                    Object obj28 = list2.get(0);
                    zoaVar.e = 1;
                    if (yx6Var.emit(obj28, zoaVar) != obj2) {
                        return sbiVar;
                    }
                } else {
                    pw pwVar = new pw(0);
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        pwVar.addAll(((rga) it3.next()).a);
                    }
                    Object rgaVar = new rga(pwVar);
                    zoaVar.e = 2;
                    if (yx6Var.emit(rgaVar, zoaVar) != obj2) {
                        return sbiVar;
                    }
                }
                return obj2;
            case 25:
                if (lq4Var instanceof esa) {
                    esaVar = (esa) lq4Var;
                    int i52 = esaVar.e;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        esaVar.e = i52 - Integer.MIN_VALUE;
                    } else {
                        esaVar = new esa(this, lq4Var);
                    }
                } else {
                    esaVar = new esa(this, lq4Var);
                }
                Object obj29 = esaVar.d;
                int i53 = esaVar.e;
                if (i53 != 0) {
                    if (i53 == 1) {
                        ch3.d0(obj29);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj29);
                l8b l8bVar = new l8b();
                pu6 pu6Var = new pu6(yhf.m0(new sw(1, (List) obj), dz7.g));
                while (pu6Var.hasNext()) {
                    qia qiaVar = ((MessageModel) pu6Var.next()).D;
                    if (qiaVar != null && !qiaVar.equals(qia.d)) {
                        l8bVar.i(qiaVar.a, qiaVar);
                    }
                }
                esaVar.e = 1;
                return yx6Var.emit(l8bVar, esaVar) == obj2 ? obj2 : sbiVar;
            case 26:
                if (lq4Var instanceof fsa) {
                    fsaVar = (fsa) lq4Var;
                    int i54 = fsaVar.e;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        fsaVar.e = i54 - Integer.MIN_VALUE;
                    } else {
                        fsaVar = new fsa(this, lq4Var);
                    }
                } else {
                    fsaVar = new fsa(this, lq4Var);
                }
                Object obj30 = fsaVar.d;
                int i55 = fsaVar.e;
                if (i55 != 0) {
                    if (i55 == 1) {
                        ch3.d0(obj30);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj30);
                opa opaVar = (opa) obj;
                List list3 = opaVar.a;
                boolean z2 = list3.isEmpty() && !opaVar.equals(opa.d);
                if (!list3.isEmpty()) {
                    ListIterator listIterator = list3.listIterator(list3.size());
                    while (listIterator.hasPrevious()) {
                        Object objPrevious = listIterator.previous();
                        if (!((MessageModel) objPrevious).w()) {
                            objW = objPrevious;
                            if (objW == null) {
                                z = true;
                            }
                        }
                    }
                    if (objW == null) {
                        z = true;
                    }
                }
                Object ylcVar = new ylc(Boolean.valueOf(z2), Boolean.valueOf(z));
                fsaVar.e = 1;
                return yx6Var.emit(ylcVar, fsaVar) == obj2 ? obj2 : sbiVar;
            case 27:
                if (lq4Var instanceof hsa) {
                    hsaVar = (hsa) lq4Var;
                    int i56 = hsaVar.e;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        hsaVar.e = i56 - Integer.MIN_VALUE;
                    } else {
                        hsaVar = new hsa(this, lq4Var);
                    }
                } else {
                    hsaVar = new hsa(this, lq4Var);
                }
                Object obj31 = hsaVar.d;
                int i57 = hsaVar.e;
                if (i57 != 0) {
                    if (i57 == 1) {
                        ch3.d0(obj31);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj31);
                rt2 rt2Var = (rt2) obj;
                objW = rt2Var != null ? rt2Var.w() : null;
                hsaVar.e = 1;
                return yx6Var.emit(objW, hsaVar) == obj2 ? obj2 : sbiVar;
            case 28:
                if (lq4Var instanceof eta) {
                    etaVar = (eta) lq4Var;
                    int i58 = etaVar.e;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        etaVar.e = i58 - Integer.MIN_VALUE;
                    } else {
                        etaVar = new eta(this, lq4Var);
                    }
                } else {
                    etaVar = new eta(this, lq4Var);
                }
                Object obj32 = etaVar.d;
                int i59 = etaVar.e;
                if (i59 != 0) {
                    if (i59 == 1) {
                        ch3.d0(obj32);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj32);
                if (((l8b) obj).e == 0) {
                    return sbiVar;
                }
                etaVar.e = 1;
                return yx6Var.emit(obj, etaVar) == obj2 ? obj2 : sbiVar;
            default:
                if (lq4Var instanceof zva) {
                    zvaVar = (zva) lq4Var;
                    int i60 = zvaVar.e;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        zvaVar.e = i60 - Integer.MIN_VALUE;
                    } else {
                        zvaVar = new zva(this, lq4Var);
                    }
                } else {
                    zvaVar = new zva(this, lq4Var);
                }
                Object obj33 = zvaVar.d;
                int i61 = zvaVar.e;
                if (i61 != 0) {
                    if (i61 == 1) {
                        ch3.d0(obj33);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj33);
                if (!(obj instanceof z94)) {
                    return sbiVar;
                }
                zvaVar.e = 1;
                return yx6Var.emit(obj, zvaVar) == obj2 ? obj2 : sbiVar;
        }
    }

    public /* synthetic */ eh8(yx6 yx6Var, int i) {
        this.a = i;
        this.b = yx6Var;
    }
}
