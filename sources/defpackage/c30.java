package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class c30 implements s00, xhe {
    public final /* synthetic */ int a = 1;
    public String b;
    public long c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public c30(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, f33 f33Var, long j, Set set, xz9 xz9Var) {
        this.d = f33Var;
        this.c = j;
        this.e = set;
        this.f = xz9Var;
        this.b = zo5.j(j, "ChatMediaRemoteDataSource#");
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
    }

    public f60 a() {
        return new f60(this);
    }

    public void b(long j) {
        this.c = j;
    }

    public void c(String str) {
        this.e = str;
    }

    public void d(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public void f(String str) {
        this.d = str;
    }

    public void g(String str) {
        this.g = str;
    }

    public void h(String str) {
        this.h = str;
    }

    public void i(String str) {
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    @Override // defpackage.s00
    public Object j(Collection collection, nq4 nq4Var) {
        z20 z20Var;
        hu4 hu4Var;
        switch (this.a) {
            case 0:
                if (nq4Var instanceof z20) {
                    z20Var = (z20) nq4Var;
                    int i = z20Var.f;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        z20Var.f = i - Integer.MIN_VALUE;
                    } else {
                        z20Var = new z20(this, nq4Var);
                    }
                } else {
                    z20Var = new z20(this, nq4Var);
                }
                Object objJ = z20Var.d;
                int i2 = z20Var.f;
                if (i2 == 0) {
                    ch3.d0(objJ);
                    w20 w20Var = (w20) this.i;
                    z20Var.f = 1;
                    objJ = w20Var.j(collection, z20Var);
                    hu4Var = hu4.a;
                    if (objJ != hu4Var) {
                    }
                    Object obj = hu4Var;
                    return obj;
                }
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objJ);
                Object obj2 = hu4Var;
                List list = (List) objJ;
                gm0.n(this.b, "getHistoryItems: result count: " + list.size());
                obj2 = list;
                Object obj3 = hu4Var;
                return obj3;
            default:
                return ((f33) this.d).j(collection, nq4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
    
        if (r3 == r10) goto L43;
     */
    @Override // defpackage.s00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(long r24, int r26, long r27, defpackage.nq4 r29) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c30.m(long, int, long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r7 == r10) goto L45;
     */
    @Override // defpackage.s00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(long r19, int r21, long r22, defpackage.nq4 r24) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c30.q(long, int, long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0349  */
    /* JADX WARN: Code duplicated, block: B:103:0x0362  */
    /* JADX WARN: Code duplicated, block: B:105:0x036d  */
    /* JADX WARN: Code duplicated, block: B:111:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:112:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:120:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:124:0x0401  */
    /* JADX WARN: Code duplicated, block: B:125:0x0410  */
    /* JADX WARN: Code duplicated, block: B:128:0x047e  */
    /* JADX WARN: Code duplicated, block: B:131:0x049d  */
    /* JADX WARN: Code duplicated, block: B:133:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:134:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:138:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:139:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:142:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:143:0x04de  */
    /* JADX WARN: Code duplicated, block: B:148:0x0561  */
    /* JADX WARN: Code duplicated, block: B:150:0x0570  */
    /* JADX WARN: Code duplicated, block: B:153:0x0586  */
    /* JADX WARN: Code duplicated, block: B:154:0x058b  */
    /* JADX WARN: Code duplicated, block: B:162:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:283:0x097e  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b9 A[PHI: r10
  0x01b9: PHI (r10v30 hu4) = (r10v29 hu4), (r10v40 hu4) binds: [B:46:0x01b7, B:78:0x02ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x0207  */
    /* JADX WARN: Code duplicated, block: B:67:0x020a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0212  */
    /* JADX WARN: Code duplicated, block: B:70:0x0245  */
    /* JADX WARN: Code duplicated, block: B:75:0x0283  */
    /* JADX WARN: Code duplicated, block: B:77:0x028d  */
    /* JADX WARN: Code duplicated, block: B:80:0x02be  */
    /* JADX WARN: Code duplicated, block: B:83:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x02fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0309  */
    /* JADX WARN: Code duplicated, block: B:98:0x0310  */
    /* JADX WARN: Code duplicated, block: B:99:0x0318  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // defpackage.xhe
    public Object s(long j, int i, int i2, long j2, long j3, nq4 nq4Var) {
        y20 y20Var;
        ufe ufeVar;
        String str;
        y20 y20Var2;
        rt2 rt2Var;
        long j4;
        int i3;
        Object objN;
        hu4 hu4Var;
        int i4;
        hu4 hu4Var2;
        long j5;
        vfe vfeVar;
        long j6;
        vfe vfeVar2;
        long j7;
        vfe vfeVar3;
        ufe ufeVar2;
        long j8;
        fz2 fz2Var;
        long j9;
        String str2;
        vfe vfeVar4;
        String str3;
        String str4;
        long j10;
        long j11;
        int i5;
        long j12;
        int i6;
        vfe vfeVar5;
        a0b a0bVar;
        long jO;
        long j13;
        long j14;
        long j15;
        ufe ufeVar3;
        int i7;
        ufe ufeVar4;
        vfe vfeVar6;
        vfe vfeVar7;
        long j16;
        final fz2 fz2Var2;
        long j17;
        hu4 hu4Var3;
        af7 af7Var;
        fz2 fz2Var3;
        fz2 fz2Var4;
        x33 x33Var;
        je9 je9Var;
        Object objV;
        int i8;
        int i9;
        long j18;
        long j19;
        long j20;
        hu4 hu4Var4;
        rt2 rt2Var2;
        long j21;
        String str5;
        hu4 hu4Var5;
        String str6;
        je9 je9Var2;
        long j22;
        hu4 hu4Var6;
        long j23;
        int i10;
        rt2 rt2Var3;
        long j24;
        wz9 wz9Var;
        sfa sfaVar;
        long j25;
        int i11;
        int i12;
        String str7;
        je9 je9Var3;
        String str8;
        wz9 wz9Var2;
        long j26;
        long j27;
        long j28;
        Object obj;
        wz9 wz9Var3;
        long j29;
        long j30;
        long j31;
        int i13;
        long j32;
        long j33;
        int i14;
        long j34;
        hu4 hu4Var7;
        long j35;
        long j36;
        Object objF;
        wz9 wz9Var4;
        long j37;
        Object obj2;
        long j38;
        long j39;
        int i15;
        int i16;
        long j40;
        String str9;
        sfa sfaVar2;
        long j41;
        String str10;
        a4c a4cVar;
        long j42;
        je9 je9Var4;
        String str11;
        String str12;
        Long l;
        Long l2;
        String str13;
        long j43;
        a4c a4cVar2;
        Long l3;
        Long l4;
        sfa sfaVar3;
        long j44;
        int i17;
        rt2 rt2Var4;
        Object objN2;
        hu4 hu4Var8;
        long j45;
        long j46;
        long j47;
        long j48;
        int i18;
        rt2 rt2Var5;
        sfa sfaVar4;
        long j49;
        String str14;
        a4c a4cVar3;
        je9 je9Var5;
        Long l5;
        Long l6;
        v13 v13Var;
        final int i19;
        final long j50;
        final v13 v13Var2;
        final int i20;
        String str15;
        a4c a4cVar4;
        gda gdaVar;
        Long l7;
        gda gdaVar2;
        Long l8;
        wz9 wz9Var5;
        int i21;
        int i22;
        long j51;
        v13 v13Var3;
        int i23;
        sfa sfaVar5;
        final long j52;
        switch (this.a) {
            case 0:
                mg5 mg5Var = (mg5) this.d;
                String str16 = this.b;
                if (nq4Var instanceof y20) {
                    y20Var = (y20) nq4Var;
                    int i24 = y20Var.t;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        y20Var.t = i24 - Integer.MIN_VALUE;
                    } else {
                        y20Var = new y20(this, nq4Var);
                    }
                } else {
                    y20Var = new y20(this, nq4Var);
                }
                Object obj3 = y20Var.r;
                hu4 hu4Var9 = hu4.a;
                int i25 = y20Var.t;
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (i25 == 0) {
                                                                ch3.d0(obj3);
                                                                rt2 rt2Var6 = (rt2) ((ks9) this.f).mo41apply(new Long(this.c));
                                                                if (rt2Var6 != null) {
                                                                    nx2 nx2Var = rt2Var6.b;
                                                                    if (nx2Var.a != 0 || rt2Var6.y0()) {
                                                                        vfe vfeVar8 = new vfe();
                                                                        vfeVar8.a = j;
                                                                        ufe ufeVar5 = new ufe();
                                                                        ufeVar5.a = i2;
                                                                        ufeVar = new ufe();
                                                                        ufeVar.a = i;
                                                                        vfe vfeVar9 = new vfe();
                                                                        vfeVar9.a = j2;
                                                                        vfe vfeVar10 = new vfe();
                                                                        vfeVar10.a = j3;
                                                                        gm0.m(str16, "getMessages: %s, backwardCount: %s, forwardCount: %d, backwardLimit: %s, forwardLimit: %s", vd7.K(new Long(vfeVar8.a)), new Integer(ufeVar.a), new Integer(ufeVar5.a), new Long(vfeVar9.a), new Long(vfeVar10.a));
                                                                        if (vfeVar9.a < 0) {
                                                                            vfeVar9.a = 0L;
                                                                        }
                                                                        if (vfeVar10.a < 0) {
                                                                            vfeVar10.a = 0L;
                                                                        }
                                                                        long j53 = vfeVar8.a;
                                                                        long j54 = vfeVar9.a;
                                                                        if (mg5Var.a()) {
                                                                            str = str16;
                                                                            y20Var2 = y20Var;
                                                                            vfeVar8.a = Math.max(1L, j53);
                                                                            if ((rt2Var6.d0() || rt2Var6.e0()) && ufeVar.a > 0) {
                                                                                vfeVar8.a = Math.max(1L, j54);
                                                                                vfeVar9.a = j53;
                                                                            }
                                                                        } else {
                                                                            str = str16;
                                                                            y20Var2 = y20Var;
                                                                        }
                                                                        wy2 wy2Var = new wy2(nx2Var.a, vfeVar8.a, ufeVar5.a, vfeVar10.a, ufeVar.a, vfeVar9.a, true, true, (mg5) this.d, "", (Long) null, np0.q);
                                                                        if (mg5Var.a()) {
                                                                            vfeVar8.a = j53;
                                                                            vfeVar9.a = j54;
                                                                        }
                                                                        lq4 lq4Var = null;
                                                                        j3 j3VarX0 = e9i.x0(new bye(new f00(this, wy2Var, lq4Var, 5)), BuildConfig.MAX_TIME_TO_UPLOAD, new sfd(this, lq4Var, 11));
                                                                        rt2Var = rt2Var6;
                                                                        y20Var = y20Var2;
                                                                        y20Var.k = rt2Var;
                                                                        y20Var.l = vfeVar8;
                                                                        y20Var.m = ufeVar5;
                                                                        y20Var.n = ufeVar;
                                                                        y20Var.o = vfeVar9;
                                                                        y20Var.p = vfeVar10;
                                                                        j4 = j;
                                                                        y20Var.d = j4;
                                                                        i3 = i;
                                                                        y20Var.i = i3;
                                                                        y20Var.j = i2;
                                                                        y20Var.e = j2;
                                                                        y20Var.f = j3;
                                                                        y20Var.g = j53;
                                                                        y20Var.h = j54;
                                                                        y20Var.t = 1;
                                                                        objN = e9i.N(j3VarX0, y20Var);
                                                                        hu4Var = hu4Var9;
                                                                        if (objN != hu4Var) {
                                                                            i4 = i2;
                                                                            hu4Var2 = hu4Var;
                                                                            j5 = j54;
                                                                            vfeVar = vfeVar10;
                                                                            j6 = j53;
                                                                            vfeVar2 = vfeVar9;
                                                                            j7 = j3;
                                                                            vfeVar3 = vfeVar8;
                                                                            ufeVar2 = ufeVar5;
                                                                            j8 = j2;
                                                                        }
                                                                        return hu4Var;
                                                                    }
                                                                }
                                                                gm0.n(str16, "getMessages: chat is null or chat.getServerId() == 0, return");
                                                                return new Integer(0);
                                                            }
                                                            if (i25 == 1) {
                                                                long j55 = y20Var.h;
                                                                long j56 = y20Var.g;
                                                                long j57 = y20Var.f;
                                                                j8 = y20Var.e;
                                                                int i26 = y20Var.j;
                                                                i3 = y20Var.i;
                                                                long j58 = y20Var.d;
                                                                vfe vfeVar11 = y20Var.p;
                                                                vfe vfeVar12 = y20Var.o;
                                                                ufe ufeVar6 = y20Var.n;
                                                                ufe ufeVar7 = y20Var.m;
                                                                vfe vfeVar13 = y20Var.l;
                                                                rt2 rt2Var7 = y20Var.k;
                                                                ch3.d0(obj3);
                                                                rt2Var = rt2Var7;
                                                                objN = obj3;
                                                                j6 = j56;
                                                                j5 = j55;
                                                                ufeVar2 = ufeVar7;
                                                                vfeVar3 = vfeVar13;
                                                                str = str16;
                                                                hu4Var2 = hu4Var9;
                                                                ufeVar = ufeVar6;
                                                                vfeVar = vfeVar11;
                                                                j4 = j58;
                                                                i4 = i26;
                                                                vfeVar2 = vfeVar12;
                                                                j7 = j57;
                                                            } else {
                                                                if (i25 == 2) {
                                                                    long j59 = y20Var.h;
                                                                    j16 = y20Var.g;
                                                                    long j60 = y20Var.f;
                                                                    j12 = y20Var.e;
                                                                    i6 = y20Var.j;
                                                                    int i27 = y20Var.i;
                                                                    long j61 = y20Var.d;
                                                                    fz2 fz2Var5 = y20Var.q;
                                                                    vfeVar5 = y20Var.p;
                                                                    vfeVar6 = y20Var.o;
                                                                    ufeVar4 = y20Var.n;
                                                                    ufeVar3 = y20Var.m;
                                                                    vfeVar7 = y20Var.l;
                                                                    rt2 rt2Var8 = y20Var.k;
                                                                    try {
                                                                        ch3.d0(obj3);
                                                                        rt2Var = rt2Var8;
                                                                        i7 = i27;
                                                                        hu4Var = hu4Var9;
                                                                        j10 = j59;
                                                                        j4 = j61;
                                                                        j7 = j60;
                                                                        fz2Var = fz2Var5;
                                                                        hu4Var3 = hu4Var;
                                                                        fz2Var2 = fz2Var;
                                                                        j17 = j7;
                                                                        break;
                                                                    } catch (TimeoutCancellationException e) {
                                                                        e = e;
                                                                        rt2Var = rt2Var8;
                                                                        vfeVar = vfeVar5;
                                                                        j11 = j16;
                                                                        str4 = str16;
                                                                        hu4Var2 = hu4Var9;
                                                                        j10 = j59;
                                                                        vfeVar4 = vfeVar6;
                                                                        ufeVar = ufeVar4;
                                                                        ufeVar2 = ufeVar3;
                                                                        vfeVar3 = vfeVar7;
                                                                        i3 = i27;
                                                                        j4 = j61;
                                                                        fz2Var = fz2Var5;
                                                                        j7 = j60;
                                                                        gm0.V(str4, "fail to request missed contacts, timeout", e);
                                                                        vfeVar5 = vfeVar;
                                                                        vfeVar7 = vfeVar3;
                                                                        ufeVar3 = ufeVar2;
                                                                        i7 = i3;
                                                                        fz2Var2 = fz2Var;
                                                                        ufeVar4 = ufeVar;
                                                                        vfeVar6 = vfeVar4;
                                                                        j17 = j7;
                                                                        j16 = j11;
                                                                        hu4Var3 = hu4Var2;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        rt2Var = rt2Var8;
                                                                        j11 = j16;
                                                                        i5 = i27;
                                                                        hu4Var2 = hu4Var9;
                                                                        j10 = j59;
                                                                        vfeVar4 = vfeVar6;
                                                                        ufeVar = ufeVar4;
                                                                        ufeVar2 = ufeVar3;
                                                                        vfeVar3 = vfeVar7;
                                                                        str3 = str16;
                                                                        j4 = j61;
                                                                        j7 = j60;
                                                                        fz2Var = fz2Var5;
                                                                        gm0.V(str3, "fail to request missed contacts", th);
                                                                        i7 = i5;
                                                                        vfeVar7 = vfeVar3;
                                                                        ufeVar3 = ufeVar2;
                                                                        fz2Var2 = fz2Var;
                                                                        ufeVar4 = ufeVar;
                                                                        vfeVar6 = vfeVar4;
                                                                        j17 = j7;
                                                                        j16 = j11;
                                                                        hu4Var3 = hu4Var2;
                                                                    }
                                                                    long j62 = j10;
                                                                    final vfe vfeVar14 = vfeVar5;
                                                                    final rt2 rt2Var9 = rt2Var;
                                                                    final vfe vfeVar15 = vfeVar6;
                                                                    final ufe ufeVar8 = ufeVar4;
                                                                    final ufe ufeVar9 = ufeVar3;
                                                                    final vfe vfeVar16 = vfeVar7;
                                                                    af7Var = new af7() { // from class: x20
                                                                        @Override // defpackage.af7
                                                                        public final Object invoke() {
                                                                            c30 c30Var = this.a;
                                                                            ((kz2) c30Var.g).b(0L, rt2Var9.a, vfeVar16.a, ufeVar9.a, vfeVar14.a, ufeVar8.a, vfeVar15.a, fz2Var2, (mg5) c30Var.d, true);
                                                                            return sbi.a;
                                                                        }
                                                                    };
                                                                    fz2Var3 = fz2Var2;
                                                                    y20Var.k = null;
                                                                    y20Var.l = null;
                                                                    y20Var.m = null;
                                                                    y20Var.n = null;
                                                                    y20Var.o = null;
                                                                    y20Var.p = null;
                                                                    y20Var.q = fz2Var3;
                                                                    y20Var.d = j4;
                                                                    y20Var.i = i7;
                                                                    y20Var.j = i6;
                                                                    y20Var.e = j12;
                                                                    y20Var.f = j17;
                                                                    y20Var.g = j16;
                                                                    y20Var.h = j62;
                                                                    y20Var.t = 3;
                                                                    hu4Var = hu4Var3;
                                                                    if (qyj.V(k66.a, af7Var, y20Var) != hu4Var) {
                                                                        fz2Var4 = fz2Var3;
                                                                    }
                                                                    return hu4Var;
                                                                }
                                                                if (i25 != 3) {
                                                                    ore.k("call to 'resume' before 'invoke' with coroutine");
                                                                    return null;
                                                                }
                                                                fz2Var4 = y20Var.q;
                                                                ch3.d0(obj3);
                                                            }
                                                            return new Integer(fz2Var4.c.size());
                                                            y20Var.t = 2;
                                                            hu4Var = hu4Var2;
                                                            if (a0bVar.k(fz2Var, jO, y20Var) != hu4Var) {
                                                                ufeVar3 = ufeVar2;
                                                                i7 = i3;
                                                                ufeVar4 = ufeVar;
                                                                vfeVar6 = vfeVar4;
                                                                j12 = j9;
                                                                i6 = i4;
                                                                vfeVar7 = vfeVar3;
                                                                vfeVar5 = vfeVar;
                                                                j16 = j11;
                                                                hu4Var3 = hu4Var;
                                                                fz2Var2 = fz2Var;
                                                                j17 = j7;
                                                                long j63 = j10;
                                                                final vfe vfeVar17 = vfeVar5;
                                                                final rt2 rt2Var10 = rt2Var;
                                                                final vfe vfeVar18 = vfeVar6;
                                                                final ufe ufeVar10 = ufeVar4;
                                                                final ufe ufeVar11 = ufeVar3;
                                                                final vfe vfeVar19 = vfeVar7;
                                                                af7Var = new af7() { // from class: x20
                                                                    @Override // defpackage.af7
                                                                    public final Object invoke() {
                                                                        c30 c30Var = this.a;
                                                                        ((kz2) c30Var.g).b(0L, rt2Var10.a, vfeVar19.a, ufeVar11.a, vfeVar17.a, ufeVar10.a, vfeVar18.a, fz2Var2, (mg5) c30Var.d, true);
                                                                        return sbi.a;
                                                                    }
                                                                };
                                                                fz2Var3 = fz2Var2;
                                                                y20Var.k = null;
                                                                y20Var.l = null;
                                                                y20Var.m = null;
                                                                y20Var.n = null;
                                                                y20Var.o = null;
                                                                y20Var.p = null;
                                                                y20Var.q = fz2Var3;
                                                                y20Var.d = j4;
                                                                y20Var.i = i7;
                                                                y20Var.j = i6;
                                                                y20Var.e = j12;
                                                                y20Var.f = j17;
                                                                y20Var.g = j16;
                                                                y20Var.h = j63;
                                                                y20Var.t = 3;
                                                                hu4Var = hu4Var3;
                                                                if (qyj.V(k66.a, af7Var, y20Var) != hu4Var) {
                                                                    fz2Var4 = fz2Var3;
                                                                    return new Integer(fz2Var4.c.size());
                                                                }
                                                            }
                                                        } catch (TimeoutCancellationException e2) {
                                                            e = e2;
                                                            str4 = str3;
                                                            j12 = j9;
                                                            i6 = i4;
                                                            gm0.V(str4, "fail to request missed contacts, timeout", e);
                                                            vfeVar5 = vfeVar;
                                                            vfeVar7 = vfeVar3;
                                                            ufeVar3 = ufeVar2;
                                                            i7 = i3;
                                                            fz2Var2 = fz2Var;
                                                            ufeVar4 = ufeVar;
                                                            vfeVar6 = vfeVar4;
                                                            j17 = j7;
                                                            j16 = j11;
                                                            hu4Var3 = hu4Var2;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            i5 = i3;
                                                            j12 = j9;
                                                            i6 = i4;
                                                            vfeVar5 = vfeVar;
                                                            gm0.V(str3, "fail to request missed contacts", th);
                                                            i7 = i5;
                                                            vfeVar7 = vfeVar3;
                                                            ufeVar3 = ufeVar2;
                                                            fz2Var2 = fz2Var;
                                                            ufeVar4 = ufeVar;
                                                            vfeVar6 = vfeVar4;
                                                            j17 = j7;
                                                            j16 = j11;
                                                            hu4Var3 = hu4Var2;
                                                        }
                                                        y20Var.h = j15;
                                                        j10 = j15;
                                                    } catch (TimeoutCancellationException e3) {
                                                        e = e3;
                                                        j10 = j15;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        j10 = j15;
                                                    }
                                                    y20Var.g = j14;
                                                    j11 = j14;
                                                    j15 = j5;
                                                } catch (TimeoutCancellationException e4) {
                                                    e = e4;
                                                    j11 = j14;
                                                    j10 = j5;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    j11 = j14;
                                                    j10 = j5;
                                                }
                                                y20Var.f = j13;
                                                j7 = j13;
                                                j14 = j6;
                                            } catch (TimeoutCancellationException e5) {
                                                e = e5;
                                                j7 = j13;
                                                j10 = j5;
                                                j11 = j6;
                                                str4 = str3;
                                                j12 = j9;
                                                i6 = i4;
                                                gm0.V(str4, "fail to request missed contacts, timeout", e);
                                                vfeVar5 = vfeVar;
                                                vfeVar7 = vfeVar3;
                                                ufeVar3 = ufeVar2;
                                                i7 = i3;
                                                fz2Var2 = fz2Var;
                                                ufeVar4 = ufeVar;
                                                vfeVar6 = vfeVar4;
                                                j17 = j7;
                                                j16 = j11;
                                                hu4Var3 = hu4Var2;
                                                long j64 = j10;
                                                final vfe vfeVar110 = vfeVar5;
                                                final rt2 rt2Var11 = rt2Var;
                                                final vfe vfeVar111 = vfeVar6;
                                                final ufe ufeVar12 = ufeVar4;
                                                final ufe ufeVar13 = ufeVar3;
                                                final vfe vfeVar112 = vfeVar7;
                                                af7Var = new af7() { // from class: x20
                                                    @Override // defpackage.af7
                                                    public final Object invoke() {
                                                        c30 c30Var = this.a;
                                                        ((kz2) c30Var.g).b(0L, rt2Var11.a, vfeVar112.a, ufeVar13.a, vfeVar110.a, ufeVar12.a, vfeVar111.a, fz2Var2, (mg5) c30Var.d, true);
                                                        return sbi.a;
                                                    }
                                                };
                                                fz2Var3 = fz2Var2;
                                                y20Var.k = null;
                                                y20Var.l = null;
                                                y20Var.m = null;
                                                y20Var.n = null;
                                                y20Var.o = null;
                                                y20Var.p = null;
                                                y20Var.q = fz2Var3;
                                                y20Var.d = j4;
                                                y20Var.i = i7;
                                                y20Var.j = i6;
                                                y20Var.e = j12;
                                                y20Var.f = j17;
                                                y20Var.g = j16;
                                                y20Var.h = j64;
                                                y20Var.t = 3;
                                                hu4Var = hu4Var3;
                                                if (qyj.V(k66.a, af7Var, y20Var) != hu4Var) {
                                                    fz2Var4 = fz2Var3;
                                                    return new Integer(fz2Var4.c.size());
                                                }
                                                return hu4Var;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                j7 = j13;
                                                j10 = j5;
                                                j11 = j6;
                                                i5 = i3;
                                                j12 = j9;
                                                i6 = i4;
                                                vfeVar5 = vfeVar;
                                                gm0.V(str3, "fail to request missed contacts", th);
                                                i7 = i5;
                                                vfeVar7 = vfeVar3;
                                                ufeVar3 = ufeVar2;
                                                fz2Var2 = fz2Var;
                                                ufeVar4 = ufeVar;
                                                vfeVar6 = vfeVar4;
                                                j17 = j7;
                                                j16 = j11;
                                                hu4Var3 = hu4Var2;
                                                long j65 = j10;
                                                final vfe vfeVar113 = vfeVar5;
                                                final rt2 rt2Var12 = rt2Var;
                                                final vfe vfeVar114 = vfeVar6;
                                                final ufe ufeVar14 = ufeVar4;
                                                final ufe ufeVar15 = ufeVar3;
                                                final vfe vfeVar115 = vfeVar7;
                                                af7Var = new af7() { // from class: x20
                                                    @Override // defpackage.af7
                                                    public final Object invoke() {
                                                        c30 c30Var = this.a;
                                                        ((kz2) c30Var.g).b(0L, rt2Var12.a, vfeVar115.a, ufeVar15.a, vfeVar113.a, ufeVar14.a, vfeVar114.a, fz2Var2, (mg5) c30Var.d, true);
                                                        return sbi.a;
                                                    }
                                                };
                                                fz2Var3 = fz2Var2;
                                                y20Var.k = null;
                                                y20Var.l = null;
                                                y20Var.m = null;
                                                y20Var.n = null;
                                                y20Var.o = null;
                                                y20Var.p = null;
                                                y20Var.q = fz2Var3;
                                                y20Var.d = j4;
                                                y20Var.i = i7;
                                                y20Var.j = i6;
                                                y20Var.e = j12;
                                                y20Var.f = j17;
                                                y20Var.g = j16;
                                                y20Var.h = j65;
                                                y20Var.t = 3;
                                                hu4Var = hu4Var3;
                                                if (qyj.V(k66.a, af7Var, y20Var) != hu4Var) {
                                                    fz2Var4 = fz2Var3;
                                                    return new Integer(fz2Var4.c.size());
                                                }
                                                return hu4Var;
                                            }
                                            y20Var.e = j9;
                                            j9 = j9;
                                            j13 = j7;
                                        } catch (TimeoutCancellationException e6) {
                                            e = e6;
                                            j9 = j9;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            j9 = j9;
                                        }
                                        jO = qe7.O(2, lw5.SECONDS);
                                        y20Var.k = rt2Var;
                                        y20Var.l = vfeVar3;
                                        y20Var.m = ufeVar2;
                                        y20Var.n = ufeVar;
                                        y20Var.o = vfeVar2;
                                        y20Var.p = vfeVar;
                                        y20Var.q = fz2Var;
                                        y20Var.d = j4;
                                        y20Var.i = i3;
                                        y20Var.j = i4;
                                        vfeVar4 = vfeVar2;
                                    } catch (TimeoutCancellationException e7) {
                                        e = e7;
                                        vfeVar4 = vfeVar2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        vfeVar4 = vfeVar2;
                                    }
                                    ghb ghbVar = ew5.b;
                                    str3 = str2;
                                } catch (TimeoutCancellationException e8) {
                                    e = e8;
                                    vfeVar4 = vfeVar2;
                                    str3 = str2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    vfeVar4 = vfeVar2;
                                    str3 = str2;
                                }
                                a0bVar = (a0b) this.h;
                            } catch (TimeoutCancellationException e9) {
                                e = e9;
                                str4 = str2;
                                vfeVar4 = vfeVar2;
                                hu4Var2 = hu4Var2;
                                j10 = j5;
                                j11 = j6;
                                j12 = j9;
                                i6 = i4;
                                gm0.V(str4, "fail to request missed contacts, timeout", e);
                                vfeVar5 = vfeVar;
                                vfeVar7 = vfeVar3;
                                ufeVar3 = ufeVar2;
                                i7 = i3;
                                fz2Var2 = fz2Var;
                                ufeVar4 = ufeVar;
                                vfeVar6 = vfeVar4;
                                j17 = j7;
                                j16 = j11;
                                hu4Var3 = hu4Var2;
                                long j66 = j10;
                                final vfe vfeVar116 = vfeVar5;
                                final rt2 rt2Var13 = rt2Var;
                                final vfe vfeVar117 = vfeVar6;
                                final ufe ufeVar16 = ufeVar4;
                                final ufe ufeVar17 = ufeVar3;
                                final vfe vfeVar118 = vfeVar7;
                                af7Var = new af7() { // from class: x20
                                    @Override // defpackage.af7
                                    public final Object invoke() {
                                        c30 c30Var = this.a;
                                        ((kz2) c30Var.g).b(0L, rt2Var13.a, vfeVar118.a, ufeVar17.a, vfeVar116.a, ufeVar16.a, vfeVar117.a, fz2Var2, (mg5) c30Var.d, true);
                                        return sbi.a;
                                    }
                                };
                                fz2Var3 = fz2Var2;
                                y20Var.k = null;
                                y20Var.l = null;
                                y20Var.m = null;
                                y20Var.n = null;
                                y20Var.o = null;
                                y20Var.p = null;
                                y20Var.q = fz2Var3;
                                y20Var.d = j4;
                                y20Var.i = i7;
                                y20Var.j = i6;
                                y20Var.e = j12;
                                y20Var.f = j17;
                                y20Var.g = j16;
                                y20Var.h = j66;
                                y20Var.t = 3;
                                hu4Var = hu4Var3;
                                if (qyj.V(k66.a, af7Var, y20Var) != hu4Var) {
                                    fz2Var4 = fz2Var3;
                                    return new Integer(fz2Var4.c.size());
                                }
                                return hu4Var;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            vfeVar4 = vfeVar2;
                            str3 = str2;
                        }
                        break;
                    } catch (TimeoutCancellationException e10) {
                        e = e10;
                        str4 = str2;
                    }
                    fz2Var = (fz2) objN;
                    j9 = j8;
                    str2 = str;
                    gm0.n(str2, "response received " + fz2Var);
                    return hu4Var;
                } catch (CancellationException e11) {
                    throw e11;
                }
            default:
                je9 je9Var6 = je9.d;
                if (nq4Var instanceof x33) {
                    x33Var = (x33) nq4Var;
                    int i28 = x33Var.p;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        x33Var.p = i28 - Integer.MIN_VALUE;
                    } else {
                        x33Var = new x33(this, nq4Var);
                    }
                } else {
                    x33Var = new x33(this, nq4Var);
                }
                Object obj4 = x33Var.n;
                hu4 hu4Var10 = hu4.a;
                int i29 = x33Var.p;
                Object obj5 = obj4;
                if (i29 == 0) {
                    ch3.d0(obj5);
                    xn3 xn3Var = (xn3) ((ny8) this.g).getValue();
                    long j67 = this.c;
                    x33Var.d = j;
                    x33Var.h = i;
                    x33Var.i = i2;
                    x33Var.e = j2;
                    x33Var.f = j3;
                    je9Var = je9Var6;
                    x33Var.p = 1;
                    objV = xn3Var.v(j67, x33Var);
                    if (objV == hu4Var10) {
                        hu4Var4 = hu4Var10;
                    } else {
                        i8 = i;
                        i9 = i2;
                        j18 = j2;
                        j19 = j;
                        j20 = j3;
                    }
                    x33Var = x33Var;
                    return hu4Var4;
                }
                if (i29 == 1) {
                    j20 = x33Var.f;
                    j18 = x33Var.e;
                    i9 = x33Var.i;
                    i8 = x33Var.h;
                    j19 = x33Var.d;
                    ch3.d0(obj5);
                    objV = obj5;
                    je9Var = je9Var6;
                } else {
                    if (i29 == 2) {
                        long j68 = x33Var.g;
                        long j69 = x33Var.f;
                        long j70 = x33Var.e;
                        int i30 = x33Var.i;
                        i13 = x33Var.h;
                        j31 = x33Var.d;
                        sfa sfaVar6 = x33Var.l;
                        wz9 wz9Var6 = x33Var.k;
                        rt2 rt2Var14 = x33Var.j;
                        ch3.d0(obj5);
                        i12 = i30;
                        je9Var = je9Var6;
                        hu4Var5 = hu4Var10;
                        obj = obj5;
                        str9 = "\n                    |";
                        rt2Var2 = rt2Var14;
                        wz9Var3 = wz9Var6;
                        sfaVar = sfaVar6;
                        str5 = ", \n                    |selectTime:";
                        j29 = j70;
                        j32 = j69;
                        j30 = j68;
                        sfaVar2 = (sfa) obj;
                        if (sfaVar2 == null && sfaVar != null) {
                            j41 = j31;
                            if (sfaVar2.c >= sfaVar.c) {
                            }
                            str10 = this.b;
                            a4cVar = gm0.f;
                            if (a4cVar == null) {
                                j42 = j30;
                                str11 = str9;
                                str12 = str5;
                                je9Var4 = je9Var;
                            } else {
                                j42 = j30;
                                je9Var4 = je9Var;
                                if (a4cVar.b(je9Var4)) {
                                    if (sfaVar != null) {
                                        l = new Long(sfaVar.c);
                                    } else {
                                        l = null;
                                    }
                                    if (sfaVar2 != null) {
                                        l2 = new Long(sfaVar2.c);
                                    } else {
                                        l2 = null;
                                    }
                                    long j71 = wz9Var3.b;
                                    StringBuilder sb = new StringBuilder("Media loader. After find forwardId, \n                    |anchorTime:");
                                    sb.append(l);
                                    str12 = str5;
                                    sb.append(str12);
                                    sb.append(l2);
                                    sb.append("\n                    |markers.forward:");
                                    sb.append(j71);
                                    str11 = str9;
                                    sb.append(str11);
                                    a4cVar.c(je9Var4, str10, s5h.y0(sb.toString()), null);
                                } else {
                                    str11 = str9;
                                    str12 = str5;
                                }
                            }
                            i11 = i13;
                            je9Var3 = je9Var4;
                            str8 = str11;
                            str7 = str12;
                            j26 = j29;
                            wz9Var2 = wz9Var3;
                            j21 = j41;
                            j27 = j42;
                            j28 = j32;
                            i14 = i12;
                            if (i11 > 0) {
                                hu4Var7 = hu4Var5;
                                j35 = j27;
                                if (wz9Var2.a != 0) {
                                    sua suaVar = (sua) ((ny8) this.h).getValue();
                                    long j72 = wz9Var2.a;
                                    x33Var.j = rt2Var2;
                                    x33Var.k = wz9Var2;
                                    x33Var.l = sfaVar;
                                    x33Var.d = j21;
                                    x33Var.h = i11;
                                    x33Var.i = i14;
                                    x33Var.e = j26;
                                    x33Var.f = j28;
                                    j36 = j26;
                                    x33Var.g = j35;
                                    x33Var.p = 3;
                                    objF = suaVar.f(j72, x33Var);
                                    hu4Var5 = hu4Var7;
                                    if (objF == hu4Var5) {
                                        hu4Var4 = hu4Var5;
                                    } else {
                                        wz9Var4 = wz9Var2;
                                        j37 = j35;
                                        obj2 = objF;
                                        j38 = j28;
                                        j39 = j21;
                                        i15 = i11;
                                        i16 = i14;
                                        j40 = j36;
                                        sfaVar4 = (sfa) obj2;
                                        if (sfaVar4 == null) {
                                            j49 = j39;
                                            j37 = wz9Var4.a;
                                        } else {
                                            j49 = j39;
                                            j37 = wz9Var4.a;
                                        }
                                        str14 = this.b;
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 == null) {
                                            i16 = i16;
                                            j38 = j38;
                                            str6 = str8;
                                            je9Var5 = je9Var3;
                                        } else {
                                            je9Var5 = je9Var3;
                                            if (a4cVar3.b(je9Var5)) {
                                                if (sfaVar != null) {
                                                    l5 = new Long(sfaVar.c);
                                                } else {
                                                    l5 = null;
                                                }
                                                if (sfaVar4 != null) {
                                                    l6 = new Long(sfaVar4.c);
                                                } else {
                                                    l6 = null;
                                                }
                                                long j73 = wz9Var4.a;
                                                StringBuilder sb2 = new StringBuilder("Media loader. After find backwardId, \n                    |anchorTime:");
                                                sb2.append(l5);
                                                sb2.append(str7);
                                                sb2.append(l6);
                                                sb2.append("\n                    |markers.backward:");
                                                sb2.append(j73);
                                                str6 = str8;
                                                sb2.append(str6);
                                                a4cVar3.c(je9Var5, str14, s5h.y0(sb2.toString()), null);
                                            } else {
                                                i16 = i16;
                                                j38 = j38;
                                                str6 = str8;
                                            }
                                        }
                                        j22 = j38;
                                        i10 = i16;
                                        rt2Var3 = rt2Var2;
                                        wz9Var = wz9Var4;
                                        je9Var2 = je9Var5;
                                        j33 = j37;
                                        j25 = j40;
                                        i11 = i15;
                                        hu4Var6 = hu4Var5;
                                        j24 = j49;
                                        str13 = this.b;
                                        j43 = j25;
                                        a4cVar2 = gm0.f;
                                        if (a4cVar2 == null) {
                                            sfaVar = sfaVar;
                                        } else {
                                            if (sfaVar != null) {
                                                l3 = new Long(sfaVar.c);
                                            } else {
                                                l3 = null;
                                            }
                                            if (sfaVar != null) {
                                                l4 = new Long(sfaVar.b);
                                            } else {
                                                l4 = null;
                                            }
                                            a4cVar2.c(je9Var2, str13, s5h.y0("Media loader. Before request, \n                    |anchorTime:" + l3 + ",\n                    |anchorId:" + l4 + ",\n                    |markers.backward:" + wz9Var.a + str6), null);
                                        }
                                        if (j33 == 0) {
                                            gm0.n(this.b, "Media loader. Don't request media if messageId == 0");
                                            return new Integer(-1);
                                        }
                                        lq4 lq4Var2 = null;
                                        j3 j3Var = new j3(new bye(new f00(this, new wy2(rt2Var3.b.a, new Long(j33), (Set) this.e, new Integer(i10), new Integer(i11)), lq4Var2, 17)), 15, new y33(this, lq4Var2, 0));
                                        x33Var.j = rt2Var3;
                                        x33Var.k = null;
                                        sfaVar3 = sfaVar;
                                        x33Var.l = sfaVar3;
                                        j44 = j24;
                                        x33Var.d = j44;
                                        x33Var.h = i11;
                                        x33Var.i = i10;
                                        x33Var.e = j43;
                                        i17 = i10;
                                        rt2Var4 = rt2Var3;
                                        x33Var.f = j22;
                                        x33Var.g = j33;
                                        x33Var.p = 4;
                                        objN2 = e9i.N(j3Var, x33Var);
                                        hu4Var4 = hu4Var6;
                                        if (objN2 != hu4Var4) {
                                            x33Var = x33Var;
                                            hu4Var8 = hu4Var4;
                                            j45 = j22;
                                            j46 = j33;
                                            j47 = j43;
                                            obj5 = objN2;
                                            j48 = j44;
                                            i18 = i11;
                                            rt2Var5 = rt2Var4;
                                            v13Var = (v13) obj5;
                                            if (v13Var.h().isEmpty()) {
                                                i19 = i18;
                                                j50 = j48;
                                                v13Var2 = v13Var;
                                                i20 = i17;
                                            } else {
                                                str15 = this.b;
                                                long j74 = j45;
                                                a4cVar4 = gm0.f;
                                                if (a4cVar4 == null) {
                                                    i17 = i17;
                                                    wz9Var5 = null;
                                                } else {
                                                    gdaVar = (gda) ww3.t1(v13Var.h());
                                                    if (gdaVar != null) {
                                                        l7 = new Long(gdaVar.b);
                                                    } else {
                                                        l7 = null;
                                                    }
                                                    gdaVar2 = (gda) ww3.D1(v13Var.h());
                                                    if (gdaVar2 != null) {
                                                        l8 = new Long(gdaVar2.b);
                                                    } else {
                                                        l8 = null;
                                                    }
                                                    wz9Var5 = null;
                                                    a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                                                }
                                                sua suaVar2 = (sua) ((ny8) this.h).getValue();
                                                long j75 = rt2Var5.a;
                                                List listH = v13Var.h();
                                                x33Var.j = rt2Var5;
                                                x33Var.k = wz9Var5;
                                                x33Var.l = sfaVar3;
                                                x33Var.m = v13Var;
                                                x33Var.d = j48;
                                                x33Var.h = i18;
                                                i21 = i17;
                                                x33Var.i = i21;
                                                x33Var.e = j47;
                                                x33Var.f = j74;
                                                x33Var.g = j46;
                                                x33Var.p = 5;
                                                ose oseVar = (ose) suaVar2.a;
                                                oseVar.e().a(new zre(listH, null, oseVar, j75, suaVar2.l(), true));
                                                hu4Var4 = hu4Var8;
                                                if (sbi.a != hu4Var4) {
                                                    i22 = i18;
                                                    j51 = j48;
                                                    v13Var3 = v13Var;
                                                    i23 = i21;
                                                    sfaVar5 = sfaVar3;
                                                }
                                            }
                                            xn3 xn3Var2 = (xn3) ((ny8) this.g).getValue();
                                            final long j76 = rt2Var5.a;
                                            if (sfaVar3 != null) {
                                                j52 = sfaVar3.a;
                                            } else {
                                                j52 = 0;
                                            }
                                            final Set set = (Set) this.e;
                                            final qw2 qw2VarJ = xn3Var2.j();
                                            qw2VarJ.getClass();
                                            qw2VarJ.v(j76, false, new tg4() { // from class: mw2
                                                @Override // defpackage.tg4
                                                public final void accept(Object obj6) {
                                                    ww2 ww2Var;
                                                    Object value;
                                                    tw2 tw2Var = (tw2) obj6;
                                                    qw2 qw2Var = qw2VarJ;
                                                    dp5 dp5Var = qw2Var.u;
                                                    HashSet hashSet = w50.u;
                                                    Set set2 = set;
                                                    if (hashSet.equals(set2)) {
                                                        ww2Var = tw2Var.q;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.v.equals(set2)) {
                                                        ww2Var = tw2Var.r;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.w.equals(set2)) {
                                                        ww2Var = tw2Var.s;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.x.equals(set2)) {
                                                        ww2Var = tw2Var.t;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.y.equals(set2)) {
                                                        ww2Var = tw2Var.u;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.z.equals(set2)) {
                                                        ww2Var = tw2Var.v;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.A.equals(set2)) {
                                                        ww2Var = tw2Var.w;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.B.equals(set2)) {
                                                        ww2Var = tw2Var.x;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else {
                                                        ww2 ww2Var2 = ww2.f;
                                                        ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                                                    }
                                                    vw2 vw2VarA = ww2Var.a();
                                                    v13 v13Var4 = v13Var2;
                                                    vw2VarA.c = v13Var4.e;
                                                    boolean zIsEmpty = v13Var4.h().isEmpty();
                                                    int i31 = i19;
                                                    int i32 = i20;
                                                    long j77 = j76;
                                                    if (zIsEmpty) {
                                                        long j78 = j52;
                                                        if (i31 > 0) {
                                                            vw2VarA.a = j78;
                                                        }
                                                        if (i32 > 0) {
                                                            vw2VarA.b = j78;
                                                        }
                                                    } else {
                                                        List list = (List) vw2VarA.e;
                                                        List listH2 = v13Var4.h();
                                                        int i33 = sb8.j;
                                                        vw2VarA.e = sb8.r(list, listH2, j50, i31, 0L, i32, 0L, mg5.REGULAR);
                                                        if (i31 > 0 && v13Var4.h().size() < i31) {
                                                            gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                                            sfa sfaVarF = ((qfa) dp5Var.get()).f(j77, ((gda) v13Var4.h().get(0)).a);
                                                            if (sfaVarF != null) {
                                                                vw2VarA.a = sfaVarF.a;
                                                            } else {
                                                                gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                                            }
                                                        }
                                                        if (i32 > 0 && v13Var4.h().size() < i32) {
                                                            gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                                            sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j77, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                                            if (sfaVarF2 != null) {
                                                                vw2VarA.b = sfaVarF2.a;
                                                            } else {
                                                                gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                    wz9 wz9Var7 = new wz9(v13Var4.g, v13Var4.f, set2, j77);
                                                    f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j77), new am(5, new xk1(21)));
                                                    do {
                                                        value = f9bVar.getValue();
                                                    } while (!f9bVar.h(value, wz9Var7));
                                                    ww2 ww2VarA = vw2VarA.a();
                                                    if (hashSet.equals(set2)) {
                                                        tw2Var.q = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.v.equals(set2)) {
                                                        tw2Var.r = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.w.equals(set2)) {
                                                        tw2Var.s = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.x.equals(set2)) {
                                                        tw2Var.t = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.y.equals(set2)) {
                                                        tw2Var.u = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.z.equals(set2)) {
                                                        tw2Var.v = ww2VarA;
                                                    } else if (w50.A.equals(set2)) {
                                                        tw2Var.w = ww2VarA;
                                                    } else if (w50.B.equals(set2)) {
                                                        tw2Var.x = ww2VarA;
                                                    }
                                                }
                                            });
                                            return new Integer(v13Var2.h().size());
                                        }
                                    }
                                    x33Var = x33Var;
                                    return hu4Var4;
                                }
                                hu4Var5 = hu4Var7;
                                j34 = j35;
                            } else {
                                j34 = j27;
                            }
                            str6 = str8;
                            j25 = j26;
                            hu4Var6 = hu4Var5;
                            j23 = j34;
                            i10 = i14;
                            rt2Var3 = rt2Var2;
                            j24 = j21;
                            wz9Var = wz9Var2;
                            je9Var2 = je9Var3;
                            j22 = j28;
                            j33 = j23;
                            str13 = this.b;
                            j43 = j25;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 == null) {
                                sfaVar = sfaVar;
                            } else {
                                if (sfaVar != null) {
                                    l3 = new Long(sfaVar.c);
                                } else {
                                    l3 = null;
                                }
                                if (sfaVar != null) {
                                    l4 = new Long(sfaVar.b);
                                } else {
                                    l4 = null;
                                }
                                a4cVar2.c(je9Var2, str13, s5h.y0("Media loader. Before request, \n                    |anchorTime:" + l3 + ",\n                    |anchorId:" + l4 + ",\n                    |markers.backward:" + wz9Var.a + str6), null);
                            }
                            if (j33 == 0) {
                                gm0.n(this.b, "Media loader. Don't request media if messageId == 0");
                                return new Integer(-1);
                            }
                            lq4 lq4Var3 = null;
                            j3 j3Var2 = new j3(new bye(new f00(this, new wy2(rt2Var3.b.a, new Long(j33), (Set) this.e, new Integer(i10), new Integer(i11)), lq4Var3, 17)), 15, new y33(this, lq4Var3, 0));
                            x33Var.j = rt2Var3;
                            x33Var.k = null;
                            sfaVar3 = sfaVar;
                            x33Var.l = sfaVar3;
                            j44 = j24;
                            x33Var.d = j44;
                            x33Var.h = i11;
                            x33Var.i = i10;
                            x33Var.e = j43;
                            i17 = i10;
                            rt2Var4 = rt2Var3;
                            x33Var.f = j22;
                            x33Var.g = j33;
                            x33Var.p = 4;
                            objN2 = e9i.N(j3Var2, x33Var);
                            hu4Var4 = hu4Var6;
                            if (objN2 != hu4Var4) {
                                x33Var = x33Var;
                                hu4Var8 = hu4Var4;
                                j45 = j22;
                                j46 = j33;
                                j47 = j43;
                                obj5 = objN2;
                                j48 = j44;
                                i18 = i11;
                                rt2Var5 = rt2Var4;
                                v13Var = (v13) obj5;
                                if (v13Var.h().isEmpty()) {
                                    str15 = this.b;
                                    long j77 = j45;
                                    a4cVar4 = gm0.f;
                                    if (a4cVar4 == null) {
                                        i17 = i17;
                                        wz9Var5 = null;
                                    } else {
                                        gdaVar = (gda) ww3.t1(v13Var.h());
                                        if (gdaVar != null) {
                                            l7 = new Long(gdaVar.b);
                                        } else {
                                            l7 = null;
                                        }
                                        gdaVar2 = (gda) ww3.D1(v13Var.h());
                                        if (gdaVar2 != null) {
                                            l8 = new Long(gdaVar2.b);
                                        } else {
                                            l8 = null;
                                        }
                                        wz9Var5 = null;
                                        a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                                    }
                                    sua suaVar3 = (sua) ((ny8) this.h).getValue();
                                    long j78 = rt2Var5.a;
                                    List listH2 = v13Var.h();
                                    x33Var.j = rt2Var5;
                                    x33Var.k = wz9Var5;
                                    x33Var.l = sfaVar3;
                                    x33Var.m = v13Var;
                                    x33Var.d = j48;
                                    x33Var.h = i18;
                                    i21 = i17;
                                    x33Var.i = i21;
                                    x33Var.e = j47;
                                    x33Var.f = j77;
                                    x33Var.g = j46;
                                    x33Var.p = 5;
                                    ose oseVar2 = (ose) suaVar3.a;
                                    oseVar2.e().a(new zre(listH2, null, oseVar2, j78, suaVar3.l(), true));
                                    hu4Var4 = hu4Var8;
                                    if (sbi.a != hu4Var4) {
                                        i22 = i18;
                                        j51 = j48;
                                        v13Var3 = v13Var;
                                        i23 = i21;
                                        sfaVar5 = sfaVar3;
                                    }
                                } else {
                                    i19 = i18;
                                    j50 = j48;
                                    v13Var2 = v13Var;
                                    i20 = i17;
                                }
                                xn3 xn3Var3 = (xn3) ((ny8) this.g).getValue();
                                final long j79 = rt2Var5.a;
                                if (sfaVar3 != null) {
                                    j52 = sfaVar3.a;
                                } else {
                                    j52 = 0;
                                }
                                final Set set2 = (Set) this.e;
                                final qw2 qw2VarJ2 = xn3Var3.j();
                                qw2VarJ2.getClass();
                                qw2VarJ2.v(j79, false, new tg4() { // from class: mw2
                                    @Override // defpackage.tg4
                                    public final void accept(Object obj6) {
                                        ww2 ww2Var;
                                        Object value;
                                        tw2 tw2Var = (tw2) obj6;
                                        qw2 qw2Var = qw2VarJ2;
                                        dp5 dp5Var = qw2Var.u;
                                        HashSet hashSet = w50.u;
                                        Set set3 = set2;
                                        if (hashSet.equals(set3)) {
                                            ww2Var = tw2Var.q;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.v.equals(set3)) {
                                            ww2Var = tw2Var.r;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.w.equals(set3)) {
                                            ww2Var = tw2Var.s;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.x.equals(set3)) {
                                            ww2Var = tw2Var.t;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.y.equals(set3)) {
                                            ww2Var = tw2Var.u;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.z.equals(set3)) {
                                            ww2Var = tw2Var.v;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.A.equals(set3)) {
                                            ww2Var = tw2Var.w;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.B.equals(set3)) {
                                            ww2Var = tw2Var.x;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else {
                                            ww2 ww2Var2 = ww2.f;
                                            ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                                        }
                                        vw2 vw2VarA = ww2Var.a();
                                        v13 v13Var4 = v13Var2;
                                        vw2VarA.c = v13Var4.e;
                                        boolean zIsEmpty = v13Var4.h().isEmpty();
                                        int i31 = i19;
                                        int i32 = i20;
                                        long j710 = j79;
                                        if (zIsEmpty) {
                                            long j711 = j52;
                                            if (i31 > 0) {
                                                vw2VarA.a = j711;
                                            }
                                            if (i32 > 0) {
                                                vw2VarA.b = j711;
                                            }
                                        } else {
                                            List list = (List) vw2VarA.e;
                                            List listH3 = v13Var4.h();
                                            int i33 = sb8.j;
                                            vw2VarA.e = sb8.r(list, listH3, j50, i31, 0L, i32, 0L, mg5.REGULAR);
                                            if (i31 > 0 && v13Var4.h().size() < i31) {
                                                gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                                sfa sfaVarF = ((qfa) dp5Var.get()).f(j710, ((gda) v13Var4.h().get(0)).a);
                                                if (sfaVarF != null) {
                                                    vw2VarA.a = sfaVarF.a;
                                                } else {
                                                    gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                                }
                                            }
                                            if (i32 > 0 && v13Var4.h().size() < i32) {
                                                gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                                sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j710, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                                if (sfaVarF2 != null) {
                                                    vw2VarA.b = sfaVarF2.a;
                                                } else {
                                                    gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                                }
                                            }
                                        }
                                        wz9 wz9Var7 = new wz9(v13Var4.g, v13Var4.f, set3, j710);
                                        f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j710), new am(5, new xk1(21)));
                                        do {
                                            value = f9bVar.getValue();
                                        } while (!f9bVar.h(value, wz9Var7));
                                        ww2 ww2VarA = vw2VarA.a();
                                        if (hashSet.equals(set3)) {
                                            tw2Var.q = ww2VarA;
                                            return;
                                        }
                                        if (w50.v.equals(set3)) {
                                            tw2Var.r = ww2VarA;
                                            return;
                                        }
                                        if (w50.w.equals(set3)) {
                                            tw2Var.s = ww2VarA;
                                            return;
                                        }
                                        if (w50.x.equals(set3)) {
                                            tw2Var.t = ww2VarA;
                                            return;
                                        }
                                        if (w50.y.equals(set3)) {
                                            tw2Var.u = ww2VarA;
                                            return;
                                        }
                                        if (w50.z.equals(set3)) {
                                            tw2Var.v = ww2VarA;
                                        } else if (w50.A.equals(set3)) {
                                            tw2Var.w = ww2VarA;
                                        } else if (w50.B.equals(set3)) {
                                            tw2Var.x = ww2VarA;
                                        }
                                    }
                                });
                                return new Integer(v13Var2.h().size());
                            }
                            x33Var = x33Var;
                            return hu4Var4;
                        }
                        j41 = j31;
                        j30 = wz9Var3.b;
                        str10 = this.b;
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            j42 = j30;
                            str11 = str9;
                            str12 = str5;
                            je9Var4 = je9Var;
                        } else {
                            j42 = j30;
                            je9Var4 = je9Var;
                            if (a4cVar.b(je9Var4)) {
                                if (sfaVar != null) {
                                    l = new Long(sfaVar.c);
                                } else {
                                    l = null;
                                }
                                if (sfaVar2 != null) {
                                    l2 = new Long(sfaVar2.c);
                                } else {
                                    l2 = null;
                                }
                                long j710 = wz9Var3.b;
                                StringBuilder sb3 = new StringBuilder("Media loader. After find forwardId, \n                    |anchorTime:");
                                sb3.append(l);
                                str12 = str5;
                                sb3.append(str12);
                                sb3.append(l2);
                                sb3.append("\n                    |markers.forward:");
                                sb3.append(j710);
                                str11 = str9;
                                sb3.append(str11);
                                a4cVar.c(je9Var4, str10, s5h.y0(sb3.toString()), null);
                            } else {
                                str11 = str9;
                                str12 = str5;
                            }
                        }
                        i11 = i13;
                        je9Var3 = je9Var4;
                        str8 = str11;
                        str7 = str12;
                        j26 = j29;
                        wz9Var2 = wz9Var3;
                        j21 = j41;
                        j27 = j42;
                        j28 = j32;
                        i14 = i12;
                        if (i11 > 0) {
                            hu4Var7 = hu4Var5;
                            j35 = j27;
                            if (wz9Var2.a != 0) {
                                sua suaVar4 = (sua) ((ny8) this.h).getValue();
                                long j711 = wz9Var2.a;
                                x33Var.j = rt2Var2;
                                x33Var.k = wz9Var2;
                                x33Var.l = sfaVar;
                                x33Var.d = j21;
                                x33Var.h = i11;
                                x33Var.i = i14;
                                x33Var.e = j26;
                                x33Var.f = j28;
                                j36 = j26;
                                x33Var.g = j35;
                                x33Var.p = 3;
                                objF = suaVar4.f(j711, x33Var);
                                hu4Var5 = hu4Var7;
                                if (objF == hu4Var5) {
                                    hu4Var4 = hu4Var5;
                                } else {
                                    wz9Var4 = wz9Var2;
                                    j37 = j35;
                                    obj2 = objF;
                                    j38 = j28;
                                    j39 = j21;
                                    i15 = i11;
                                    i16 = i14;
                                    j40 = j36;
                                    sfaVar4 = (sfa) obj2;
                                    if (sfaVar4 == null) {
                                        j49 = j39;
                                        j37 = wz9Var4.a;
                                    } else {
                                        j49 = j39;
                                        j37 = wz9Var4.a;
                                    }
                                    str14 = this.b;
                                    a4cVar3 = gm0.f;
                                    if (a4cVar3 == null) {
                                        i16 = i16;
                                        j38 = j38;
                                        str6 = str8;
                                        je9Var5 = je9Var3;
                                    } else {
                                        je9Var5 = je9Var3;
                                        if (a4cVar3.b(je9Var5)) {
                                            if (sfaVar != null) {
                                                l5 = new Long(sfaVar.c);
                                            } else {
                                                l5 = null;
                                            }
                                            if (sfaVar4 != null) {
                                                l6 = new Long(sfaVar4.c);
                                            } else {
                                                l6 = null;
                                            }
                                            long j712 = wz9Var4.a;
                                            StringBuilder sb4 = new StringBuilder("Media loader. After find backwardId, \n                    |anchorTime:");
                                            sb4.append(l5);
                                            sb4.append(str7);
                                            sb4.append(l6);
                                            sb4.append("\n                    |markers.backward:");
                                            sb4.append(j712);
                                            str6 = str8;
                                            sb4.append(str6);
                                            a4cVar3.c(je9Var5, str14, s5h.y0(sb4.toString()), null);
                                        } else {
                                            i16 = i16;
                                            j38 = j38;
                                            str6 = str8;
                                        }
                                    }
                                    j22 = j38;
                                    i10 = i16;
                                    rt2Var3 = rt2Var2;
                                    wz9Var = wz9Var4;
                                    je9Var2 = je9Var5;
                                    j33 = j37;
                                    j25 = j40;
                                    i11 = i15;
                                    hu4Var6 = hu4Var5;
                                    j24 = j49;
                                    str13 = this.b;
                                    j43 = j25;
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 == null) {
                                        sfaVar = sfaVar;
                                    } else {
                                        if (sfaVar != null) {
                                            l3 = new Long(sfaVar.c);
                                        } else {
                                            l3 = null;
                                        }
                                        if (sfaVar != null) {
                                            l4 = new Long(sfaVar.b);
                                        } else {
                                            l4 = null;
                                        }
                                        a4cVar2.c(je9Var2, str13, s5h.y0("Media loader. Before request, \n                    |anchorTime:" + l3 + ",\n                    |anchorId:" + l4 + ",\n                    |markers.backward:" + wz9Var.a + str6), null);
                                    }
                                    if (j33 == 0) {
                                        gm0.n(this.b, "Media loader. Don't request media if messageId == 0");
                                        return new Integer(-1);
                                    }
                                    lq4 lq4Var4 = null;
                                    j3 j3Var3 = new j3(new bye(new f00(this, new wy2(rt2Var3.b.a, new Long(j33), (Set) this.e, new Integer(i10), new Integer(i11)), lq4Var4, 17)), 15, new y33(this, lq4Var4, 0));
                                    x33Var.j = rt2Var3;
                                    x33Var.k = null;
                                    sfaVar3 = sfaVar;
                                    x33Var.l = sfaVar3;
                                    j44 = j24;
                                    x33Var.d = j44;
                                    x33Var.h = i11;
                                    x33Var.i = i10;
                                    x33Var.e = j43;
                                    i17 = i10;
                                    rt2Var4 = rt2Var3;
                                    x33Var.f = j22;
                                    x33Var.g = j33;
                                    x33Var.p = 4;
                                    objN2 = e9i.N(j3Var3, x33Var);
                                    hu4Var4 = hu4Var6;
                                    if (objN2 != hu4Var4) {
                                        x33Var = x33Var;
                                        hu4Var8 = hu4Var4;
                                        j45 = j22;
                                        j46 = j33;
                                        j47 = j43;
                                        obj5 = objN2;
                                        j48 = j44;
                                        i18 = i11;
                                        rt2Var5 = rt2Var4;
                                        v13Var = (v13) obj5;
                                        if (v13Var.h().isEmpty()) {
                                            str15 = this.b;
                                            long j713 = j45;
                                            a4cVar4 = gm0.f;
                                            if (a4cVar4 == null) {
                                                i17 = i17;
                                                wz9Var5 = null;
                                            } else {
                                                gdaVar = (gda) ww3.t1(v13Var.h());
                                                if (gdaVar != null) {
                                                    l7 = new Long(gdaVar.b);
                                                } else {
                                                    l7 = null;
                                                }
                                                gdaVar2 = (gda) ww3.D1(v13Var.h());
                                                if (gdaVar2 != null) {
                                                    l8 = new Long(gdaVar2.b);
                                                } else {
                                                    l8 = null;
                                                }
                                                wz9Var5 = null;
                                                a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                                            }
                                            sua suaVar5 = (sua) ((ny8) this.h).getValue();
                                            long j714 = rt2Var5.a;
                                            List listH3 = v13Var.h();
                                            x33Var.j = rt2Var5;
                                            x33Var.k = wz9Var5;
                                            x33Var.l = sfaVar3;
                                            x33Var.m = v13Var;
                                            x33Var.d = j48;
                                            x33Var.h = i18;
                                            i21 = i17;
                                            x33Var.i = i21;
                                            x33Var.e = j47;
                                            x33Var.f = j713;
                                            x33Var.g = j46;
                                            x33Var.p = 5;
                                            ose oseVar3 = (ose) suaVar5.a;
                                            oseVar3.e().a(new zre(listH3, null, oseVar3, j714, suaVar5.l(), true));
                                            hu4Var4 = hu4Var8;
                                            if (sbi.a != hu4Var4) {
                                                i22 = i18;
                                                j51 = j48;
                                                v13Var3 = v13Var;
                                                i23 = i21;
                                                sfaVar5 = sfaVar3;
                                            }
                                        } else {
                                            i19 = i18;
                                            j50 = j48;
                                            v13Var2 = v13Var;
                                            i20 = i17;
                                        }
                                        xn3 xn3Var4 = (xn3) ((ny8) this.g).getValue();
                                        final long j715 = rt2Var5.a;
                                        if (sfaVar3 != null) {
                                            j52 = sfaVar3.a;
                                        } else {
                                            j52 = 0;
                                        }
                                        final Set set3 = (Set) this.e;
                                        final qw2 qw2VarJ3 = xn3Var4.j();
                                        qw2VarJ3.getClass();
                                        qw2VarJ3.v(j715, false, new tg4() { // from class: mw2
                                            @Override // defpackage.tg4
                                            public final void accept(Object obj6) {
                                                ww2 ww2Var;
                                                Object value;
                                                tw2 tw2Var = (tw2) obj6;
                                                qw2 qw2Var = qw2VarJ3;
                                                dp5 dp5Var = qw2Var.u;
                                                HashSet hashSet = w50.u;
                                                Set set4 = set3;
                                                if (hashSet.equals(set4)) {
                                                    ww2Var = tw2Var.q;
                                                    if (ww2Var == null) {
                                                        ww2Var = ww2.g;
                                                    }
                                                } else if (w50.v.equals(set4)) {
                                                    ww2Var = tw2Var.r;
                                                    if (ww2Var == null) {
                                                        ww2Var = ww2.g;
                                                    }
                                                } else if (w50.w.equals(set4)) {
                                                    ww2Var = tw2Var.s;
                                                    if (ww2Var == null) {
                                                        ww2Var = ww2.g;
                                                    }
                                                } else if (w50.x.equals(set4)) {
                                                    ww2Var = tw2Var.t;
                                                    if (ww2Var == null) {
                                                        ww2Var = ww2.g;
                                                    }
                                                } else if (w50.y.equals(set4)) {
                                                    ww2Var = tw2Var.u;
                                                    if (ww2Var == null) {
                                                        ww2Var = ww2.g;
                                                    }
                                                } else if (w50.z.equals(set4)) {
                                                    ww2Var = tw2Var.v;
                                                    if (ww2Var == null) {
                                                        ww2Var = ww2.g;
                                                    }
                                                } else if (w50.A.equals(set4)) {
                                                    ww2Var = tw2Var.w;
                                                    if (ww2Var == null) {
                                                        ww2Var = ww2.g;
                                                    }
                                                } else if (w50.B.equals(set4)) {
                                                    ww2Var = tw2Var.x;
                                                    if (ww2Var == null) {
                                                        ww2Var = ww2.g;
                                                    }
                                                } else {
                                                    ww2 ww2Var2 = ww2.f;
                                                    ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                                                }
                                                vw2 vw2VarA = ww2Var.a();
                                                v13 v13Var4 = v13Var2;
                                                vw2VarA.c = v13Var4.e;
                                                boolean zIsEmpty = v13Var4.h().isEmpty();
                                                int i31 = i19;
                                                int i32 = i20;
                                                long j716 = j715;
                                                if (zIsEmpty) {
                                                    long j717 = j52;
                                                    if (i31 > 0) {
                                                        vw2VarA.a = j717;
                                                    }
                                                    if (i32 > 0) {
                                                        vw2VarA.b = j717;
                                                    }
                                                } else {
                                                    List list = (List) vw2VarA.e;
                                                    List listH4 = v13Var4.h();
                                                    int i33 = sb8.j;
                                                    vw2VarA.e = sb8.r(list, listH4, j50, i31, 0L, i32, 0L, mg5.REGULAR);
                                                    if (i31 > 0 && v13Var4.h().size() < i31) {
                                                        gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                                        sfa sfaVarF = ((qfa) dp5Var.get()).f(j716, ((gda) v13Var4.h().get(0)).a);
                                                        if (sfaVarF != null) {
                                                            vw2VarA.a = sfaVarF.a;
                                                        } else {
                                                            gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                                        }
                                                    }
                                                    if (i32 > 0 && v13Var4.h().size() < i32) {
                                                        gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                                        sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j716, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                                        if (sfaVarF2 != null) {
                                                            vw2VarA.b = sfaVarF2.a;
                                                        } else {
                                                            gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                                        }
                                                    }
                                                }
                                                wz9 wz9Var7 = new wz9(v13Var4.g, v13Var4.f, set4, j716);
                                                f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j716), new am(5, new xk1(21)));
                                                do {
                                                    value = f9bVar.getValue();
                                                } while (!f9bVar.h(value, wz9Var7));
                                                ww2 ww2VarA = vw2VarA.a();
                                                if (hashSet.equals(set4)) {
                                                    tw2Var.q = ww2VarA;
                                                    return;
                                                }
                                                if (w50.v.equals(set4)) {
                                                    tw2Var.r = ww2VarA;
                                                    return;
                                                }
                                                if (w50.w.equals(set4)) {
                                                    tw2Var.s = ww2VarA;
                                                    return;
                                                }
                                                if (w50.x.equals(set4)) {
                                                    tw2Var.t = ww2VarA;
                                                    return;
                                                }
                                                if (w50.y.equals(set4)) {
                                                    tw2Var.u = ww2VarA;
                                                    return;
                                                }
                                                if (w50.z.equals(set4)) {
                                                    tw2Var.v = ww2VarA;
                                                } else if (w50.A.equals(set4)) {
                                                    tw2Var.w = ww2VarA;
                                                } else if (w50.B.equals(set4)) {
                                                    tw2Var.x = ww2VarA;
                                                }
                                            }
                                        });
                                        return new Integer(v13Var2.h().size());
                                    }
                                }
                                x33Var = x33Var;
                                return hu4Var4;
                            }
                            hu4Var5 = hu4Var7;
                            j34 = j35;
                        } else {
                            j34 = j27;
                        }
                        str6 = str8;
                        j25 = j26;
                        hu4Var6 = hu4Var5;
                        j23 = j34;
                        i10 = i14;
                        rt2Var3 = rt2Var2;
                        j24 = j21;
                        wz9Var = wz9Var2;
                        je9Var2 = je9Var3;
                        j22 = j28;
                        j33 = j23;
                        str13 = this.b;
                        j43 = j25;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null) {
                            sfaVar = sfaVar;
                        } else {
                            if (sfaVar != null) {
                                l3 = new Long(sfaVar.c);
                            } else {
                                l3 = null;
                            }
                            if (sfaVar != null) {
                                l4 = new Long(sfaVar.b);
                            } else {
                                l4 = null;
                            }
                            a4cVar2.c(je9Var2, str13, s5h.y0("Media loader. Before request, \n                    |anchorTime:" + l3 + ",\n                    |anchorId:" + l4 + ",\n                    |markers.backward:" + wz9Var.a + str6), null);
                        }
                        if (j33 == 0) {
                            gm0.n(this.b, "Media loader. Don't request media if messageId == 0");
                            return new Integer(-1);
                        }
                        lq4 lq4Var5 = null;
                        j3 j3Var4 = new j3(new bye(new f00(this, new wy2(rt2Var3.b.a, new Long(j33), (Set) this.e, new Integer(i10), new Integer(i11)), lq4Var5, 17)), 15, new y33(this, lq4Var5, 0));
                        x33Var.j = rt2Var3;
                        x33Var.k = null;
                        sfaVar3 = sfaVar;
                        x33Var.l = sfaVar3;
                        j44 = j24;
                        x33Var.d = j44;
                        x33Var.h = i11;
                        x33Var.i = i10;
                        x33Var.e = j43;
                        i17 = i10;
                        rt2Var4 = rt2Var3;
                        x33Var.f = j22;
                        x33Var.g = j33;
                        x33Var.p = 4;
                        objN2 = e9i.N(j3Var4, x33Var);
                        hu4Var4 = hu4Var6;
                        if (objN2 != hu4Var4) {
                            x33Var = x33Var;
                            hu4Var8 = hu4Var4;
                            j45 = j22;
                            j46 = j33;
                            j47 = j43;
                            obj5 = objN2;
                            j48 = j44;
                            i18 = i11;
                            rt2Var5 = rt2Var4;
                            v13Var = (v13) obj5;
                            if (v13Var.h().isEmpty()) {
                                str15 = this.b;
                                long j716 = j45;
                                a4cVar4 = gm0.f;
                                if (a4cVar4 == null) {
                                    i17 = i17;
                                    wz9Var5 = null;
                                } else {
                                    gdaVar = (gda) ww3.t1(v13Var.h());
                                    if (gdaVar != null) {
                                        l7 = new Long(gdaVar.b);
                                    } else {
                                        l7 = null;
                                    }
                                    gdaVar2 = (gda) ww3.D1(v13Var.h());
                                    if (gdaVar2 != null) {
                                        l8 = new Long(gdaVar2.b);
                                    } else {
                                        l8 = null;
                                    }
                                    wz9Var5 = null;
                                    a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                                }
                                sua suaVar6 = (sua) ((ny8) this.h).getValue();
                                long j717 = rt2Var5.a;
                                List listH4 = v13Var.h();
                                x33Var.j = rt2Var5;
                                x33Var.k = wz9Var5;
                                x33Var.l = sfaVar3;
                                x33Var.m = v13Var;
                                x33Var.d = j48;
                                x33Var.h = i18;
                                i21 = i17;
                                x33Var.i = i21;
                                x33Var.e = j47;
                                x33Var.f = j716;
                                x33Var.g = j46;
                                x33Var.p = 5;
                                ose oseVar4 = (ose) suaVar6.a;
                                oseVar4.e().a(new zre(listH4, null, oseVar4, j717, suaVar6.l(), true));
                                hu4Var4 = hu4Var8;
                                if (sbi.a != hu4Var4) {
                                    i22 = i18;
                                    j51 = j48;
                                    v13Var3 = v13Var;
                                    i23 = i21;
                                    sfaVar5 = sfaVar3;
                                }
                            } else {
                                i19 = i18;
                                j50 = j48;
                                v13Var2 = v13Var;
                                i20 = i17;
                            }
                            xn3 xn3Var5 = (xn3) ((ny8) this.g).getValue();
                            final long j718 = rt2Var5.a;
                            if (sfaVar3 != null) {
                                j52 = sfaVar3.a;
                            } else {
                                j52 = 0;
                            }
                            final Set set4 = (Set) this.e;
                            final qw2 qw2VarJ4 = xn3Var5.j();
                            qw2VarJ4.getClass();
                            qw2VarJ4.v(j718, false, new tg4() { // from class: mw2
                                @Override // defpackage.tg4
                                public final void accept(Object obj6) {
                                    ww2 ww2Var;
                                    Object value;
                                    tw2 tw2Var = (tw2) obj6;
                                    qw2 qw2Var = qw2VarJ4;
                                    dp5 dp5Var = qw2Var.u;
                                    HashSet hashSet = w50.u;
                                    Set set5 = set4;
                                    if (hashSet.equals(set5)) {
                                        ww2Var = tw2Var.q;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.v.equals(set5)) {
                                        ww2Var = tw2Var.r;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.w.equals(set5)) {
                                        ww2Var = tw2Var.s;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.x.equals(set5)) {
                                        ww2Var = tw2Var.t;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.y.equals(set5)) {
                                        ww2Var = tw2Var.u;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.z.equals(set5)) {
                                        ww2Var = tw2Var.v;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.A.equals(set5)) {
                                        ww2Var = tw2Var.w;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.B.equals(set5)) {
                                        ww2Var = tw2Var.x;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else {
                                        ww2 ww2Var2 = ww2.f;
                                        ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                                    }
                                    vw2 vw2VarA = ww2Var.a();
                                    v13 v13Var4 = v13Var2;
                                    vw2VarA.c = v13Var4.e;
                                    boolean zIsEmpty = v13Var4.h().isEmpty();
                                    int i31 = i19;
                                    int i32 = i20;
                                    long j719 = j718;
                                    if (zIsEmpty) {
                                        long j7110 = j52;
                                        if (i31 > 0) {
                                            vw2VarA.a = j7110;
                                        }
                                        if (i32 > 0) {
                                            vw2VarA.b = j7110;
                                        }
                                    } else {
                                        List list = (List) vw2VarA.e;
                                        List listH5 = v13Var4.h();
                                        int i33 = sb8.j;
                                        vw2VarA.e = sb8.r(list, listH5, j50, i31, 0L, i32, 0L, mg5.REGULAR);
                                        if (i31 > 0 && v13Var4.h().size() < i31) {
                                            gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                            sfa sfaVarF = ((qfa) dp5Var.get()).f(j719, ((gda) v13Var4.h().get(0)).a);
                                            if (sfaVarF != null) {
                                                vw2VarA.a = sfaVarF.a;
                                            } else {
                                                gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                            }
                                        }
                                        if (i32 > 0 && v13Var4.h().size() < i32) {
                                            gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                            sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j719, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                            if (sfaVarF2 != null) {
                                                vw2VarA.b = sfaVarF2.a;
                                            } else {
                                                gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                            }
                                        }
                                    }
                                    wz9 wz9Var7 = new wz9(v13Var4.g, v13Var4.f, set5, j719);
                                    f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j719), new am(5, new xk1(21)));
                                    do {
                                        value = f9bVar.getValue();
                                    } while (!f9bVar.h(value, wz9Var7));
                                    ww2 ww2VarA = vw2VarA.a();
                                    if (hashSet.equals(set5)) {
                                        tw2Var.q = ww2VarA;
                                        return;
                                    }
                                    if (w50.v.equals(set5)) {
                                        tw2Var.r = ww2VarA;
                                        return;
                                    }
                                    if (w50.w.equals(set5)) {
                                        tw2Var.s = ww2VarA;
                                        return;
                                    }
                                    if (w50.x.equals(set5)) {
                                        tw2Var.t = ww2VarA;
                                        return;
                                    }
                                    if (w50.y.equals(set5)) {
                                        tw2Var.u = ww2VarA;
                                        return;
                                    }
                                    if (w50.z.equals(set5)) {
                                        tw2Var.v = ww2VarA;
                                    } else if (w50.A.equals(set5)) {
                                        tw2Var.w = ww2VarA;
                                    } else if (w50.B.equals(set5)) {
                                        tw2Var.x = ww2VarA;
                                    }
                                }
                            });
                            return new Integer(v13Var2.h().size());
                        }
                        x33Var = x33Var;
                        return hu4Var4;
                    }
                    if (i29 == 3) {
                        long j80 = x33Var.g;
                        j38 = x33Var.f;
                        j40 = x33Var.e;
                        int i31 = x33Var.i;
                        i15 = x33Var.h;
                        j37 = j80;
                        j39 = x33Var.d;
                        sfa sfaVar7 = x33Var.l;
                        wz9 wz9Var7 = x33Var.k;
                        rt2 rt2Var15 = x33Var.j;
                        ch3.d0(obj5);
                        rt2Var2 = rt2Var15;
                        i16 = i31;
                        str7 = ", \n                    |selectTime:";
                        wz9Var4 = wz9Var7;
                        sfaVar = sfaVar7;
                        obj2 = obj5;
                        str8 = "\n                    |";
                        je9Var3 = je9Var6;
                        hu4Var5 = hu4Var10;
                        sfaVar4 = (sfa) obj2;
                        if (sfaVar4 == null && sfaVar != null) {
                            j49 = j39;
                            if (sfaVar4.c <= sfaVar.c) {
                            }
                            str14 = this.b;
                            a4cVar3 = gm0.f;
                            if (a4cVar3 == null) {
                                i16 = i16;
                                j38 = j38;
                                str6 = str8;
                                je9Var5 = je9Var3;
                            } else {
                                je9Var5 = je9Var3;
                                if (a4cVar3.b(je9Var5)) {
                                    if (sfaVar != null) {
                                        l5 = new Long(sfaVar.c);
                                    } else {
                                        l5 = null;
                                    }
                                    if (sfaVar4 != null) {
                                        l6 = new Long(sfaVar4.c);
                                    } else {
                                        l6 = null;
                                    }
                                    long j719 = wz9Var4.a;
                                    StringBuilder sb5 = new StringBuilder("Media loader. After find backwardId, \n                    |anchorTime:");
                                    sb5.append(l5);
                                    sb5.append(str7);
                                    sb5.append(l6);
                                    sb5.append("\n                    |markers.backward:");
                                    sb5.append(j719);
                                    str6 = str8;
                                    sb5.append(str6);
                                    a4cVar3.c(je9Var5, str14, s5h.y0(sb5.toString()), null);
                                } else {
                                    i16 = i16;
                                    j38 = j38;
                                    str6 = str8;
                                }
                            }
                            j22 = j38;
                            i10 = i16;
                            rt2Var3 = rt2Var2;
                            wz9Var = wz9Var4;
                            je9Var2 = je9Var5;
                            j33 = j37;
                            j25 = j40;
                            i11 = i15;
                            hu4Var6 = hu4Var5;
                            j24 = j49;
                            str13 = this.b;
                            j43 = j25;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 == null && a4cVar2.b(je9Var2)) {
                                if (sfaVar != null) {
                                    l3 = new Long(sfaVar.c);
                                } else {
                                    l3 = null;
                                }
                                if (sfaVar != null) {
                                    l4 = new Long(sfaVar.b);
                                } else {
                                    l4 = null;
                                }
                                a4cVar2.c(je9Var2, str13, s5h.y0("Media loader. Before request, \n                    |anchorTime:" + l3 + ",\n                    |anchorId:" + l4 + ",\n                    |markers.backward:" + wz9Var.a + str6), null);
                            } else {
                                sfaVar = sfaVar;
                            }
                            if (j33 == 0) {
                                gm0.n(this.b, "Media loader. Don't request media if messageId == 0");
                                return new Integer(-1);
                            }
                            lq4 lq4Var6 = null;
                            j3 j3Var5 = new j3(new bye(new f00(this, new wy2(rt2Var3.b.a, new Long(j33), (Set) this.e, new Integer(i10), new Integer(i11)), lq4Var6, 17)), 15, new y33(this, lq4Var6, 0));
                            x33Var.j = rt2Var3;
                            x33Var.k = null;
                            sfaVar3 = sfaVar;
                            x33Var.l = sfaVar3;
                            j44 = j24;
                            x33Var.d = j44;
                            x33Var.h = i11;
                            x33Var.i = i10;
                            x33Var.e = j43;
                            i17 = i10;
                            rt2Var4 = rt2Var3;
                            x33Var.f = j22;
                            x33Var.g = j33;
                            x33Var.p = 4;
                            objN2 = e9i.N(j3Var5, x33Var);
                            hu4Var4 = hu4Var6;
                            if (objN2 != hu4Var4) {
                                x33Var = x33Var;
                                hu4Var8 = hu4Var4;
                                j45 = j22;
                                j46 = j33;
                                j47 = j43;
                                obj5 = objN2;
                                j48 = j44;
                                i18 = i11;
                                rt2Var5 = rt2Var4;
                                v13Var = (v13) obj5;
                                if (v13Var.h().isEmpty()) {
                                    str15 = this.b;
                                    long j7110 = j45;
                                    a4cVar4 = gm0.f;
                                    if (a4cVar4 == null) {
                                        i17 = i17;
                                        wz9Var5 = null;
                                    } else {
                                        gdaVar = (gda) ww3.t1(v13Var.h());
                                        if (gdaVar != null) {
                                            l7 = new Long(gdaVar.b);
                                        } else {
                                            l7 = null;
                                        }
                                        gdaVar2 = (gda) ww3.D1(v13Var.h());
                                        if (gdaVar2 != null) {
                                            l8 = new Long(gdaVar2.b);
                                        } else {
                                            l8 = null;
                                        }
                                        wz9Var5 = null;
                                        a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                                    }
                                    sua suaVar7 = (sua) ((ny8) this.h).getValue();
                                    long j7111 = rt2Var5.a;
                                    List listH5 = v13Var.h();
                                    x33Var.j = rt2Var5;
                                    x33Var.k = wz9Var5;
                                    x33Var.l = sfaVar3;
                                    x33Var.m = v13Var;
                                    x33Var.d = j48;
                                    x33Var.h = i18;
                                    i21 = i17;
                                    x33Var.i = i21;
                                    x33Var.e = j47;
                                    x33Var.f = j7110;
                                    x33Var.g = j46;
                                    x33Var.p = 5;
                                    ose oseVar5 = (ose) suaVar7.a;
                                    oseVar5.e().a(new zre(listH5, null, oseVar5, j7111, suaVar7.l(), true));
                                    hu4Var4 = hu4Var8;
                                    if (sbi.a != hu4Var4) {
                                        i22 = i18;
                                        j51 = j48;
                                        v13Var3 = v13Var;
                                        i23 = i21;
                                        sfaVar5 = sfaVar3;
                                    }
                                } else {
                                    i19 = i18;
                                    j50 = j48;
                                    v13Var2 = v13Var;
                                    i20 = i17;
                                }
                                xn3 xn3Var6 = (xn3) ((ny8) this.g).getValue();
                                final long j7112 = rt2Var5.a;
                                if (sfaVar3 != null) {
                                    j52 = sfaVar3.a;
                                } else {
                                    j52 = 0;
                                }
                                final Set set5 = (Set) this.e;
                                final qw2 qw2VarJ5 = xn3Var6.j();
                                qw2VarJ5.getClass();
                                qw2VarJ5.v(j7112, false, new tg4() { // from class: mw2
                                    @Override // defpackage.tg4
                                    public final void accept(Object obj6) {
                                        ww2 ww2Var;
                                        Object value;
                                        tw2 tw2Var = (tw2) obj6;
                                        qw2 qw2Var = qw2VarJ5;
                                        dp5 dp5Var = qw2Var.u;
                                        HashSet hashSet = w50.u;
                                        Set set6 = set5;
                                        if (hashSet.equals(set6)) {
                                            ww2Var = tw2Var.q;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.v.equals(set6)) {
                                            ww2Var = tw2Var.r;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.w.equals(set6)) {
                                            ww2Var = tw2Var.s;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.x.equals(set6)) {
                                            ww2Var = tw2Var.t;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.y.equals(set6)) {
                                            ww2Var = tw2Var.u;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.z.equals(set6)) {
                                            ww2Var = tw2Var.v;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.A.equals(set6)) {
                                            ww2Var = tw2Var.w;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else if (w50.B.equals(set6)) {
                                            ww2Var = tw2Var.x;
                                            if (ww2Var == null) {
                                                ww2Var = ww2.g;
                                            }
                                        } else {
                                            ww2 ww2Var2 = ww2.f;
                                            ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                                        }
                                        vw2 vw2VarA = ww2Var.a();
                                        v13 v13Var4 = v13Var2;
                                        vw2VarA.c = v13Var4.e;
                                        boolean zIsEmpty = v13Var4.h().isEmpty();
                                        int i32 = i19;
                                        int i33 = i20;
                                        long j7113 = j7112;
                                        if (zIsEmpty) {
                                            long j7114 = j52;
                                            if (i32 > 0) {
                                                vw2VarA.a = j7114;
                                            }
                                            if (i33 > 0) {
                                                vw2VarA.b = j7114;
                                            }
                                        } else {
                                            List list = (List) vw2VarA.e;
                                            List listH6 = v13Var4.h();
                                            int i34 = sb8.j;
                                            vw2VarA.e = sb8.r(list, listH6, j50, i32, 0L, i33, 0L, mg5.REGULAR);
                                            if (i32 > 0 && v13Var4.h().size() < i32) {
                                                gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                                sfa sfaVarF = ((qfa) dp5Var.get()).f(j7113, ((gda) v13Var4.h().get(0)).a);
                                                if (sfaVarF != null) {
                                                    vw2VarA.a = sfaVarF.a;
                                                } else {
                                                    gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                                }
                                            }
                                            if (i33 > 0 && v13Var4.h().size() < i33) {
                                                gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                                sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j7113, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                                if (sfaVarF2 != null) {
                                                    vw2VarA.b = sfaVarF2.a;
                                                } else {
                                                    gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                                }
                                            }
                                        }
                                        wz9 wz9Var8 = new wz9(v13Var4.g, v13Var4.f, set6, j7113);
                                        f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j7113), new am(5, new xk1(21)));
                                        do {
                                            value = f9bVar.getValue();
                                        } while (!f9bVar.h(value, wz9Var8));
                                        ww2 ww2VarA = vw2VarA.a();
                                        if (hashSet.equals(set6)) {
                                            tw2Var.q = ww2VarA;
                                            return;
                                        }
                                        if (w50.v.equals(set6)) {
                                            tw2Var.r = ww2VarA;
                                            return;
                                        }
                                        if (w50.w.equals(set6)) {
                                            tw2Var.s = ww2VarA;
                                            return;
                                        }
                                        if (w50.x.equals(set6)) {
                                            tw2Var.t = ww2VarA;
                                            return;
                                        }
                                        if (w50.y.equals(set6)) {
                                            tw2Var.u = ww2VarA;
                                            return;
                                        }
                                        if (w50.z.equals(set6)) {
                                            tw2Var.v = ww2VarA;
                                        } else if (w50.A.equals(set6)) {
                                            tw2Var.w = ww2VarA;
                                        } else if (w50.B.equals(set6)) {
                                            tw2Var.x = ww2VarA;
                                        }
                                    }
                                });
                                return new Integer(v13Var2.h().size());
                            }
                            x33Var = x33Var;
                            return hu4Var4;
                        }
                        j49 = j39;
                        j37 = wz9Var4.a;
                        str14 = this.b;
                        a4cVar3 = gm0.f;
                        if (a4cVar3 == null) {
                            i16 = i16;
                            j38 = j38;
                            str6 = str8;
                            je9Var5 = je9Var3;
                        } else {
                            je9Var5 = je9Var3;
                            if (a4cVar3.b(je9Var5)) {
                                if (sfaVar != null) {
                                    l5 = new Long(sfaVar.c);
                                } else {
                                    l5 = null;
                                }
                                if (sfaVar4 != null) {
                                    l6 = new Long(sfaVar4.c);
                                } else {
                                    l6 = null;
                                }
                                long j7113 = wz9Var4.a;
                                StringBuilder sb6 = new StringBuilder("Media loader. After find backwardId, \n                    |anchorTime:");
                                sb6.append(l5);
                                sb6.append(str7);
                                sb6.append(l6);
                                sb6.append("\n                    |markers.backward:");
                                sb6.append(j7113);
                                str6 = str8;
                                sb6.append(str6);
                                a4cVar3.c(je9Var5, str14, s5h.y0(sb6.toString()), null);
                            } else {
                                i16 = i16;
                                j38 = j38;
                                str6 = str8;
                            }
                        }
                        j22 = j38;
                        i10 = i16;
                        rt2Var3 = rt2Var2;
                        wz9Var = wz9Var4;
                        je9Var2 = je9Var5;
                        j33 = j37;
                        j25 = j40;
                        i11 = i15;
                        hu4Var6 = hu4Var5;
                        j24 = j49;
                        str13 = this.b;
                        j43 = j25;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null) {
                            sfaVar = sfaVar;
                        } else {
                            if (sfaVar != null) {
                                l3 = new Long(sfaVar.c);
                            } else {
                                l3 = null;
                            }
                            if (sfaVar != null) {
                                l4 = new Long(sfaVar.b);
                            } else {
                                l4 = null;
                            }
                            a4cVar2.c(je9Var2, str13, s5h.y0("Media loader. Before request, \n                    |anchorTime:" + l3 + ",\n                    |anchorId:" + l4 + ",\n                    |markers.backward:" + wz9Var.a + str6), null);
                        }
                        if (j33 == 0) {
                            gm0.n(this.b, "Media loader. Don't request media if messageId == 0");
                            return new Integer(-1);
                        }
                        lq4 lq4Var7 = null;
                        j3 j3Var6 = new j3(new bye(new f00(this, new wy2(rt2Var3.b.a, new Long(j33), (Set) this.e, new Integer(i10), new Integer(i11)), lq4Var7, 17)), 15, new y33(this, lq4Var7, 0));
                        x33Var.j = rt2Var3;
                        x33Var.k = null;
                        sfaVar3 = sfaVar;
                        x33Var.l = sfaVar3;
                        j44 = j24;
                        x33Var.d = j44;
                        x33Var.h = i11;
                        x33Var.i = i10;
                        x33Var.e = j43;
                        i17 = i10;
                        rt2Var4 = rt2Var3;
                        x33Var.f = j22;
                        x33Var.g = j33;
                        x33Var.p = 4;
                        objN2 = e9i.N(j3Var6, x33Var);
                        hu4Var4 = hu4Var6;
                        if (objN2 != hu4Var4) {
                            x33Var = x33Var;
                            hu4Var8 = hu4Var4;
                            j45 = j22;
                            j46 = j33;
                            j47 = j43;
                            obj5 = objN2;
                            j48 = j44;
                            i18 = i11;
                            rt2Var5 = rt2Var4;
                            v13Var = (v13) obj5;
                            if (v13Var.h().isEmpty()) {
                                str15 = this.b;
                                long j7114 = j45;
                                a4cVar4 = gm0.f;
                                if (a4cVar4 == null) {
                                    i17 = i17;
                                    wz9Var5 = null;
                                } else {
                                    gdaVar = (gda) ww3.t1(v13Var.h());
                                    if (gdaVar != null) {
                                        l7 = new Long(gdaVar.b);
                                    } else {
                                        l7 = null;
                                    }
                                    gdaVar2 = (gda) ww3.D1(v13Var.h());
                                    if (gdaVar2 != null) {
                                        l8 = new Long(gdaVar2.b);
                                    } else {
                                        l8 = null;
                                    }
                                    wz9Var5 = null;
                                    a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                                }
                                sua suaVar8 = (sua) ((ny8) this.h).getValue();
                                long j7115 = rt2Var5.a;
                                List listH6 = v13Var.h();
                                x33Var.j = rt2Var5;
                                x33Var.k = wz9Var5;
                                x33Var.l = sfaVar3;
                                x33Var.m = v13Var;
                                x33Var.d = j48;
                                x33Var.h = i18;
                                i21 = i17;
                                x33Var.i = i21;
                                x33Var.e = j47;
                                x33Var.f = j7114;
                                x33Var.g = j46;
                                x33Var.p = 5;
                                ose oseVar6 = (ose) suaVar8.a;
                                oseVar6.e().a(new zre(listH6, null, oseVar6, j7115, suaVar8.l(), true));
                                hu4Var4 = hu4Var8;
                                if (sbi.a != hu4Var4) {
                                    i22 = i18;
                                    j51 = j48;
                                    v13Var3 = v13Var;
                                    i23 = i21;
                                    sfaVar5 = sfaVar3;
                                }
                            } else {
                                i19 = i18;
                                j50 = j48;
                                v13Var2 = v13Var;
                                i20 = i17;
                            }
                            xn3 xn3Var7 = (xn3) ((ny8) this.g).getValue();
                            final long j7116 = rt2Var5.a;
                            if (sfaVar3 != null) {
                                j52 = sfaVar3.a;
                            } else {
                                j52 = 0;
                            }
                            final Set set6 = (Set) this.e;
                            final qw2 qw2VarJ6 = xn3Var7.j();
                            qw2VarJ6.getClass();
                            qw2VarJ6.v(j7116, false, new tg4() { // from class: mw2
                                @Override // defpackage.tg4
                                public final void accept(Object obj6) {
                                    ww2 ww2Var;
                                    Object value;
                                    tw2 tw2Var = (tw2) obj6;
                                    qw2 qw2Var = qw2VarJ6;
                                    dp5 dp5Var = qw2Var.u;
                                    HashSet hashSet = w50.u;
                                    Set set7 = set6;
                                    if (hashSet.equals(set7)) {
                                        ww2Var = tw2Var.q;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.v.equals(set7)) {
                                        ww2Var = tw2Var.r;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.w.equals(set7)) {
                                        ww2Var = tw2Var.s;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.x.equals(set7)) {
                                        ww2Var = tw2Var.t;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.y.equals(set7)) {
                                        ww2Var = tw2Var.u;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.z.equals(set7)) {
                                        ww2Var = tw2Var.v;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.A.equals(set7)) {
                                        ww2Var = tw2Var.w;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else if (w50.B.equals(set7)) {
                                        ww2Var = tw2Var.x;
                                        if (ww2Var == null) {
                                            ww2Var = ww2.g;
                                        }
                                    } else {
                                        ww2 ww2Var2 = ww2.f;
                                        ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                                    }
                                    vw2 vw2VarA = ww2Var.a();
                                    v13 v13Var4 = v13Var2;
                                    vw2VarA.c = v13Var4.e;
                                    boolean zIsEmpty = v13Var4.h().isEmpty();
                                    int i32 = i19;
                                    int i33 = i20;
                                    long j7117 = j7116;
                                    if (zIsEmpty) {
                                        long j7118 = j52;
                                        if (i32 > 0) {
                                            vw2VarA.a = j7118;
                                        }
                                        if (i33 > 0) {
                                            vw2VarA.b = j7118;
                                        }
                                    } else {
                                        List list = (List) vw2VarA.e;
                                        List listH7 = v13Var4.h();
                                        int i34 = sb8.j;
                                        vw2VarA.e = sb8.r(list, listH7, j50, i32, 0L, i33, 0L, mg5.REGULAR);
                                        if (i32 > 0 && v13Var4.h().size() < i32) {
                                            gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                            sfa sfaVarF = ((qfa) dp5Var.get()).f(j7117, ((gda) v13Var4.h().get(0)).a);
                                            if (sfaVarF != null) {
                                                vw2VarA.a = sfaVarF.a;
                                            } else {
                                                gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                            }
                                        }
                                        if (i33 > 0 && v13Var4.h().size() < i33) {
                                            gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                            sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j7117, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                            if (sfaVarF2 != null) {
                                                vw2VarA.b = sfaVarF2.a;
                                            } else {
                                                gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                            }
                                        }
                                    }
                                    wz9 wz9Var8 = new wz9(v13Var4.g, v13Var4.f, set7, j7117);
                                    f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j7117), new am(5, new xk1(21)));
                                    do {
                                        value = f9bVar.getValue();
                                    } while (!f9bVar.h(value, wz9Var8));
                                    ww2 ww2VarA = vw2VarA.a();
                                    if (hashSet.equals(set7)) {
                                        tw2Var.q = ww2VarA;
                                        return;
                                    }
                                    if (w50.v.equals(set7)) {
                                        tw2Var.r = ww2VarA;
                                        return;
                                    }
                                    if (w50.w.equals(set7)) {
                                        tw2Var.s = ww2VarA;
                                        return;
                                    }
                                    if (w50.x.equals(set7)) {
                                        tw2Var.t = ww2VarA;
                                        return;
                                    }
                                    if (w50.y.equals(set7)) {
                                        tw2Var.u = ww2VarA;
                                        return;
                                    }
                                    if (w50.z.equals(set7)) {
                                        tw2Var.v = ww2VarA;
                                    } else if (w50.A.equals(set7)) {
                                        tw2Var.w = ww2VarA;
                                    } else if (w50.B.equals(set7)) {
                                        tw2Var.x = ww2VarA;
                                    }
                                }
                            });
                            return new Integer(v13Var2.h().size());
                        }
                        x33Var = x33Var;
                        return hu4Var4;
                    }
                    if (i29 == 4) {
                        long j81 = x33Var.g;
                        long j82 = x33Var.f;
                        long j83 = x33Var.e;
                        int i32 = x33Var.i;
                        i18 = x33Var.h;
                        long j84 = x33Var.d;
                        sfaVar3 = x33Var.l;
                        rt2 rt2Var16 = x33Var.j;
                        ch3.d0(obj5);
                        j46 = j81;
                        j45 = j82;
                        j47 = j83;
                        str6 = "\n                    |";
                        hu4Var8 = hu4Var10;
                        rt2Var5 = rt2Var16;
                        je9Var2 = je9Var6;
                        j48 = j84;
                        i17 = i32;
                        v13Var = (v13) obj5;
                        if (v13Var.h().isEmpty()) {
                            str15 = this.b;
                            long j7117 = j45;
                            a4cVar4 = gm0.f;
                            if (a4cVar4 == null && a4cVar4.b(je9Var2)) {
                                gdaVar = (gda) ww3.t1(v13Var.h());
                                if (gdaVar != null) {
                                    l7 = new Long(gdaVar.b);
                                } else {
                                    l7 = null;
                                }
                                gdaVar2 = (gda) ww3.D1(v13Var.h());
                                if (gdaVar2 != null) {
                                    l8 = new Long(gdaVar2.b);
                                } else {
                                    l8 = null;
                                }
                                wz9Var5 = null;
                                a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                            } else {
                                i17 = i17;
                                wz9Var5 = null;
                            }
                            sua suaVar9 = (sua) ((ny8) this.h).getValue();
                            long j7118 = rt2Var5.a;
                            List listH7 = v13Var.h();
                            x33Var.j = rt2Var5;
                            x33Var.k = wz9Var5;
                            x33Var.l = sfaVar3;
                            x33Var.m = v13Var;
                            x33Var.d = j48;
                            x33Var.h = i18;
                            i21 = i17;
                            x33Var.i = i21;
                            x33Var.e = j47;
                            x33Var.f = j7117;
                            x33Var.g = j46;
                            x33Var.p = 5;
                            ose oseVar7 = (ose) suaVar9.a;
                            oseVar7.e().a(new zre(listH7, null, oseVar7, j7118, suaVar9.l(), true));
                            hu4Var4 = hu4Var8;
                            if (sbi.a != hu4Var4) {
                                i22 = i18;
                                j51 = j48;
                                v13Var3 = v13Var;
                                i23 = i21;
                                sfaVar5 = sfaVar3;
                            }
                            x33Var = x33Var;
                            return hu4Var4;
                        }
                        i19 = i18;
                        j50 = j48;
                        v13Var2 = v13Var;
                        i20 = i17;
                        xn3 xn3Var8 = (xn3) ((ny8) this.g).getValue();
                        final long j7119 = rt2Var5.a;
                        if (sfaVar3 != null) {
                            j52 = sfaVar3.a;
                        } else {
                            j52 = 0;
                        }
                        final Set set7 = (Set) this.e;
                        final qw2 qw2VarJ7 = xn3Var8.j();
                        qw2VarJ7.getClass();
                        qw2VarJ7.v(j7119, false, new tg4() { // from class: mw2
                            @Override // defpackage.tg4
                            public final void accept(Object obj6) {
                                ww2 ww2Var;
                                Object value;
                                tw2 tw2Var = (tw2) obj6;
                                qw2 qw2Var = qw2VarJ7;
                                dp5 dp5Var = qw2Var.u;
                                HashSet hashSet = w50.u;
                                Set set8 = set7;
                                if (hashSet.equals(set8)) {
                                    ww2Var = tw2Var.q;
                                    if (ww2Var == null) {
                                        ww2Var = ww2.g;
                                    }
                                } else if (w50.v.equals(set8)) {
                                    ww2Var = tw2Var.r;
                                    if (ww2Var == null) {
                                        ww2Var = ww2.g;
                                    }
                                } else if (w50.w.equals(set8)) {
                                    ww2Var = tw2Var.s;
                                    if (ww2Var == null) {
                                        ww2Var = ww2.g;
                                    }
                                } else if (w50.x.equals(set8)) {
                                    ww2Var = tw2Var.t;
                                    if (ww2Var == null) {
                                        ww2Var = ww2.g;
                                    }
                                } else if (w50.y.equals(set8)) {
                                    ww2Var = tw2Var.u;
                                    if (ww2Var == null) {
                                        ww2Var = ww2.g;
                                    }
                                } else if (w50.z.equals(set8)) {
                                    ww2Var = tw2Var.v;
                                    if (ww2Var == null) {
                                        ww2Var = ww2.g;
                                    }
                                } else if (w50.A.equals(set8)) {
                                    ww2Var = tw2Var.w;
                                    if (ww2Var == null) {
                                        ww2Var = ww2.g;
                                    }
                                } else if (w50.B.equals(set8)) {
                                    ww2Var = tw2Var.x;
                                    if (ww2Var == null) {
                                        ww2Var = ww2.g;
                                    }
                                } else {
                                    ww2 ww2Var2 = ww2.f;
                                    ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                                }
                                vw2 vw2VarA = ww2Var.a();
                                v13 v13Var4 = v13Var2;
                                vw2VarA.c = v13Var4.e;
                                boolean zIsEmpty = v13Var4.h().isEmpty();
                                int i33 = i19;
                                int i34 = i20;
                                long j71110 = j7119;
                                if (zIsEmpty) {
                                    long j71111 = j52;
                                    if (i33 > 0) {
                                        vw2VarA.a = j71111;
                                    }
                                    if (i34 > 0) {
                                        vw2VarA.b = j71111;
                                    }
                                } else {
                                    List list = (List) vw2VarA.e;
                                    List listH8 = v13Var4.h();
                                    int i35 = sb8.j;
                                    vw2VarA.e = sb8.r(list, listH8, j50, i33, 0L, i34, 0L, mg5.REGULAR);
                                    if (i33 > 0 && v13Var4.h().size() < i33) {
                                        gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                        sfa sfaVarF = ((qfa) dp5Var.get()).f(j71110, ((gda) v13Var4.h().get(0)).a);
                                        if (sfaVarF != null) {
                                            vw2VarA.a = sfaVarF.a;
                                        } else {
                                            gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                        }
                                    }
                                    if (i34 > 0 && v13Var4.h().size() < i34) {
                                        gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                        sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j71110, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                        if (sfaVarF2 != null) {
                                            vw2VarA.b = sfaVarF2.a;
                                        } else {
                                            gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                        }
                                    }
                                }
                                wz9 wz9Var8 = new wz9(v13Var4.g, v13Var4.f, set8, j71110);
                                f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j71110), new am(5, new xk1(21)));
                                do {
                                    value = f9bVar.getValue();
                                } while (!f9bVar.h(value, wz9Var8));
                                ww2 ww2VarA = vw2VarA.a();
                                if (hashSet.equals(set8)) {
                                    tw2Var.q = ww2VarA;
                                    return;
                                }
                                if (w50.v.equals(set8)) {
                                    tw2Var.r = ww2VarA;
                                    return;
                                }
                                if (w50.w.equals(set8)) {
                                    tw2Var.s = ww2VarA;
                                    return;
                                }
                                if (w50.x.equals(set8)) {
                                    tw2Var.t = ww2VarA;
                                    return;
                                }
                                if (w50.y.equals(set8)) {
                                    tw2Var.u = ww2VarA;
                                    return;
                                }
                                if (w50.z.equals(set8)) {
                                    tw2Var.v = ww2VarA;
                                } else if (w50.A.equals(set8)) {
                                    tw2Var.w = ww2VarA;
                                } else if (w50.B.equals(set8)) {
                                    tw2Var.x = ww2VarA;
                                }
                            }
                        });
                        return new Integer(v13Var2.h().size());
                    }
                    if (i29 != 5) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i23 = x33Var.i;
                    i22 = x33Var.h;
                    j51 = x33Var.d;
                    v13Var3 = x33Var.m;
                    sfaVar5 = x33Var.l;
                    rt2Var5 = x33Var.j;
                    ch3.d0(obj5);
                }
                i20 = i23;
                i19 = i22;
                j50 = j51;
                v13Var2 = v13Var3;
                sfaVar3 = sfaVar5;
                xn3 xn3Var9 = (xn3) ((ny8) this.g).getValue();
                final long j71110 = rt2Var5.a;
                if (sfaVar3 != null) {
                    j52 = sfaVar3.a;
                } else {
                    j52 = 0;
                }
                final Set set8 = (Set) this.e;
                final qw2 qw2VarJ8 = xn3Var9.j();
                qw2VarJ8.getClass();
                qw2VarJ8.v(j71110, false, new tg4() { // from class: mw2
                    @Override // defpackage.tg4
                    public final void accept(Object obj6) {
                        ww2 ww2Var;
                        Object value;
                        tw2 tw2Var = (tw2) obj6;
                        qw2 qw2Var = qw2VarJ8;
                        dp5 dp5Var = qw2Var.u;
                        HashSet hashSet = w50.u;
                        Set set9 = set8;
                        if (hashSet.equals(set9)) {
                            ww2Var = tw2Var.q;
                            if (ww2Var == null) {
                                ww2Var = ww2.g;
                            }
                        } else if (w50.v.equals(set9)) {
                            ww2Var = tw2Var.r;
                            if (ww2Var == null) {
                                ww2Var = ww2.g;
                            }
                        } else if (w50.w.equals(set9)) {
                            ww2Var = tw2Var.s;
                            if (ww2Var == null) {
                                ww2Var = ww2.g;
                            }
                        } else if (w50.x.equals(set9)) {
                            ww2Var = tw2Var.t;
                            if (ww2Var == null) {
                                ww2Var = ww2.g;
                            }
                        } else if (w50.y.equals(set9)) {
                            ww2Var = tw2Var.u;
                            if (ww2Var == null) {
                                ww2Var = ww2.g;
                            }
                        } else if (w50.z.equals(set9)) {
                            ww2Var = tw2Var.v;
                            if (ww2Var == null) {
                                ww2Var = ww2.g;
                            }
                        } else if (w50.A.equals(set9)) {
                            ww2Var = tw2Var.w;
                            if (ww2Var == null) {
                                ww2Var = ww2.g;
                            }
                        } else if (w50.B.equals(set9)) {
                            ww2Var = tw2Var.x;
                            if (ww2Var == null) {
                                ww2Var = ww2.g;
                            }
                        } else {
                            ww2 ww2Var2 = ww2.f;
                            ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                        }
                        vw2 vw2VarA = ww2Var.a();
                        v13 v13Var4 = v13Var2;
                        vw2VarA.c = v13Var4.e;
                        boolean zIsEmpty = v13Var4.h().isEmpty();
                        int i33 = i19;
                        int i34 = i20;
                        long j71111 = j71110;
                        if (zIsEmpty) {
                            long j71112 = j52;
                            if (i33 > 0) {
                                vw2VarA.a = j71112;
                            }
                            if (i34 > 0) {
                                vw2VarA.b = j71112;
                            }
                        } else {
                            List list = (List) vw2VarA.e;
                            List listH8 = v13Var4.h();
                            int i35 = sb8.j;
                            vw2VarA.e = sb8.r(list, listH8, j50, i33, 0L, i34, 0L, mg5.REGULAR);
                            if (i33 > 0 && v13Var4.h().size() < i33) {
                                gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                sfa sfaVarF = ((qfa) dp5Var.get()).f(j71111, ((gda) v13Var4.h().get(0)).a);
                                if (sfaVarF != null) {
                                    vw2VarA.a = sfaVarF.a;
                                } else {
                                    gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                }
                            }
                            if (i34 > 0 && v13Var4.h().size() < i34) {
                                gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j71111, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                if (sfaVarF2 != null) {
                                    vw2VarA.b = sfaVarF2.a;
                                } else {
                                    gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                }
                            }
                        }
                        wz9 wz9Var8 = new wz9(v13Var4.g, v13Var4.f, set9, j71111);
                        f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j71111), new am(5, new xk1(21)));
                        do {
                            value = f9bVar.getValue();
                        } while (!f9bVar.h(value, wz9Var8));
                        ww2 ww2VarA = vw2VarA.a();
                        if (hashSet.equals(set9)) {
                            tw2Var.q = ww2VarA;
                            return;
                        }
                        if (w50.v.equals(set9)) {
                            tw2Var.r = ww2VarA;
                            return;
                        }
                        if (w50.w.equals(set9)) {
                            tw2Var.s = ww2VarA;
                            return;
                        }
                        if (w50.x.equals(set9)) {
                            tw2Var.t = ww2VarA;
                            return;
                        }
                        if (w50.y.equals(set9)) {
                            tw2Var.u = ww2VarA;
                            return;
                        }
                        if (w50.z.equals(set9)) {
                            tw2Var.v = ww2VarA;
                        } else if (w50.A.equals(set9)) {
                            tw2Var.w = ww2VarA;
                        } else if (w50.B.equals(set9)) {
                            tw2Var.x = ww2VarA;
                        }
                    }
                });
                return new Integer(v13Var2.h().size());
                rt2Var2 = (rt2) objV;
                wz9 wz9VarG = ((xz9) this.f).g();
                long j85 = j19;
                sfa sfaVarZ = ((ose) ((sua) ((ny8) this.h).getValue()).a).z(this.c, j85, mg5.REGULAR);
                j21 = j85;
                str5 = ", \n                    |selectTime:";
                hu4Var5 = hu4Var10;
                long j86 = sfaVarZ != null ? sfaVarZ.b : 0L;
                if (wz9VarG.d == this.c && wz9VarG.c.containsAll((Set) this.e) && j86 == 0) {
                    if (i9 > 0 && wz9VarG.b != 0) {
                        sua suaVar10 = (sua) ((ny8) this.h).getValue();
                        long j87 = wz9VarG.b;
                        x33Var.j = rt2Var2;
                        x33Var.k = wz9VarG;
                        x33Var.l = sfaVarZ;
                        x33Var.d = j21;
                        x33Var.h = i8;
                        x33Var.i = i9;
                        x33Var.e = j18;
                        x33Var.f = j20;
                        long j88 = j20;
                        long j89 = j86;
                        x33Var.g = j89;
                        i12 = i9;
                        x33Var.p = 2;
                        Object objF2 = suaVar10.f(j87, x33Var);
                        if (objF2 != hu4Var5) {
                            obj = objF2;
                            wz9Var3 = wz9VarG;
                            sfaVar = sfaVarZ;
                            j29 = j18;
                            j30 = j89;
                            j31 = j21;
                            i13 = i8;
                            j32 = j88;
                            sfaVar2 = (sfa) obj;
                            if (sfaVar2 == null) {
                                j41 = j31;
                                j30 = wz9Var3.b;
                            } else {
                                j41 = j31;
                                j30 = wz9Var3.b;
                            }
                            str10 = this.b;
                            a4cVar = gm0.f;
                            if (a4cVar == null) {
                                j42 = j30;
                                str11 = str9;
                                str12 = str5;
                                je9Var4 = je9Var;
                            } else {
                                j42 = j30;
                                je9Var4 = je9Var;
                                if (a4cVar.b(je9Var4)) {
                                    if (sfaVar != null) {
                                        l = new Long(sfaVar.c);
                                    } else {
                                        l = null;
                                    }
                                    if (sfaVar2 != null) {
                                        l2 = new Long(sfaVar2.c);
                                    } else {
                                        l2 = null;
                                    }
                                    long j7120 = wz9Var3.b;
                                    StringBuilder sb7 = new StringBuilder("Media loader. After find forwardId, \n                    |anchorTime:");
                                    sb7.append(l);
                                    str12 = str5;
                                    sb7.append(str12);
                                    sb7.append(l2);
                                    sb7.append("\n                    |markers.forward:");
                                    sb7.append(j7120);
                                    str11 = str9;
                                    sb7.append(str11);
                                    a4cVar.c(je9Var4, str10, s5h.y0(sb7.toString()), null);
                                } else {
                                    str11 = str9;
                                    str12 = str5;
                                }
                            }
                            i11 = i13;
                            je9Var3 = je9Var4;
                            str8 = str11;
                            str7 = str12;
                            j26 = j29;
                            wz9Var2 = wz9Var3;
                            j21 = j41;
                            j27 = j42;
                            j28 = j32;
                            i14 = i12;
                            if (i11 > 0) {
                                hu4Var7 = hu4Var5;
                                j35 = j27;
                                if (wz9Var2.a != 0) {
                                    sua suaVar11 = (sua) ((ny8) this.h).getValue();
                                    long j7121 = wz9Var2.a;
                                    x33Var.j = rt2Var2;
                                    x33Var.k = wz9Var2;
                                    x33Var.l = sfaVar;
                                    x33Var.d = j21;
                                    x33Var.h = i11;
                                    x33Var.i = i14;
                                    x33Var.e = j26;
                                    x33Var.f = j28;
                                    j36 = j26;
                                    x33Var.g = j35;
                                    x33Var.p = 3;
                                    objF = suaVar11.f(j7121, x33Var);
                                    hu4Var5 = hu4Var7;
                                    if (objF == hu4Var5) {
                                        wz9Var4 = wz9Var2;
                                        j37 = j35;
                                        obj2 = objF;
                                        j38 = j28;
                                        j39 = j21;
                                        i15 = i11;
                                        i16 = i14;
                                        j40 = j36;
                                        sfaVar4 = (sfa) obj2;
                                        if (sfaVar4 == null) {
                                            j49 = j39;
                                            j37 = wz9Var4.a;
                                        } else {
                                            j49 = j39;
                                            j37 = wz9Var4.a;
                                        }
                                        str14 = this.b;
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 == null) {
                                            i16 = i16;
                                            j38 = j38;
                                            str6 = str8;
                                            je9Var5 = je9Var3;
                                        } else {
                                            je9Var5 = je9Var3;
                                            if (a4cVar3.b(je9Var5)) {
                                                if (sfaVar != null) {
                                                    l5 = new Long(sfaVar.c);
                                                } else {
                                                    l5 = null;
                                                }
                                                if (sfaVar4 != null) {
                                                    l6 = new Long(sfaVar4.c);
                                                } else {
                                                    l6 = null;
                                                }
                                                long j71111 = wz9Var4.a;
                                                StringBuilder sb8 = new StringBuilder("Media loader. After find backwardId, \n                    |anchorTime:");
                                                sb8.append(l5);
                                                sb8.append(str7);
                                                sb8.append(l6);
                                                sb8.append("\n                    |markers.backward:");
                                                sb8.append(j71111);
                                                str6 = str8;
                                                sb8.append(str6);
                                                a4cVar3.c(je9Var5, str14, s5h.y0(sb8.toString()), null);
                                            } else {
                                                i16 = i16;
                                                j38 = j38;
                                                str6 = str8;
                                            }
                                        }
                                        j22 = j38;
                                        i10 = i16;
                                        rt2Var3 = rt2Var2;
                                        wz9Var = wz9Var4;
                                        je9Var2 = je9Var5;
                                        j33 = j37;
                                        j25 = j40;
                                        i11 = i15;
                                        hu4Var6 = hu4Var5;
                                        j24 = j49;
                                        str13 = this.b;
                                        j43 = j25;
                                        a4cVar2 = gm0.f;
                                        if (a4cVar2 == null) {
                                            sfaVar = sfaVar;
                                        } else {
                                            if (sfaVar != null) {
                                                l3 = new Long(sfaVar.c);
                                            } else {
                                                l3 = null;
                                            }
                                            if (sfaVar != null) {
                                                l4 = new Long(sfaVar.b);
                                            } else {
                                                l4 = null;
                                            }
                                            a4cVar2.c(je9Var2, str13, s5h.y0("Media loader. Before request, \n                    |anchorTime:" + l3 + ",\n                    |anchorId:" + l4 + ",\n                    |markers.backward:" + wz9Var.a + str6), null);
                                        }
                                        if (j33 == 0) {
                                            gm0.n(this.b, "Media loader. Don't request media if messageId == 0");
                                            return new Integer(-1);
                                        }
                                        lq4 lq4Var8 = null;
                                        j3 j3Var7 = new j3(new bye(new f00(this, new wy2(rt2Var3.b.a, new Long(j33), (Set) this.e, new Integer(i10), new Integer(i11)), lq4Var8, 17)), 15, new y33(this, lq4Var8, 0));
                                        x33Var.j = rt2Var3;
                                        x33Var.k = null;
                                        sfaVar3 = sfaVar;
                                        x33Var.l = sfaVar3;
                                        j44 = j24;
                                        x33Var.d = j44;
                                        x33Var.h = i11;
                                        x33Var.i = i10;
                                        x33Var.e = j43;
                                        i17 = i10;
                                        rt2Var4 = rt2Var3;
                                        x33Var.f = j22;
                                        x33Var.g = j33;
                                        x33Var.p = 4;
                                        objN2 = e9i.N(j3Var7, x33Var);
                                        hu4Var4 = hu4Var6;
                                        if (objN2 != hu4Var4) {
                                            x33Var = x33Var;
                                            hu4Var8 = hu4Var4;
                                            j45 = j22;
                                            j46 = j33;
                                            j47 = j43;
                                            obj5 = objN2;
                                            j48 = j44;
                                            i18 = i11;
                                            rt2Var5 = rt2Var4;
                                            v13Var = (v13) obj5;
                                            if (v13Var.h().isEmpty()) {
                                                str15 = this.b;
                                                long j71112 = j45;
                                                a4cVar4 = gm0.f;
                                                if (a4cVar4 == null) {
                                                    i17 = i17;
                                                    wz9Var5 = null;
                                                } else {
                                                    gdaVar = (gda) ww3.t1(v13Var.h());
                                                    if (gdaVar != null) {
                                                        l7 = new Long(gdaVar.b);
                                                    } else {
                                                        l7 = null;
                                                    }
                                                    gdaVar2 = (gda) ww3.D1(v13Var.h());
                                                    if (gdaVar2 != null) {
                                                        l8 = new Long(gdaVar2.b);
                                                    } else {
                                                        l8 = null;
                                                    }
                                                    wz9Var5 = null;
                                                    a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                                                }
                                                sua suaVar12 = (sua) ((ny8) this.h).getValue();
                                                long j71113 = rt2Var5.a;
                                                List listH8 = v13Var.h();
                                                x33Var.j = rt2Var5;
                                                x33Var.k = wz9Var5;
                                                x33Var.l = sfaVar3;
                                                x33Var.m = v13Var;
                                                x33Var.d = j48;
                                                x33Var.h = i18;
                                                i21 = i17;
                                                x33Var.i = i21;
                                                x33Var.e = j47;
                                                x33Var.f = j71112;
                                                x33Var.g = j46;
                                                x33Var.p = 5;
                                                ose oseVar8 = (ose) suaVar12.a;
                                                oseVar8.e().a(new zre(listH8, null, oseVar8, j71113, suaVar12.l(), true));
                                                hu4Var4 = hu4Var8;
                                                if (sbi.a != hu4Var4) {
                                                    i22 = i18;
                                                    j51 = j48;
                                                    v13Var3 = v13Var;
                                                    i23 = i21;
                                                    sfaVar5 = sfaVar3;
                                                    i20 = i23;
                                                    i19 = i22;
                                                    j50 = j51;
                                                    v13Var2 = v13Var3;
                                                    sfaVar3 = sfaVar5;
                                                }
                                            } else {
                                                i19 = i18;
                                                j50 = j48;
                                                v13Var2 = v13Var;
                                                i20 = i17;
                                            }
                                            xn3 xn3Var10 = (xn3) ((ny8) this.g).getValue();
                                            final long j71114 = rt2Var5.a;
                                            if (sfaVar3 != null) {
                                                j52 = sfaVar3.a;
                                            } else {
                                                j52 = 0;
                                            }
                                            final Set set9 = (Set) this.e;
                                            final qw2 qw2VarJ9 = xn3Var10.j();
                                            qw2VarJ9.getClass();
                                            qw2VarJ9.v(j71114, false, new tg4() { // from class: mw2
                                                @Override // defpackage.tg4
                                                public final void accept(Object obj6) {
                                                    ww2 ww2Var;
                                                    Object value;
                                                    tw2 tw2Var = (tw2) obj6;
                                                    qw2 qw2Var = qw2VarJ9;
                                                    dp5 dp5Var = qw2Var.u;
                                                    HashSet hashSet = w50.u;
                                                    Set set10 = set9;
                                                    if (hashSet.equals(set10)) {
                                                        ww2Var = tw2Var.q;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.v.equals(set10)) {
                                                        ww2Var = tw2Var.r;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.w.equals(set10)) {
                                                        ww2Var = tw2Var.s;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.x.equals(set10)) {
                                                        ww2Var = tw2Var.t;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.y.equals(set10)) {
                                                        ww2Var = tw2Var.u;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.z.equals(set10)) {
                                                        ww2Var = tw2Var.v;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.A.equals(set10)) {
                                                        ww2Var = tw2Var.w;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else if (w50.B.equals(set10)) {
                                                        ww2Var = tw2Var.x;
                                                        if (ww2Var == null) {
                                                            ww2Var = ww2.g;
                                                        }
                                                    } else {
                                                        ww2 ww2Var2 = ww2.f;
                                                        ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                                                    }
                                                    vw2 vw2VarA = ww2Var.a();
                                                    v13 v13Var4 = v13Var2;
                                                    vw2VarA.c = v13Var4.e;
                                                    boolean zIsEmpty = v13Var4.h().isEmpty();
                                                    int i33 = i19;
                                                    int i34 = i20;
                                                    long j71115 = j71114;
                                                    if (zIsEmpty) {
                                                        long j71116 = j52;
                                                        if (i33 > 0) {
                                                            vw2VarA.a = j71116;
                                                        }
                                                        if (i34 > 0) {
                                                            vw2VarA.b = j71116;
                                                        }
                                                    } else {
                                                        List list = (List) vw2VarA.e;
                                                        List listH9 = v13Var4.h();
                                                        int i35 = sb8.j;
                                                        vw2VarA.e = sb8.r(list, listH9, j50, i33, 0L, i34, 0L, mg5.REGULAR);
                                                        if (i33 > 0 && v13Var4.h().size() < i33) {
                                                            gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                                            sfa sfaVarF = ((qfa) dp5Var.get()).f(j71115, ((gda) v13Var4.h().get(0)).a);
                                                            if (sfaVarF != null) {
                                                                vw2VarA.a = sfaVarF.a;
                                                            } else {
                                                                gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                                            }
                                                        }
                                                        if (i34 > 0 && v13Var4.h().size() < i34) {
                                                            gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                                            sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j71115, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                                            if (sfaVarF2 != null) {
                                                                vw2VarA.b = sfaVarF2.a;
                                                            } else {
                                                                gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                    wz9 wz9Var8 = new wz9(v13Var4.g, v13Var4.f, set10, j71115);
                                                    f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j71115), new am(5, new xk1(21)));
                                                    do {
                                                        value = f9bVar.getValue();
                                                    } while (!f9bVar.h(value, wz9Var8));
                                                    ww2 ww2VarA = vw2VarA.a();
                                                    if (hashSet.equals(set10)) {
                                                        tw2Var.q = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.v.equals(set10)) {
                                                        tw2Var.r = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.w.equals(set10)) {
                                                        tw2Var.s = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.x.equals(set10)) {
                                                        tw2Var.t = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.y.equals(set10)) {
                                                        tw2Var.u = ww2VarA;
                                                        return;
                                                    }
                                                    if (w50.z.equals(set10)) {
                                                        tw2Var.v = ww2VarA;
                                                    } else if (w50.A.equals(set10)) {
                                                        tw2Var.w = ww2VarA;
                                                    } else if (w50.B.equals(set10)) {
                                                        tw2Var.x = ww2VarA;
                                                    }
                                                }
                                            });
                                            return new Integer(v13Var2.h().size());
                                        }
                                    }
                                } else {
                                    hu4Var5 = hu4Var7;
                                    j34 = j35;
                                }
                            } else {
                                j34 = j27;
                            }
                            str6 = str8;
                            j25 = j26;
                            hu4Var6 = hu4Var5;
                            j23 = j34;
                            i10 = i14;
                            rt2Var3 = rt2Var2;
                            j24 = j21;
                            wz9Var = wz9Var2;
                            je9Var2 = je9Var3;
                            j22 = j28;
                        }
                        x33Var = x33Var;
                        return hu4Var4;
                    }
                    long j90 = j20;
                    long j91 = j86;
                    i12 = i9;
                    str7 = str5;
                    je9Var3 = je9Var;
                    str8 = "\n                    |";
                    wz9Var2 = wz9VarG;
                    sfaVar = sfaVarZ;
                    j26 = j18;
                    j27 = j91;
                    i11 = i8;
                    j28 = j90;
                    i14 = i12;
                    if (i11 > 0) {
                        hu4Var7 = hu4Var5;
                        j35 = j27;
                        if (wz9Var2.a != 0) {
                            sua suaVar13 = (sua) ((ny8) this.h).getValue();
                            long j7122 = wz9Var2.a;
                            x33Var.j = rt2Var2;
                            x33Var.k = wz9Var2;
                            x33Var.l = sfaVar;
                            x33Var.d = j21;
                            x33Var.h = i11;
                            x33Var.i = i14;
                            x33Var.e = j26;
                            x33Var.f = j28;
                            j36 = j26;
                            x33Var.g = j35;
                            x33Var.p = 3;
                            objF = suaVar13.f(j7122, x33Var);
                            hu4Var5 = hu4Var7;
                            if (objF == hu4Var5) {
                                wz9Var4 = wz9Var2;
                                j37 = j35;
                                obj2 = objF;
                                j38 = j28;
                                j39 = j21;
                                i15 = i11;
                                i16 = i14;
                                j40 = j36;
                                sfaVar4 = (sfa) obj2;
                                if (sfaVar4 == null) {
                                    j49 = j39;
                                    j37 = wz9Var4.a;
                                } else {
                                    j49 = j39;
                                    j37 = wz9Var4.a;
                                }
                                str14 = this.b;
                                a4cVar3 = gm0.f;
                                if (a4cVar3 == null) {
                                    i16 = i16;
                                    j38 = j38;
                                    str6 = str8;
                                    je9Var5 = je9Var3;
                                } else {
                                    je9Var5 = je9Var3;
                                    if (a4cVar3.b(je9Var5)) {
                                        if (sfaVar != null) {
                                            l5 = new Long(sfaVar.c);
                                        } else {
                                            l5 = null;
                                        }
                                        if (sfaVar4 != null) {
                                            l6 = new Long(sfaVar4.c);
                                        } else {
                                            l6 = null;
                                        }
                                        long j71115 = wz9Var4.a;
                                        StringBuilder sb9 = new StringBuilder("Media loader. After find backwardId, \n                    |anchorTime:");
                                        sb9.append(l5);
                                        sb9.append(str7);
                                        sb9.append(l6);
                                        sb9.append("\n                    |markers.backward:");
                                        sb9.append(j71115);
                                        str6 = str8;
                                        sb9.append(str6);
                                        a4cVar3.c(je9Var5, str14, s5h.y0(sb9.toString()), null);
                                    } else {
                                        i16 = i16;
                                        j38 = j38;
                                        str6 = str8;
                                    }
                                }
                                j22 = j38;
                                i10 = i16;
                                rt2Var3 = rt2Var2;
                                wz9Var = wz9Var4;
                                je9Var2 = je9Var5;
                                j33 = j37;
                                j25 = j40;
                                i11 = i15;
                                hu4Var6 = hu4Var5;
                                j24 = j49;
                                str13 = this.b;
                                j43 = j25;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 == null) {
                                    sfaVar = sfaVar;
                                } else {
                                    if (sfaVar != null) {
                                        l3 = new Long(sfaVar.c);
                                    } else {
                                        l3 = null;
                                    }
                                    if (sfaVar != null) {
                                        l4 = new Long(sfaVar.b);
                                    } else {
                                        l4 = null;
                                    }
                                    a4cVar2.c(je9Var2, str13, s5h.y0("Media loader. Before request, \n                    |anchorTime:" + l3 + ",\n                    |anchorId:" + l4 + ",\n                    |markers.backward:" + wz9Var.a + str6), null);
                                }
                                if (j33 == 0) {
                                    gm0.n(this.b, "Media loader. Don't request media if messageId == 0");
                                    return new Integer(-1);
                                }
                                lq4 lq4Var9 = null;
                                j3 j3Var8 = new j3(new bye(new f00(this, new wy2(rt2Var3.b.a, new Long(j33), (Set) this.e, new Integer(i10), new Integer(i11)), lq4Var9, 17)), 15, new y33(this, lq4Var9, 0));
                                x33Var.j = rt2Var3;
                                x33Var.k = null;
                                sfaVar3 = sfaVar;
                                x33Var.l = sfaVar3;
                                j44 = j24;
                                x33Var.d = j44;
                                x33Var.h = i11;
                                x33Var.i = i10;
                                x33Var.e = j43;
                                i17 = i10;
                                rt2Var4 = rt2Var3;
                                x33Var.f = j22;
                                x33Var.g = j33;
                                x33Var.p = 4;
                                objN2 = e9i.N(j3Var8, x33Var);
                                hu4Var4 = hu4Var6;
                                if (objN2 != hu4Var4) {
                                    x33Var = x33Var;
                                    hu4Var8 = hu4Var4;
                                    j45 = j22;
                                    j46 = j33;
                                    j47 = j43;
                                    obj5 = objN2;
                                    j48 = j44;
                                    i18 = i11;
                                    rt2Var5 = rt2Var4;
                                    v13Var = (v13) obj5;
                                    if (v13Var.h().isEmpty()) {
                                        str15 = this.b;
                                        long j71116 = j45;
                                        a4cVar4 = gm0.f;
                                        if (a4cVar4 == null) {
                                            i17 = i17;
                                            wz9Var5 = null;
                                        } else {
                                            gdaVar = (gda) ww3.t1(v13Var.h());
                                            if (gdaVar != null) {
                                                l7 = new Long(gdaVar.b);
                                            } else {
                                                l7 = null;
                                            }
                                            gdaVar2 = (gda) ww3.D1(v13Var.h());
                                            if (gdaVar2 != null) {
                                                l8 = new Long(gdaVar2.b);
                                            } else {
                                                l8 = null;
                                            }
                                            wz9Var5 = null;
                                            a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                                        }
                                        sua suaVar14 = (sua) ((ny8) this.h).getValue();
                                        long j71117 = rt2Var5.a;
                                        List listH9 = v13Var.h();
                                        x33Var.j = rt2Var5;
                                        x33Var.k = wz9Var5;
                                        x33Var.l = sfaVar3;
                                        x33Var.m = v13Var;
                                        x33Var.d = j48;
                                        x33Var.h = i18;
                                        i21 = i17;
                                        x33Var.i = i21;
                                        x33Var.e = j47;
                                        x33Var.f = j71116;
                                        x33Var.g = j46;
                                        x33Var.p = 5;
                                        ose oseVar9 = (ose) suaVar14.a;
                                        oseVar9.e().a(new zre(listH9, null, oseVar9, j71117, suaVar14.l(), true));
                                        hu4Var4 = hu4Var8;
                                        if (sbi.a != hu4Var4) {
                                            i22 = i18;
                                            j51 = j48;
                                            v13Var3 = v13Var;
                                            i23 = i21;
                                            sfaVar5 = sfaVar3;
                                            i20 = i23;
                                            i19 = i22;
                                            j50 = j51;
                                            v13Var2 = v13Var3;
                                            sfaVar3 = sfaVar5;
                                        }
                                    } else {
                                        i19 = i18;
                                        j50 = j48;
                                        v13Var2 = v13Var;
                                        i20 = i17;
                                    }
                                    xn3 xn3Var11 = (xn3) ((ny8) this.g).getValue();
                                    final long j71118 = rt2Var5.a;
                                    if (sfaVar3 != null) {
                                        j52 = sfaVar3.a;
                                    } else {
                                        j52 = 0;
                                    }
                                    final Set set10 = (Set) this.e;
                                    final qw2 qw2VarJ10 = xn3Var11.j();
                                    qw2VarJ10.getClass();
                                    qw2VarJ10.v(j71118, false, new tg4() { // from class: mw2
                                        @Override // defpackage.tg4
                                        public final void accept(Object obj6) {
                                            ww2 ww2Var;
                                            Object value;
                                            tw2 tw2Var = (tw2) obj6;
                                            qw2 qw2Var = qw2VarJ10;
                                            dp5 dp5Var = qw2Var.u;
                                            HashSet hashSet = w50.u;
                                            Set set11 = set10;
                                            if (hashSet.equals(set11)) {
                                                ww2Var = tw2Var.q;
                                                if (ww2Var == null) {
                                                    ww2Var = ww2.g;
                                                }
                                            } else if (w50.v.equals(set11)) {
                                                ww2Var = tw2Var.r;
                                                if (ww2Var == null) {
                                                    ww2Var = ww2.g;
                                                }
                                            } else if (w50.w.equals(set11)) {
                                                ww2Var = tw2Var.s;
                                                if (ww2Var == null) {
                                                    ww2Var = ww2.g;
                                                }
                                            } else if (w50.x.equals(set11)) {
                                                ww2Var = tw2Var.t;
                                                if (ww2Var == null) {
                                                    ww2Var = ww2.g;
                                                }
                                            } else if (w50.y.equals(set11)) {
                                                ww2Var = tw2Var.u;
                                                if (ww2Var == null) {
                                                    ww2Var = ww2.g;
                                                }
                                            } else if (w50.z.equals(set11)) {
                                                ww2Var = tw2Var.v;
                                                if (ww2Var == null) {
                                                    ww2Var = ww2.g;
                                                }
                                            } else if (w50.A.equals(set11)) {
                                                ww2Var = tw2Var.w;
                                                if (ww2Var == null) {
                                                    ww2Var = ww2.g;
                                                }
                                            } else if (w50.B.equals(set11)) {
                                                ww2Var = tw2Var.x;
                                                if (ww2Var == null) {
                                                    ww2Var = ww2.g;
                                                }
                                            } else {
                                                ww2 ww2Var2 = ww2.f;
                                                ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                                            }
                                            vw2 vw2VarA = ww2Var.a();
                                            v13 v13Var4 = v13Var2;
                                            vw2VarA.c = v13Var4.e;
                                            boolean zIsEmpty = v13Var4.h().isEmpty();
                                            int i33 = i19;
                                            int i34 = i20;
                                            long j71119 = j71118;
                                            if (zIsEmpty) {
                                                long j711110 = j52;
                                                if (i33 > 0) {
                                                    vw2VarA.a = j711110;
                                                }
                                                if (i34 > 0) {
                                                    vw2VarA.b = j711110;
                                                }
                                            } else {
                                                List list = (List) vw2VarA.e;
                                                List listH10 = v13Var4.h();
                                                int i35 = sb8.j;
                                                vw2VarA.e = sb8.r(list, listH10, j50, i33, 0L, i34, 0L, mg5.REGULAR);
                                                if (i33 > 0 && v13Var4.h().size() < i33) {
                                                    gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                                    sfa sfaVarF = ((qfa) dp5Var.get()).f(j71119, ((gda) v13Var4.h().get(0)).a);
                                                    if (sfaVarF != null) {
                                                        vw2VarA.a = sfaVarF.a;
                                                    } else {
                                                        gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                                    }
                                                }
                                                if (i34 > 0 && v13Var4.h().size() < i34) {
                                                    gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                                    sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j71119, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                                    if (sfaVarF2 != null) {
                                                        vw2VarA.b = sfaVarF2.a;
                                                    } else {
                                                        gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                                    }
                                                }
                                            }
                                            wz9 wz9Var8 = new wz9(v13Var4.g, v13Var4.f, set11, j71119);
                                            f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j71119), new am(5, new xk1(21)));
                                            do {
                                                value = f9bVar.getValue();
                                            } while (!f9bVar.h(value, wz9Var8));
                                            ww2 ww2VarA = vw2VarA.a();
                                            if (hashSet.equals(set11)) {
                                                tw2Var.q = ww2VarA;
                                                return;
                                            }
                                            if (w50.v.equals(set11)) {
                                                tw2Var.r = ww2VarA;
                                                return;
                                            }
                                            if (w50.w.equals(set11)) {
                                                tw2Var.s = ww2VarA;
                                                return;
                                            }
                                            if (w50.x.equals(set11)) {
                                                tw2Var.t = ww2VarA;
                                                return;
                                            }
                                            if (w50.y.equals(set11)) {
                                                tw2Var.u = ww2VarA;
                                                return;
                                            }
                                            if (w50.z.equals(set11)) {
                                                tw2Var.v = ww2VarA;
                                            } else if (w50.A.equals(set11)) {
                                                tw2Var.w = ww2VarA;
                                            } else if (w50.B.equals(set11)) {
                                                tw2Var.x = ww2VarA;
                                            }
                                        }
                                    });
                                    return new Integer(v13Var2.h().size());
                                }
                            }
                            x33Var = x33Var;
                            return hu4Var4;
                        }
                        hu4Var5 = hu4Var7;
                        j34 = j35;
                    } else {
                        j34 = j27;
                    }
                    str6 = str8;
                    j25 = j26;
                    hu4Var6 = hu4Var5;
                    j23 = j34;
                    i10 = i14;
                    rt2Var3 = rt2Var2;
                    j24 = j21;
                    wz9Var = wz9Var2;
                    je9Var2 = je9Var3;
                    j22 = j28;
                    hu4Var4 = hu4Var5;
                    x33Var = x33Var;
                    return hu4Var4;
                }
                long j92 = j20;
                long j93 = j18;
                str6 = str9;
                long j94 = j86;
                int i33 = i9;
                je9Var2 = je9Var;
                j22 = j92;
                hu4Var6 = hu4Var5;
                j23 = j94;
                i10 = i33;
                rt2Var3 = rt2Var2;
                j24 = j21;
                wz9Var = wz9VarG;
                sfaVar = sfaVarZ;
                j25 = j93;
                i11 = i8;
                j33 = j23;
                str13 = this.b;
                j43 = j25;
                a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    sfaVar = sfaVar;
                } else {
                    if (sfaVar != null) {
                        l3 = new Long(sfaVar.c);
                    } else {
                        l3 = null;
                    }
                    if (sfaVar != null) {
                        l4 = new Long(sfaVar.b);
                    } else {
                        l4 = null;
                    }
                    a4cVar2.c(je9Var2, str13, s5h.y0("Media loader. Before request, \n                    |anchorTime:" + l3 + ",\n                    |anchorId:" + l4 + ",\n                    |markers.backward:" + wz9Var.a + str6), null);
                }
                if (j33 == 0) {
                    gm0.n(this.b, "Media loader. Don't request media if messageId == 0");
                    return new Integer(-1);
                }
                lq4 lq4Var10 = null;
                j3 j3Var9 = new j3(new bye(new f00(this, new wy2(rt2Var3.b.a, new Long(j33), (Set) this.e, new Integer(i10), new Integer(i11)), lq4Var10, 17)), 15, new y33(this, lq4Var10, 0));
                x33Var.j = rt2Var3;
                x33Var.k = null;
                sfaVar3 = sfaVar;
                x33Var.l = sfaVar3;
                j44 = j24;
                x33Var.d = j44;
                x33Var.h = i11;
                x33Var.i = i10;
                x33Var.e = j43;
                i17 = i10;
                rt2Var4 = rt2Var3;
                x33Var.f = j22;
                x33Var.g = j33;
                x33Var.p = 4;
                objN2 = e9i.N(j3Var9, x33Var);
                hu4Var4 = hu4Var6;
                if (objN2 != hu4Var4) {
                    x33Var = x33Var;
                    hu4Var8 = hu4Var4;
                    j45 = j22;
                    j46 = j33;
                    j47 = j43;
                    obj5 = objN2;
                    j48 = j44;
                    i18 = i11;
                    rt2Var5 = rt2Var4;
                    v13Var = (v13) obj5;
                    if (v13Var.h().isEmpty()) {
                        str15 = this.b;
                        long j71119 = j45;
                        a4cVar4 = gm0.f;
                        if (a4cVar4 == null) {
                            i17 = i17;
                            wz9Var5 = null;
                        } else {
                            gdaVar = (gda) ww3.t1(v13Var.h());
                            if (gdaVar != null) {
                                l7 = new Long(gdaVar.b);
                            } else {
                                l7 = null;
                            }
                            gdaVar2 = (gda) ww3.D1(v13Var.h());
                            if (gdaVar2 != null) {
                                l8 = new Long(gdaVar2.b);
                            } else {
                                l8 = null;
                            }
                            wz9Var5 = null;
                            a4cVar4.c(je9Var2, str15, s5h.y0("Media loader. After success with message, \n                    |firstTime:" + l7 + ", \n                    |lastTime:" + l8 + str6), null);
                        }
                        sua suaVar15 = (sua) ((ny8) this.h).getValue();
                        long j711110 = rt2Var5.a;
                        List listH10 = v13Var.h();
                        x33Var.j = rt2Var5;
                        x33Var.k = wz9Var5;
                        x33Var.l = sfaVar3;
                        x33Var.m = v13Var;
                        x33Var.d = j48;
                        x33Var.h = i18;
                        i21 = i17;
                        x33Var.i = i21;
                        x33Var.e = j47;
                        x33Var.f = j71119;
                        x33Var.g = j46;
                        x33Var.p = 5;
                        ose oseVar10 = (ose) suaVar15.a;
                        oseVar10.e().a(new zre(listH10, null, oseVar10, j711110, suaVar15.l(), true));
                        hu4Var4 = hu4Var8;
                        if (sbi.a != hu4Var4) {
                            i22 = i18;
                            j51 = j48;
                            v13Var3 = v13Var;
                            i23 = i21;
                            sfaVar5 = sfaVar3;
                            i20 = i23;
                            i19 = i22;
                            j50 = j51;
                            v13Var2 = v13Var3;
                            sfaVar3 = sfaVar5;
                        }
                    } else {
                        i19 = i18;
                        j50 = j48;
                        v13Var2 = v13Var;
                        i20 = i17;
                    }
                    xn3 xn3Var12 = (xn3) ((ny8) this.g).getValue();
                    final long j711111 = rt2Var5.a;
                    if (sfaVar3 != null) {
                        j52 = sfaVar3.a;
                    } else {
                        j52 = 0;
                    }
                    final Set set11 = (Set) this.e;
                    final qw2 qw2VarJ11 = xn3Var12.j();
                    qw2VarJ11.getClass();
                    qw2VarJ11.v(j711111, false, new tg4() { // from class: mw2
                        @Override // defpackage.tg4
                        public final void accept(Object obj6) {
                            ww2 ww2Var;
                            Object value;
                            tw2 tw2Var = (tw2) obj6;
                            qw2 qw2Var = qw2VarJ11;
                            dp5 dp5Var = qw2Var.u;
                            HashSet hashSet = w50.u;
                            Set set12 = set11;
                            if (hashSet.equals(set12)) {
                                ww2Var = tw2Var.q;
                                if (ww2Var == null) {
                                    ww2Var = ww2.g;
                                }
                            } else if (w50.v.equals(set12)) {
                                ww2Var = tw2Var.r;
                                if (ww2Var == null) {
                                    ww2Var = ww2.g;
                                }
                            } else if (w50.w.equals(set12)) {
                                ww2Var = tw2Var.s;
                                if (ww2Var == null) {
                                    ww2Var = ww2.g;
                                }
                            } else if (w50.x.equals(set12)) {
                                ww2Var = tw2Var.t;
                                if (ww2Var == null) {
                                    ww2Var = ww2.g;
                                }
                            } else if (w50.y.equals(set12)) {
                                ww2Var = tw2Var.u;
                                if (ww2Var == null) {
                                    ww2Var = ww2.g;
                                }
                            } else if (w50.z.equals(set12)) {
                                ww2Var = tw2Var.v;
                                if (ww2Var == null) {
                                    ww2Var = ww2.g;
                                }
                            } else if (w50.A.equals(set12)) {
                                ww2Var = tw2Var.w;
                                if (ww2Var == null) {
                                    ww2Var = ww2.g;
                                }
                            } else if (w50.B.equals(set12)) {
                                ww2Var = tw2Var.x;
                                if (ww2Var == null) {
                                    ww2Var = ww2.g;
                                }
                            } else {
                                ww2 ww2Var2 = ww2.f;
                                ww2Var = new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
                            }
                            vw2 vw2VarA = ww2Var.a();
                            v13 v13Var4 = v13Var2;
                            vw2VarA.c = v13Var4.e;
                            boolean zIsEmpty = v13Var4.h().isEmpty();
                            int i34 = i19;
                            int i35 = i20;
                            long j711112 = j711111;
                            if (zIsEmpty) {
                                long j711113 = j52;
                                if (i34 > 0) {
                                    vw2VarA.a = j711113;
                                }
                                if (i35 > 0) {
                                    vw2VarA.b = j711113;
                                }
                            } else {
                                List list = (List) vw2VarA.e;
                                List listH11 = v13Var4.h();
                                int i36 = sb8.j;
                                vw2VarA.e = sb8.r(list, listH11, j50, i34, 0L, i35, 0L, mg5.REGULAR);
                                if (i34 > 0 && v13Var4.h().size() < i34) {
                                    gm0.n("qw2", "onChatMediaNew firstMessageUpdate");
                                    sfa sfaVarF = ((qfa) dp5Var.get()).f(j711112, ((gda) v13Var4.h().get(0)).a);
                                    if (sfaVarF != null) {
                                        vw2VarA.a = sfaVarF.a;
                                    } else {
                                        gm0.W("qw2", "onChatMediaNew can't find message to update firstMessage", new Object[0]);
                                    }
                                }
                                if (i35 > 0 && v13Var4.h().size() < i35) {
                                    gm0.n("qw2", "onChatMediaNew lastMessageUpdate");
                                    sfa sfaVarF2 = ((qfa) dp5Var.get()).f(j711112, ((gda) v13Var4.h().get(v13Var4.h().size() - 1)).a);
                                    if (sfaVarF2 != null) {
                                        vw2VarA.b = sfaVarF2.a;
                                    } else {
                                        gm0.W("qw2", "onChatMediaNew can't find message to update lastMessage", new Object[0]);
                                    }
                                }
                            }
                            wz9 wz9Var8 = new wz9(v13Var4.g, v13Var4.f, set12, j711112);
                            f9b f9bVar = (f9b) qw2Var.a.computeIfAbsent(Long.valueOf(j711112), new am(5, new xk1(21)));
                            do {
                                value = f9bVar.getValue();
                            } while (!f9bVar.h(value, wz9Var8));
                            ww2 ww2VarA = vw2VarA.a();
                            if (hashSet.equals(set12)) {
                                tw2Var.q = ww2VarA;
                                return;
                            }
                            if (w50.v.equals(set12)) {
                                tw2Var.r = ww2VarA;
                                return;
                            }
                            if (w50.w.equals(set12)) {
                                tw2Var.s = ww2VarA;
                                return;
                            }
                            if (w50.x.equals(set12)) {
                                tw2Var.t = ww2VarA;
                                return;
                            }
                            if (w50.y.equals(set12)) {
                                tw2Var.u = ww2VarA;
                                return;
                            }
                            if (w50.z.equals(set12)) {
                                tw2Var.v = ww2VarA;
                            } else if (w50.A.equals(set12)) {
                                tw2Var.w = ww2VarA;
                            } else if (w50.B.equals(set12)) {
                                tw2Var.x = ww2VarA;
                            }
                        }
                    });
                    return new Integer(v13Var2.h().size());
                }
                x33Var = x33Var;
                return hu4Var4;
        }
    }

    public /* synthetic */ c30(boolean z) {
    }

    public c30(long j, mg5 mg5Var, sih sihVar, ks9 ks9Var, kz2 kz2Var, a0b a0bVar, w20 w20Var) {
        this.c = j;
        this.d = mg5Var;
        this.e = sihVar;
        this.f = ks9Var;
        this.g = kz2Var;
        this.h = a0bVar;
        this.i = w20Var;
        this.b = zo5.j(j, "AsyncMessagesRemoteDataSource#");
    }

    public c30() {
    }
}
