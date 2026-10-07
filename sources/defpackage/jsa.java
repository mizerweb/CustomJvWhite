package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.a;
import kotlinx.coroutines.TimeoutCancellationException;
import one.me.messages.list.loader.MessageModel;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jsa extends a8j {
    public static final /* synthetic */ zv8[] Z2 = {new z8b(jsa.class, "markAsUnreadJob", "getMarkAsUnreadJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, jsa.class, "markMessageAsReadJob", "getMarkMessageAsReadJob()Lkotlinx/coroutines/Job;"), new dwd(jsa.class, "attachClickJob", "getAttachClickJob()Lru/ok/tamtam/coroutines/ReplaceableCompareJob;", 0), new z8b(jsa.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;"), new z8b(jsa.class, "keyboardActionJob", "getKeyboardActionJob()Lkotlinx/coroutines/Job;"), new z8b(jsa.class, "pollRevoteJob", "getPollRevoteJob()Lkotlinx/coroutines/Job;"), new z8b(jsa.class, "storiesReplyClickJob", "getStoriesReplyClickJob()Lkotlinx/coroutines/Job;")};
    public final ny8 A;
    public final ny8 A1;
    public final r8e A2;
    public final ny8 B;
    public final ny8 B1;
    public ylc B2;
    public final ny8 C;
    public final ny8 C1;
    public final ifh C2;
    public final ny8 D;
    public final ny8 D1;
    public final ifh D2;
    public final ny8 E;
    public final ny8 E1;
    public final ic6 E2;
    public final ny8 F;
    public final ny8 F1;
    public final ifh F2;
    public final ny8 G;
    public final ny8 G1;
    public final ic6 G2;
    public final ny8 H;
    public final ny8 H1;
    public final m8b H2;
    public final ny8 I;
    public final ny8 I1;
    public final mjg I2;
    public final ny8 J;
    public final ny8 J1;
    public final ifh J2;
    public final ny8 K;
    public final ny8 K1;
    public final AtomicLong K2;
    public final ny8 L1;
    public final ifh L2;
    public final ny8 M1;
    public final xx6 M2;
    public final ny8 N1;
    public final mjg N2;
    public final ny8 O1;
    public final r8e O2;
    public final ny8 P1;
    public final r8e P2;
    public final ny8 Q1;
    public int Q2;
    public final ny8 R1;
    public final String R2;
    public final ny8 S1;
    public final xt4 S2;
    public final ny8 T1;
    public final xt4 T2;
    public final ny8 U1;
    public final ifh U2;
    public final ny8 V1;
    public final ifh V2;
    public final ny8 W1;
    public final ifh W2;
    public final ny8 X;
    public final ny8 X1;
    public final ifh X2;
    public final ny8 Y;
    public final ny8 Y1;
    public int Y2;
    public final ny8 Z;
    public final ifh Z1;
    public final ny8 a2;
    public final ifh b2;
    public final ita c;
    public final ifh c2;
    public final t73 d;
    public final ifh d2;
    public final xu1 e;
    public final mjg e2;
    public final bn9 f;
    public final ic6 f2;
    public final c7k g;
    public final mjg g2;
    public final c8e h;
    public final dc9 h2;
    public final int i;
    public final ifh i2;
    public final xhh j;
    public final p3c j2;
    public final u3d k;
    public final p3c k2;
    public final xn3 l;
    public final ks9 l2;
    public final evj m;
    public final p3c m2;
    public final cn9 n;
    public final ny8 n1;
    public final p3c n2;
    public final jt4 o;
    public final ny8 o1;
    public final p3c o2;
    public final qgf p;
    public final ny8 p1;
    public final p3c p2;
    public final et3 q;
    public final ny8 q1;
    public sgg q2;
    public final nni r;
    public final ny8 r1;
    public sgg r2;
    public final wo6 s;
    public final ny8 s1;
    public sgg s2;
    public final o50 t;
    public final ny8 t1;
    public sgg t2;
    public final ny8 u;
    public final ny8 u1;
    public final l9b u2;
    public final String v;
    public final ny8 v1;
    public final l9b v2;
    public final xt4 w;
    public final ny8 w1;
    public final r8e w2;
    public final ny8 x;
    public final ny8 x1;
    public final ifh x2;
    public final ny8 y;
    public final ny8 y1;
    public final mjg y2;
    public final ny8 z;
    public final ny8 z1;
    public final r8e z2;

    public jsa(ita itaVar, t73 t73Var, xu1 xu1Var, bn9 bn9Var, c7k c7kVar, c8e c8eVar, ny8 ny8Var, int i, xhh xhhVar, u3d u3dVar, xn3 xn3Var, evj evjVar, cn9 cn9Var, jt4 jt4Var, qgf qgfVar, et3 et3Var, nni nniVar, wo6 wo6Var, o50 o50Var, k76 k76Var, gva gvaVar, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18, ny8 ny8Var19, ny8 ny8Var20, ny8 ny8Var21, ny8 ny8Var22, ny8 ny8Var23, ny8 ny8Var24, ny8 ny8Var25, ny8 ny8Var26, ny8 ny8Var27, ny8 ny8Var28, ny8 ny8Var29, ny8 ny8Var30, ny8 ny8Var31, ny8 ny8Var32, ny8 ny8Var33, ny8 ny8Var34, ny8 ny8Var35, ny8 ny8Var36, ny8 ny8Var37, ny8 ny8Var38, ny8 ny8Var39, ny8 ny8Var40, ny8 ny8Var41, ny8 ny8Var42, ny8 ny8Var43, ny8 ny8Var44, ny8 ny8Var45, ny8 ny8Var46, ny8 ny8Var47, ny8 ny8Var48, ny8 ny8Var49, ny8 ny8Var50, ny8 ny8Var51, ny8 ny8Var52, ny8 ny8Var53, ny8 ny8Var54, ny8 ny8Var55, ny8 ny8Var56, ny8 ny8Var57, ny8 ny8Var58, final ny8 ny8Var59, final ny8 ny8Var60, ny8 ny8Var61, ny8 ny8Var62, ny8 ny8Var63, final ny8 ny8Var64, ny8 ny8Var65, ny8 ny8Var66, ny8 ny8Var67) {
        lq4 lq4Var;
        xx6 byeVar;
        xx6 tzVar;
        lq4 lq4Var2;
        int i2;
        vg4 vg4VarW;
        this.c = itaVar;
        this.d = t73Var;
        this.e = xu1Var;
        this.f = bn9Var;
        this.g = c7kVar;
        this.h = c8eVar;
        this.i = i;
        this.j = xhhVar;
        this.k = u3dVar;
        this.l = xn3Var;
        this.m = evjVar;
        this.n = cn9Var;
        this.o = jt4Var;
        this.p = qgfVar;
        this.q = et3Var;
        this.r = nniVar;
        this.s = wo6Var;
        this.t = o50Var;
        this.u = ny8Var62;
        String name = jsa.class.getName();
        this.v = name;
        n0c n0cVar = (n0c) xhhVar;
        this.w = n0cVar.b().R0(1, "messages-list-vm-io");
        this.x = ny8Var2;
        this.y = ny8Var5;
        this.z = ny8Var4;
        this.A = ny8Var8;
        this.B = ny8Var;
        this.C = ny8Var9;
        this.D = ny8Var14;
        this.E = ny8Var3;
        this.F = ny8Var6;
        this.G = ny8Var7;
        this.H = ny8Var18;
        this.I = ny8Var10;
        this.J = ny8Var11;
        this.K = ny8Var12;
        this.X = ny8Var13;
        this.Y = ny8Var16;
        this.Z = ny8Var15;
        this.n1 = ny8Var19;
        this.o1 = ny8Var20;
        this.p1 = ny8Var21;
        this.q1 = ny8Var22;
        this.r1 = ny8Var23;
        this.s1 = ny8Var24;
        this.t1 = ny8Var25;
        this.u1 = ny8Var26;
        this.v1 = ny8Var27;
        this.w1 = ny8Var28;
        this.x1 = ny8Var17;
        this.y1 = ny8Var29;
        this.z1 = ny8Var32;
        this.A1 = ny8Var33;
        this.B1 = ny8Var34;
        this.C1 = ny8Var35;
        this.D1 = ny8Var36;
        this.E1 = ny8Var37;
        this.F1 = ny8Var38;
        this.G1 = ny8Var39;
        this.H1 = ny8Var40;
        this.I1 = ny8Var41;
        this.J1 = ny8Var42;
        this.K1 = ny8Var43;
        this.L1 = ny8Var45;
        this.M1 = ny8Var46;
        this.N1 = ny8Var47;
        this.O1 = ny8Var31;
        this.P1 = ny8Var44;
        this.Q1 = ny8Var48;
        this.R1 = ny8Var49;
        this.S1 = ny8Var51;
        this.T1 = ny8Var52;
        this.U1 = ny8Var53;
        this.V1 = ny8Var56;
        this.W1 = ny8Var58;
        this.X1 = ny8Var61;
        this.Y1 = ny8Var63;
        final int i3 = 2;
        this.Z1 = new ifh(new af7(this) { // from class: sqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                ny8 ny8Var68 = ny8Var60;
                jsa jsaVar = this.b;
                switch (i4) {
                    case 0:
                        ita itaVar2 = jsaVar.c;
                        if (itaVar2.i == null) {
                            ore.p("only for comments");
                            return null;
                        }
                        xt xtVar = (xt) ny8Var68.getValue();
                        q24 q24Var = itaVar2.i;
                        c7k c7kVar2 = jsaVar.g;
                        dq4 dq4Var = jsaVar.b;
                        h5 h5Var = xtVar.a;
                        Context context = (Context) h5Var.c(7);
                        ifh ifhVarD = h5Var.d(144);
                        ifh ifhVarD2 = h5Var.d(136);
                        return new tz3(q24Var, new d0c(new ifh(new ut(context, h5Var, 5)), new ifh(new ut(context, h5Var, 4)), h5Var.d(481), h5Var.d(132), ifhVarD2, ifhVarD, h5Var.d(377)), c7kVar2, dq4Var, ifhVarD, ifhVarD2, h5Var.d(915), h5Var.d(646));
                    case 1:
                        ita itaVar3 = jsaVar.c;
                        if (itaVar3.i == null) {
                            wt wtVar = (wt) ny8Var68.getValue();
                            long j = itaVar3.a;
                            mg5 mg5Var = jsaVar.d.a;
                            c7k c7kVar3 = jsaVar.g;
                            dq4 dq4Var2 = jsaVar.b;
                            h5 h5Var2 = wtVar.a;
                            Context context2 = (Context) h5Var2.c(7);
                            xhh xhhVar2 = (xhh) h5Var2.c(23);
                            ifh ifhVarD3 = h5Var2.d(144);
                            ifh ifhVarD4 = h5Var2.d(136);
                            ifh ifhVarD5 = h5Var2.d(481);
                            ifh ifhVarD6 = h5Var2.d(915);
                            ifh ifhVarD7 = h5Var2.d(132);
                            q36 q36Var = new q36();
                            q36Var.a = j;
                            q36Var.b = mg5Var;
                            q36Var.c = new ifh(new vx9(ifhVarD3, 17, q36Var));
                            q36Var.d = new ifh(new wre(ifhVarD3, ifhVarD4, q36Var, 25));
                            qg7 qg7Var = new qg7(zo5.j(j, "MessagesListLoader#"), 2, new vt(h5Var2, 0));
                            ifh ifhVar = new ifh(new ut(context2, h5Var2, 1));
                            ifh ifhVar2 = new ifh(new ut(context2, h5Var2, 0));
                            w20 w20Var = new w20(j, xhhVar2, mg5Var, c7kVar3, ifhVarD3, h5Var2.d(205), ifhVarD6, ifhVarD4, h5Var2.d(591), h5Var2.d(594), h5Var2.d(139), h5Var2.d(54));
                            return new p20(xhhVar2, (yt4) h5Var2.c(48), q36Var, new c30(j, mg5Var, (sih) h5Var2.c(114), new ks9(2, ifhVarD3), (kz2) h5Var2.c(532), (a0b) h5Var2.c(227), w20Var), new uj6(j, qg7Var, ifhVarD3, h5Var2.d(620)), qg7Var, huk.a(cqk.D(dq4Var2, ((n0c) xhhVar2).a()), (t51) h5Var2.c(116), j, mg5Var), ifhVar, ifhVar2, new d0c(ifhVar, ifhVar2, ifhVarD5, ifhVarD7, ifhVarD4, ifhVarD3, h5Var2.d(377)), w20Var, (pa4) h5Var2.c(738), (e93) h5Var2.c(20), mg5Var.a() ? 150 : 40, mg5Var.a() ? 150 : 15, 2, ((Boolean) ((e5d) h5Var2.c(26)).D6.a(e5d.S6[395]).i()).booleanValue());
                        }
                        wt wtVar2 = (wt) ny8Var68.getValue();
                        q24 q24Var2 = itaVar3.i;
                        h5 h5Var3 = wtVar2.a;
                        Context context3 = (Context) h5Var3.c(7);
                        xhh xhhVar3 = (xhh) h5Var3.c(23);
                        ifh ifhVarD8 = h5Var3.d(144);
                        ifh ifhVarD9 = h5Var3.d(228);
                        ifh ifhVarD10 = h5Var3.d(481);
                        ifh ifhVarD11 = h5Var3.d(915);
                        ifh ifhVarD12 = h5Var3.d(132);
                        ifh ifhVarD13 = h5Var3.d(647);
                        uvc uvcVar = new uvc(q24Var2, ifhVarD8);
                        qg7 qg7Var2 = new qg7("CommentsListLoader#" + q24Var2, 2, new vt(h5Var3, 1));
                        ifh ifhVar3 = new ifh(new ut(context3, h5Var3, 3));
                        ifh ifhVar4 = new ifh(new ut(context3, h5Var3, 2));
                        h00 h00Var = new h00(q24Var2, xhhVar3, ifhVarD8, ifhVarD11, ifhVarD9, h5Var3.d(139), h5Var3.d(592));
                        ifh ifhVarD14 = h5Var3.d(136);
                        r00 r00Var = new r00(q24Var2, (sih) h5Var3.c(114), ifhVarD8, ifhVarD9, ifhVarD13, h5Var3.d(493), (a0b) h5Var3.c(227), h00Var, (l7f) h5Var3.c(229), h5Var3.d(85), h5Var3.d(26));
                        js8 js8Var = new js8();
                        js8Var.a = q24Var2;
                        js8Var.b = qg7Var2;
                        js8Var.e = ifhVarD8;
                        js8Var.c = ifhVarD9;
                        js8Var.d = ifhVarD14;
                        js8Var.f = q24Var2.toString();
                        js8Var.r();
                        return new p20(xhhVar3, (yt4) h5Var3.c(48), uvcVar, r00Var, js8Var, qg7Var2, new m24(q24Var2, ifhVarD13), ifhVar3, ifhVar4, new d0c(ifhVar3, ifhVar4, ifhVarD10, ifhVarD12, ifhVarD9, ifhVarD8, h5Var3.d(377)), h00Var, (pa4) h5Var3.c(738), (e93) h5Var3.c(20), 40, ((Boolean) ((e5d) h5Var3.c(26)).D6.a(e5d.S6[395]).i()).booleanValue(), PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);
                    default:
                        ita itaVar4 = jsaVar.c;
                        if (itaVar4.i == null) {
                            ore.p("not available in regular chat");
                            return null;
                        }
                        zt ztVar = (zt) ny8Var68.getValue();
                        q24 q24Var3 = itaVar4.i;
                        h5 h5Var4 = ztVar.a;
                        return new wz3(q24Var3, h5Var4.d(144), h5Var4.d(484), h5Var4.d(136));
                }
            }
        });
        this.a2 = ny8Var67;
        final int i4 = 1;
        ifh ifhVar = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                jsa jsaVar = this.b;
                switch (i5) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar = jsaVar.w2;
                        int i6 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i6 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        this.b2 = ifhVar;
        this.c2 = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i3;
                jsa jsaVar = this.b;
                switch (i5) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar = jsaVar.w2;
                        int i6 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i6 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        final int i5 = 3;
        this.d2 = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                jsa jsaVar = this.b;
                switch (i6) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar = jsaVar.w2;
                        int i7 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i7 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        mjg mjgVarA = p90.a(bk6.a);
        this.e2 = mjgVarA;
        r8e r8eVar = new r8e(mjgVarA);
        this.f2 = new ic6(null);
        mjg mjgVarA2 = p90.a(null);
        this.g2 = mjgVarA2;
        r8e r8eVar2 = new r8e(mjgVarA2);
        final int i6 = 0;
        ifh ifhVar2 = new ifh(new af7(this) { // from class: sqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                ny8 ny8Var68 = ny8Var59;
                jsa jsaVar = this.b;
                switch (i7) {
                    case 0:
                        ita itaVar2 = jsaVar.c;
                        if (itaVar2.i == null) {
                            ore.p("only for comments");
                            return null;
                        }
                        xt xtVar = (xt) ny8Var68.getValue();
                        q24 q24Var = itaVar2.i;
                        c7k c7kVar2 = jsaVar.g;
                        dq4 dq4Var = jsaVar.b;
                        h5 h5Var = xtVar.a;
                        Context context = (Context) h5Var.c(7);
                        ifh ifhVarD = h5Var.d(144);
                        ifh ifhVarD2 = h5Var.d(136);
                        return new tz3(q24Var, new d0c(new ifh(new ut(context, h5Var, 5)), new ifh(new ut(context, h5Var, 4)), h5Var.d(481), h5Var.d(132), ifhVarD2, ifhVarD, h5Var.d(377)), c7kVar2, dq4Var, ifhVarD, ifhVarD2, h5Var.d(915), h5Var.d(646));
                    case 1:
                        ita itaVar3 = jsaVar.c;
                        if (itaVar3.i == null) {
                            wt wtVar = (wt) ny8Var68.getValue();
                            long j = itaVar3.a;
                            mg5 mg5Var = jsaVar.d.a;
                            c7k c7kVar3 = jsaVar.g;
                            dq4 dq4Var2 = jsaVar.b;
                            h5 h5Var2 = wtVar.a;
                            Context context2 = (Context) h5Var2.c(7);
                            xhh xhhVar2 = (xhh) h5Var2.c(23);
                            ifh ifhVarD3 = h5Var2.d(144);
                            ifh ifhVarD4 = h5Var2.d(136);
                            ifh ifhVarD5 = h5Var2.d(481);
                            ifh ifhVarD6 = h5Var2.d(915);
                            ifh ifhVarD7 = h5Var2.d(132);
                            q36 q36Var = new q36();
                            q36Var.a = j;
                            q36Var.b = mg5Var;
                            q36Var.c = new ifh(new vx9(ifhVarD3, 17, q36Var));
                            q36Var.d = new ifh(new wre(ifhVarD3, ifhVarD4, q36Var, 25));
                            qg7 qg7Var = new qg7(zo5.j(j, "MessagesListLoader#"), 2, new vt(h5Var2, 0));
                            ifh ifhVar3 = new ifh(new ut(context2, h5Var2, 1));
                            ifh ifhVar4 = new ifh(new ut(context2, h5Var2, 0));
                            w20 w20Var = new w20(j, xhhVar2, mg5Var, c7kVar3, ifhVarD3, h5Var2.d(205), ifhVarD6, ifhVarD4, h5Var2.d(591), h5Var2.d(594), h5Var2.d(139), h5Var2.d(54));
                            return new p20(xhhVar2, (yt4) h5Var2.c(48), q36Var, new c30(j, mg5Var, (sih) h5Var2.c(114), new ks9(2, ifhVarD3), (kz2) h5Var2.c(532), (a0b) h5Var2.c(227), w20Var), new uj6(j, qg7Var, ifhVarD3, h5Var2.d(620)), qg7Var, huk.a(cqk.D(dq4Var2, ((n0c) xhhVar2).a()), (t51) h5Var2.c(116), j, mg5Var), ifhVar3, ifhVar4, new d0c(ifhVar3, ifhVar4, ifhVarD5, ifhVarD7, ifhVarD4, ifhVarD3, h5Var2.d(377)), w20Var, (pa4) h5Var2.c(738), (e93) h5Var2.c(20), mg5Var.a() ? 150 : 40, mg5Var.a() ? 150 : 15, 2, ((Boolean) ((e5d) h5Var2.c(26)).D6.a(e5d.S6[395]).i()).booleanValue());
                        }
                        wt wtVar2 = (wt) ny8Var68.getValue();
                        q24 q24Var2 = itaVar3.i;
                        h5 h5Var3 = wtVar2.a;
                        Context context3 = (Context) h5Var3.c(7);
                        xhh xhhVar3 = (xhh) h5Var3.c(23);
                        ifh ifhVarD8 = h5Var3.d(144);
                        ifh ifhVarD9 = h5Var3.d(228);
                        ifh ifhVarD10 = h5Var3.d(481);
                        ifh ifhVarD11 = h5Var3.d(915);
                        ifh ifhVarD12 = h5Var3.d(132);
                        ifh ifhVarD13 = h5Var3.d(647);
                        uvc uvcVar = new uvc(q24Var2, ifhVarD8);
                        qg7 qg7Var2 = new qg7("CommentsListLoader#" + q24Var2, 2, new vt(h5Var3, 1));
                        ifh ifhVar5 = new ifh(new ut(context3, h5Var3, 3));
                        ifh ifhVar6 = new ifh(new ut(context3, h5Var3, 2));
                        h00 h00Var = new h00(q24Var2, xhhVar3, ifhVarD8, ifhVarD11, ifhVarD9, h5Var3.d(139), h5Var3.d(592));
                        ifh ifhVarD14 = h5Var3.d(136);
                        r00 r00Var = new r00(q24Var2, (sih) h5Var3.c(114), ifhVarD8, ifhVarD9, ifhVarD13, h5Var3.d(493), (a0b) h5Var3.c(227), h00Var, (l7f) h5Var3.c(229), h5Var3.d(85), h5Var3.d(26));
                        js8 js8Var = new js8();
                        js8Var.a = q24Var2;
                        js8Var.b = qg7Var2;
                        js8Var.e = ifhVarD8;
                        js8Var.c = ifhVarD9;
                        js8Var.d = ifhVarD14;
                        js8Var.f = q24Var2.toString();
                        js8Var.r();
                        return new p20(xhhVar3, (yt4) h5Var3.c(48), uvcVar, r00Var, js8Var, qg7Var2, new m24(q24Var2, ifhVarD13), ifhVar5, ifhVar6, new d0c(ifhVar5, ifhVar6, ifhVarD10, ifhVarD12, ifhVarD9, ifhVarD8, h5Var3.d(377)), h00Var, (pa4) h5Var3.c(738), (e93) h5Var3.c(20), 40, ((Boolean) ((e5d) h5Var3.c(26)).D6.a(e5d.S6[395]).i()).booleanValue(), PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);
                    default:
                        ita itaVar4 = jsaVar.c;
                        if (itaVar4.i == null) {
                            ore.p("not available in regular chat");
                            return null;
                        }
                        zt ztVar = (zt) ny8Var68.getValue();
                        q24 q24Var3 = itaVar4.i;
                        h5 h5Var4 = ztVar.a;
                        return new wz3(q24Var3, h5Var4.d(144), h5Var4.d(484), h5Var4.d(136));
                }
            }
        });
        lr2 lr2Var = new lr2(e0(), 1);
        lr2 lr2Var2 = new lr2(e0(), 0);
        s0f s0fVar = new s0f(e0());
        yj6 yj6Var = new yj6(et3Var, xhhVar, r8eVar, ((Boolean) ifhVar.getValue()).booleanValue(), r0(), r8eVar2, ny8Var54, ny8Var55, ny8Var4, ny8Var6);
        dic dicVar = new dic(r8eVar2, r0());
        q24 q24Var = itaVar.i;
        this.h2 = new dc9((Iterable) a.Y0(new tpa[]{lr2Var, lr2Var2, s0fVar, yj6Var, dicVar, q24Var != null ? new o34((Context) ny8Var4.getValue()) : null, q24Var != null ? (tz3) ifhVar2.getValue() : null}));
        ifh ifhVar3 = new ifh(new wre(this, ny8Var65, ny8Var66, 20));
        final int i7 = 1;
        this.i2 = new ifh(new af7(this) { // from class: sqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                ny8 ny8Var68 = ny8Var64;
                jsa jsaVar = this.b;
                switch (i8) {
                    case 0:
                        ita itaVar2 = jsaVar.c;
                        if (itaVar2.i == null) {
                            ore.p("only for comments");
                            return null;
                        }
                        xt xtVar = (xt) ny8Var68.getValue();
                        q24 q24Var2 = itaVar2.i;
                        c7k c7kVar2 = jsaVar.g;
                        dq4 dq4Var = jsaVar.b;
                        h5 h5Var = xtVar.a;
                        Context context = (Context) h5Var.c(7);
                        ifh ifhVarD = h5Var.d(144);
                        ifh ifhVarD2 = h5Var.d(136);
                        return new tz3(q24Var2, new d0c(new ifh(new ut(context, h5Var, 5)), new ifh(new ut(context, h5Var, 4)), h5Var.d(481), h5Var.d(132), ifhVarD2, ifhVarD, h5Var.d(377)), c7kVar2, dq4Var, ifhVarD, ifhVarD2, h5Var.d(915), h5Var.d(646));
                    case 1:
                        ita itaVar3 = jsaVar.c;
                        if (itaVar3.i == null) {
                            wt wtVar = (wt) ny8Var68.getValue();
                            long j = itaVar3.a;
                            mg5 mg5Var = jsaVar.d.a;
                            c7k c7kVar3 = jsaVar.g;
                            dq4 dq4Var2 = jsaVar.b;
                            h5 h5Var2 = wtVar.a;
                            Context context2 = (Context) h5Var2.c(7);
                            xhh xhhVar2 = (xhh) h5Var2.c(23);
                            ifh ifhVarD3 = h5Var2.d(144);
                            ifh ifhVarD4 = h5Var2.d(136);
                            ifh ifhVarD5 = h5Var2.d(481);
                            ifh ifhVarD6 = h5Var2.d(915);
                            ifh ifhVarD7 = h5Var2.d(132);
                            q36 q36Var = new q36();
                            q36Var.a = j;
                            q36Var.b = mg5Var;
                            q36Var.c = new ifh(new vx9(ifhVarD3, 17, q36Var));
                            q36Var.d = new ifh(new wre(ifhVarD3, ifhVarD4, q36Var, 25));
                            qg7 qg7Var = new qg7(zo5.j(j, "MessagesListLoader#"), 2, new vt(h5Var2, 0));
                            ifh ifhVar4 = new ifh(new ut(context2, h5Var2, 1));
                            ifh ifhVar5 = new ifh(new ut(context2, h5Var2, 0));
                            w20 w20Var = new w20(j, xhhVar2, mg5Var, c7kVar3, ifhVarD3, h5Var2.d(205), ifhVarD6, ifhVarD4, h5Var2.d(591), h5Var2.d(594), h5Var2.d(139), h5Var2.d(54));
                            return new p20(xhhVar2, (yt4) h5Var2.c(48), q36Var, new c30(j, mg5Var, (sih) h5Var2.c(114), new ks9(2, ifhVarD3), (kz2) h5Var2.c(532), (a0b) h5Var2.c(227), w20Var), new uj6(j, qg7Var, ifhVarD3, h5Var2.d(620)), qg7Var, huk.a(cqk.D(dq4Var2, ((n0c) xhhVar2).a()), (t51) h5Var2.c(116), j, mg5Var), ifhVar4, ifhVar5, new d0c(ifhVar4, ifhVar5, ifhVarD5, ifhVarD7, ifhVarD4, ifhVarD3, h5Var2.d(377)), w20Var, (pa4) h5Var2.c(738), (e93) h5Var2.c(20), mg5Var.a() ? 150 : 40, mg5Var.a() ? 150 : 15, 2, ((Boolean) ((e5d) h5Var2.c(26)).D6.a(e5d.S6[395]).i()).booleanValue());
                        }
                        wt wtVar2 = (wt) ny8Var68.getValue();
                        q24 q24Var3 = itaVar3.i;
                        h5 h5Var3 = wtVar2.a;
                        Context context3 = (Context) h5Var3.c(7);
                        xhh xhhVar3 = (xhh) h5Var3.c(23);
                        ifh ifhVarD8 = h5Var3.d(144);
                        ifh ifhVarD9 = h5Var3.d(228);
                        ifh ifhVarD10 = h5Var3.d(481);
                        ifh ifhVarD11 = h5Var3.d(915);
                        ifh ifhVarD12 = h5Var3.d(132);
                        ifh ifhVarD13 = h5Var3.d(647);
                        uvc uvcVar = new uvc(q24Var3, ifhVarD8);
                        qg7 qg7Var2 = new qg7("CommentsListLoader#" + q24Var3, 2, new vt(h5Var3, 1));
                        ifh ifhVar6 = new ifh(new ut(context3, h5Var3, 3));
                        ifh ifhVar7 = new ifh(new ut(context3, h5Var3, 2));
                        h00 h00Var = new h00(q24Var3, xhhVar3, ifhVarD8, ifhVarD11, ifhVarD9, h5Var3.d(139), h5Var3.d(592));
                        ifh ifhVarD14 = h5Var3.d(136);
                        r00 r00Var = new r00(q24Var3, (sih) h5Var3.c(114), ifhVarD8, ifhVarD9, ifhVarD13, h5Var3.d(493), (a0b) h5Var3.c(227), h00Var, (l7f) h5Var3.c(229), h5Var3.d(85), h5Var3.d(26));
                        js8 js8Var = new js8();
                        js8Var.a = q24Var3;
                        js8Var.b = qg7Var2;
                        js8Var.e = ifhVarD8;
                        js8Var.c = ifhVarD9;
                        js8Var.d = ifhVarD14;
                        js8Var.f = q24Var3.toString();
                        js8Var.r();
                        return new p20(xhhVar3, (yt4) h5Var3.c(48), uvcVar, r00Var, js8Var, qg7Var2, new m24(q24Var3, ifhVarD13), ifhVar6, ifhVar7, new d0c(ifhVar6, ifhVar7, ifhVarD10, ifhVarD12, ifhVarD9, ifhVarD8, h5Var3.d(377)), h00Var, (pa4) h5Var3.c(738), (e93) h5Var3.c(20), 40, ((Boolean) ((e5d) h5Var3.c(26)).D6.a(e5d.S6[395]).i()).booleanValue(), PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);
                    default:
                        ita itaVar4 = jsaVar.c;
                        if (itaVar4.i == null) {
                            ore.p("not available in regular chat");
                            return null;
                        }
                        zt ztVar = (zt) ny8Var68.getValue();
                        q24 q24Var4 = itaVar4.i;
                        h5 h5Var4 = ztVar.a;
                        return new wz3(q24Var4, h5Var4.d(144), h5Var4.d(484), h5Var4.d(136));
                }
            }
        });
        this.j2 = qyj.S();
        this.k2 = qyj.S();
        this.l2 = new ks9(25);
        this.m2 = qyj.S();
        this.n2 = qyj.S();
        this.o2 = qyj.S();
        this.p2 = qyj.S();
        this.u2 = new l9b();
        this.v2 = new l9b();
        gjg gjgVarI = q24Var != null ? xn3Var.c.i(q24Var) : xn3Var.k(itaVar.a);
        r8e r8eVar3 = (r8e) gjgVarI;
        this.w2 = r8eVar3;
        final int i8 = 4;
        this.x2 = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                jsa jsaVar = this.b;
                switch (i9) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar4 = jsaVar.w2;
                        int i10 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i10 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar4, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar4, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        mjg mjgVarA3 = p90.a(opa.d);
        this.y2 = mjgVarA3;
        r8e r8eVar4 = new r8e(mjgVarA3);
        this.z2 = r8eVar4;
        if (q24Var == null) {
            lq4Var = null;
            byeVar = new tz(7, null);
        } else {
            lq4Var = null;
            tz3 tz3Var = (tz3) ifhVar2.getValue();
            tz3Var.getClass();
            byeVar = new bye(new jd3(tz3Var, (lq4) null, 11));
        }
        j3 j3VarC = e9i.C(gjgVarI, r8eVar4, new oj5(new xx6[]{r8eVar, r8eVar2, byeVar}, 1), new sra(lq4Var, this));
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        r8e r8eVarG0 = e9i.G0(j3VarC, dq4Var, a8gVar, r66.a);
        this.A2 = r8eVarG0;
        final int i9 = 5;
        this.C2 = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i10 = i9;
                jsa jsaVar = this.b;
                switch (i10) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar5 = jsaVar.w2;
                        int i11 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i11 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar5, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar5, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        this.D2 = new ifh(new wre(this, gvaVar, ny8Var, 21));
        this.E2 = new ic6(null);
        this.F2 = new ifh(new s24(this, ny8Var50, ny8Var5, ny8Var9, ny8Var31, ny8Var2, ny8Var57, 1));
        this.G2 = new ic6(null);
        this.H2 = new m8b();
        this.I2 = p90.a(Boolean.valueOf(itaVar.j));
        final int i10 = 6;
        this.J2 = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i11 = i10;
                jsa jsaVar = this.b;
                switch (i11) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar5 = jsaVar.w2;
                        int i12 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i12 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar5, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar5, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        this.K2 = new AtomicLong();
        this.L2 = new ifh(new aa7(this, ny8Var2, ny8Var31, ny8Var, ny8Var30, 1));
        this.M2 = e9i.T(new hz1(r8eVarG0, 8), n0cVar.a());
        mjg mjgVarA4 = p90.a(null);
        this.N2 = mjgVarA4;
        yo0 yo0Var = new yo0(mjgVarA3, 7);
        jz jzVar = new jz(gjgVarI, 13);
        rt2 rt2Var = (rt2) r8eVar3.a.getValue();
        if (rt2Var == null || (vg4VarW = rt2Var.w()) == null) {
            lq4Var2 = null;
            tzVar = new tz(7, null);
        } else {
            tzVar = new jz(((no4) ny8Var6.getValue()).j(vg4VarW.v()), 13);
            lq4Var2 = null;
        }
        this.O2 = e9i.G0(e9i.T(e9i.A(yo0Var, jzVar, mjgVarA4, e9i.H(tzVar, new wf0(12)), r8eVar2, new i76(k76Var, t73Var, r0(), lq4Var2)), ((n0c) ((xhh) k76Var.f.getValue())).a()), this.b, a8gVar, lq4Var2);
        this.P2 = e9i.G0(e9i.T(new o24(new jz(gjgVarI, 13), 19, this), n0cVar.a()), this.b, a8gVar, Boolean.FALSE);
        this.R2 = qt4.j(hashCode(), name, "@");
        this.S2 = n0cVar.a().R0(1, "polls");
        this.T2 = n0cVar.a().R0(1, "comments-counters");
        final int i11 = 7;
        this.U2 = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i12 = i11;
                jsa jsaVar = this.b;
                switch (i12) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar5 = jsaVar.w2;
                        int i13 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i13 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar5, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar5, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        final int i12 = 8;
        this.V2 = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i13 = i12;
                jsa jsaVar = this.b;
                switch (i13) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar5 = jsaVar.w2;
                        int i14 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i14 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar5, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar5, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        final int i13 = 9;
        this.W2 = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i14 = i13;
                jsa jsaVar = this.b;
                switch (i14) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar5 = jsaVar.w2;
                        int i15 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i15 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar5, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar5, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        final int i14 = 0;
        this.X2 = new ifh(new af7(this) { // from class: rqa
            public final /* synthetic */ jsa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i15 = i14;
                jsa jsaVar = this.b;
                switch (i15) {
                    case 0:
                        return new hqc(jsaVar.b, ((n0c) jsaVar.j).a(), jsaVar);
                    case 1:
                        Boolean bool = (Boolean) ((f5d) jsaVar.s).a.m5.a(e5d.S6[326]).i();
                        bool.booleanValue();
                        return bool;
                    case 2:
                        Boolean bool2 = (Boolean) ((f5d) jsaVar.s).a.Q5.a(e5d.S6[356]).i();
                        bool2.getClass();
                        return bool2;
                    case 3:
                        Boolean bool3 = (Boolean) ((e5d) jsaVar.u.getValue()).M6.a(e5d.S6[405]).i();
                        bool3.getClass();
                        return bool3;
                    case 4:
                        t73 t73Var2 = jsaVar.d;
                        r8e r8eVar5 = jsaVar.w2;
                        int i16 = zqa.$EnumSwitchMapping$0[t73Var2.ordinal()];
                        ny8 ny8Var68 = jsaVar.A;
                        if (i16 == 1) {
                            o7f o7fVar = (o7f) ny8Var68.getValue();
                            return o7fVar.a(r8eVar5, o7fVar.a.d(228));
                        }
                        o7f o7fVar2 = (o7f) ny8Var68.getValue();
                        return o7fVar2.a(r8eVar5, o7fVar2.a.d(136));
                    case 5:
                        return new edi(jsaVar.w2, jsaVar.z2, jsaVar.b, jsaVar.j);
                    case 6:
                        jsa jsaVar2 = this.b;
                        return new x5b(jsaVar2.Y(), jsaVar2.b, jsaVar2.j, jsaVar2.z2, new rea(2, jsaVar2, jsa.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 3));
                    case 7:
                        return new xed("comments", jsaVar.b, jsaVar.T2, new ara(jsaVar, null, 0));
                    case 8:
                        return new xed("poll", jsaVar.b, jsaVar.S2, new ara(jsaVar, null, 1));
                    default:
                        return new xed("media-autosave", jsaVar.b, ((n0c) jsaVar.j).a().R0(1, "media-autosave"), new bra(jsaVar, null, 1));
                }
            }
        });
        e9i.j0(e9i.T(new fz6(new bye(new wz6(new r07(new jz(gjgVarI, 13), Z().L, new vqa(3, (lq4) null, 0), 0), (lq4) null, this, 17)), new vk4(this, (lq4) null, 28), 3), n0cVar.a()), this.b);
        a8j.t(this, n0cVar.b(), new je0(this, null, 4), 2);
        e9i.j0(new fz6(((voa) ifhVar3.getValue()).b(), new uqa(this, null, 1), 3), this.b);
        u3dVar.b();
        yab.i0(this.b, null, 0, new wqa(this, null, 0), 3);
        e9i.j0(e9i.T(new fz6(mjgVarA3, new uqa(this, null, 2), 3), n0cVar.b()), this.b);
        String str = itaVar.h;
        if (str != null) {
            j0(str, true);
        }
        if (((Boolean) ifhVar.getValue()).booleanValue()) {
            i2 = 0;
            yab.i0(this.b, n0cVar.a(), 0, new af8(this, null, 23), 2);
        } else {
            i2 = 0;
        }
        if (r0()) {
            e9i.j0(e9i.T(new fz6(e9i.H(new hz1(r8eVar3, 9), new wf0(11)), new uqa(this, null, i2), 3), n0cVar.a()), this.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x002e  */
    public static final void B(jsa jsaVar, String str, List list) {
        Object next;
        dul dulVar = dul.f;
        pp3 pp3Var = (pp3) jsaVar.D1.getValue();
        l6m l6mVar = l6m.f;
        Object obj = zpe.f;
        if (!((Boolean) ((e5d) pp3Var.a.getValue()).L6.a(e5d.S6[404]).i()).booleanValue()) {
            obj = l6mVar;
        } else if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                cga cgaVar = (cga) next;
                if (cgaVar.c == bga.f) {
                    Map map = cgaVar.f;
                    Object obj2 = map != null ? map.get(MLFeatureConfigProviderBase.URL_KEY) : null;
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 != null) {
                        if (str2.equals(str)) {
                            break;
                        }
                        if (str2.equals(((lge) pp3Var.b.getValue()).a.matcher(r5h.y1(str).toString()).replaceFirst(""))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            cga cgaVar2 = (cga) next;
            if (cgaVar2 != null) {
                Map map2 = cgaVar2.f;
                Object obj3 = map2 != null ? map2.get("checkResult") : null;
                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                if (number != null) {
                    int iIntValue = number.intValue();
                    if ((iIntValue & 2) != 0) {
                        obj = l6mVar;
                    } else if ((iIntValue & 1) != 0) {
                        obj = dulVar;
                    }
                }
            }
        }
        if (list == null || obj.equals(l6mVar)) {
            jsaVar.j0(str, false);
        } else {
            a8j.x(jsaVar.E2, new w3g(str, obj.equals(dulVar)));
        }
    }

    public static final void C(jsa jsaVar, String str) {
        it3.a(jsaVar.U(), str);
        if (it3.b()) {
            a8j.x(jsaVar.E2, new n3g(new rnh(R.plurals.chat_screen_action_copy_success, 1, a.n1(new Object[]{1})), Integer.valueOf(R.drawable.icon_copy), null, 4));
        }
    }

    public static final fda D(jsa jsaVar, long j) {
        jsaVar.getClass();
        try {
            return ((gb9) jsaVar.Z.getValue()).a(j, true);
        } catch (IllegalStateException e) {
            gm0.V(jsaVar.v, "Failed to get message", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object E(jsa jsaVar, long j, nq4 nq4Var) {
        cra craVar;
        boolean z;
        if (nq4Var instanceof cra) {
            craVar = (cra) nq4Var;
            int i = craVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                craVar.g = i - Integer.MIN_VALUE;
            } else {
                craVar = new cra(jsaVar, nq4Var);
            }
        } else {
            craVar = new cra(jsaVar, nq4Var);
        }
        Object obj = craVar.e;
        int i2 = craVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            boolean zBooleanValue = ((Boolean) ((e5d) jsaVar.u.getValue()).a4.a(e5d.S6[262]).i()).booleanValue();
            hu4 hu4Var = hu4.a;
            if (j == -9223372036854775805L) {
                wz3 wz3Var = (wz3) jsaVar.Z1.getValue();
                craVar.d = zBooleanValue;
                craVar.g = 1;
                Serializable serializableA = wz3Var.a(zBooleanValue, craVar);
                if (serializableA != hu4Var) {
                    return serializableA;
                }
            } else {
                cea ceaVarY = jsaVar.Y();
                craVar.d = zBooleanValue;
                craVar.g = 2;
                Serializable serializableK = ceaVarY.k(j, craVar);
                if (serializableK != hu4Var) {
                    obj = serializableK;
                    z = zBooleanValue;
                }
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(obj);
            return obj;
        }
        if (i2 != 2) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = craVar.d;
        ch3.d0(obj);
        Iterator it = ((Iterable) obj).iterator();
        if (!it.hasNext()) {
            return c76.a;
        }
        hda hdaVar = (hda) it.next();
        hda hdaVar2 = hda.f;
        hda hdaVar3 = hda.g;
        rp4 rp4VarA = hdaVar == hdaVar3 ? ksk.a(hdaVar2, z) : ksk.a(hdaVar, z);
        if (!it.hasNext()) {
            return Collections.singleton(rp4VarA);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(rp4VarA);
        while (it.hasNext()) {
            hda hdaVar4 = (hda) it.next();
            linkedHashSet.add(hdaVar4 == hdaVar3 ? ksk.a(hdaVar2, z) : ksk.a(hdaVar4, z));
        }
        return linkedHashSet;
    }

    public static final String F(jsa jsaVar, sfa sfaVar) {
        jsaVar.getClass();
        String str = sfaVar.g;
        if (str != null && str.length() != 0) {
            return sfaVar.g;
        }
        String strT = sfaVar.t();
        if (strT != null && !r5h.X0(strT)) {
            return sfaVar.t();
        }
        if (sfaVar.E()) {
            return sfaVar.q.g;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object G(jsa jsaVar, long j, List list, nq4 nq4Var) {
        era eraVar;
        if (nq4Var instanceof era) {
            eraVar = (era) nq4Var;
            int i = eraVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                eraVar.g = i - Integer.MIN_VALUE;
            } else {
                eraVar = new era(jsaVar, nq4Var);
            }
        } else {
            eraVar = new era(jsaVar, nq4Var);
        }
        Object objI = eraVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = eraVar.g;
        if (i2 == 0) {
            ch3.d0(objI);
            q24 q24Var = jsaVar.c.i;
            if (q24Var != null) {
                xn3 xn3Var = jsaVar.l;
                long j2 = q24Var.a;
                eraVar.d = list;
                eraVar.g = 1;
                objI = xn3Var.i(j2, eraVar);
                if (objI == hu4Var) {
                    return hu4Var;
                }
            } else {
                ic6 ic6Var = jsaVar.G2;
                wpa wpaVar = wpa.b;
                long[] jArrU1 = ww3.U1(list);
                wpaVar.getClass();
                bc1.q(":complaint?ids=" + a.f1(62, jArrU1) + "&parent_id=" + j, ic6Var);
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = eraVar.d;
        ch3.d0(objI);
        rt2 rt2Var = (rt2) objI;
        Long l = rt2Var != null ? new Long(rt2Var.a) : null;
        if (l == null) {
            String str = jsaVar.v;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "parent chat not found for " + jsaVar.c.i, null);
                }
            }
            a8j.x(jsaVar.E2, new n3g(new pnh(R.string.chat_or_channel_not_found, R.string.channel), null, null, 6));
        } else {
            ic6 ic6Var2 = jsaVar.G2;
            wpa wpaVar2 = wpa.b;
            long jLongValue = l.longValue();
            long j3 = jsaVar.c.i.b;
            long[] jArrU2 = ww3.U1(list);
            wpaVar2.getClass();
            bc1.q(qt4.k(j3, "&post_server_id=", nbh.B(jLongValue, ":complaint?ids=", a.f1(62, jArrU2), "&parent_id=")), ic6Var2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Code duplicated, block: B:91:0x0229  */
    /* JADX WARN: Code duplicated, block: B:98:0x0247  */
    public static final Object H(jsa jsaVar, r8e r8eVar, lna lnaVar, nq4 nq4Var) {
        ora oraVar;
        hu4 hu4Var;
        rt2 rt2Var;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        sfa sfaVar;
        o5d o5dVarU;
        String str;
        a4c a4cVar;
        String str2;
        a4c a4cVar2;
        lna lnaVar2 = lnaVar;
        jsaVar.getClass();
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ora) {
            oraVar = (ora) nq4Var;
            int i = oraVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                oraVar.j = i - Integer.MIN_VALUE;
            } else {
                oraVar = new ora(jsaVar, nq4Var);
            }
        } else {
            oraVar = new ora(jsaVar, nq4Var);
        }
        Object obj = oraVar.h;
        hu4 hu4Var2 = hu4.a;
        int i2 = oraVar.j;
        if (i2 == 0) {
            ch3.d0(obj);
            if (!(lnaVar2 instanceof ina)) {
                hu4Var = hu4Var2;
                if (lnaVar2 instanceof kna) {
                    kna knaVar = (kna) lnaVar2;
                    a8j.x(jsaVar.E2, new e3g(knaVar.d.b, knaVar.a, knaVar.b, new xnh(knaVar.c + "%")));
                    return sbiVar;
                }
                if (!(lnaVar2 instanceof jna)) {
                    ore.o();
                    return null;
                }
                rt2Var = (rt2) r8eVar.a.getValue();
                if (rt2Var != null) {
                    jna jnaVar = (jna) lnaVar2;
                    long j7 = jnaVar.b;
                    sua suaVarV = jsaVar.V();
                    oraVar.d = jnaVar;
                    oraVar.e = rt2Var;
                    oraVar.f = j7;
                    oraVar.j = 2;
                    Object objF = suaVarV.f(j7, oraVar);
                    if (objF != hu4Var) {
                        obj = objF;
                        j = j7;
                        sfaVar = (sfa) obj;
                        if (sfaVar == null) {
                            str2 = jsaVar.v;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str2, c0a.m(j, ") is null", qt4.s(jsaVar.c.a, "can't open poll result: chat(", ") message(")), null);
                                return sbiVar;
                            }
                        } else {
                            o5dVarU = sfaVar.u();
                            if (o5dVarU == null) {
                            }
                            str = jsaVar.v;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var, str, c0a.m(j, ") poll or poll state is null", qt4.s(jsaVar.c.a, "can't open poll result: chat(", ") messageId(")), null);
                            }
                        }
                    }
                    return hu4Var;
                }
                String str3 = jsaVar.v;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, c0a.m(((jna) lnaVar2).b, ") is null", qt4.s(jsaVar.c.a, "can't open poll result: chat(", ") message(")), null);
                    return sbiVar;
                }
            } else {
                if (jsaVar.d.i()) {
                    gm0.x(jsaVar.v, "Can't vote from delayed scope", null);
                    jsaVar.w0(((ina) lnaVar2).c);
                    return sbiVar;
                }
                rt2 rt2Var2 = (rt2) r8eVar.a.getValue();
                if (rt2Var2 == null) {
                    String str4 = jsaVar.v;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                        a4cVar4.c(je9Var, str4, nbh.s(jsaVar.c.a, "OnPollAnswerSelected chat(", ") is null"), null);
                        return sbiVar;
                    }
                } else {
                    ina inaVar = (ina) lnaVar2;
                    if (!inaVar.b.i) {
                        long j8 = rt2Var2.a;
                        long j9 = inaVar.c;
                        int i3 = inaVar.a;
                        f8b f8bVar = jj8.a;
                        f8b f8bVar2 = new f8b(1);
                        f8bVar2.h(i3);
                        ((y8d) jsaVar.K1.getValue()).a.put(Long.valueOf(j9), f8bVar2);
                        jsaVar.h0().c(new kfi(j8, j9, false));
                        try {
                            y9d y9dVar = (y9d) jsaVar.J1.getValue();
                            try {
                                long jA = rt2Var2.A();
                                try {
                                    long j10 = ((ina) lnaVar2).b.b;
                                    oraVar.d = null;
                                    oraVar.e = null;
                                    oraVar.f = j8;
                                    try {
                                        oraVar.g = j9;
                                        oraVar.j = 1;
                                        ghb ghbVar = ew5.b;
                                        hu4Var = hu4Var2;
                                        j2 = j8;
                                        j9 = j9;
                                        try {
                                            if (y9dVar.a(jA, j10, j9, f8bVar2, qe7.O(5, lw5.SECONDS), oraVar) != hu4Var) {
                                                j5 = j9;
                                                j6 = j2;
                                                ((y8d) jsaVar.K1.getValue()).a.put(Long.valueOf(j5), jj8.a);
                                                jsaVar.h0().c(new kfi(j6, j5, false));
                                                return sbiVar;
                                            }
                                            return hu4Var;
                                        } catch (Throwable th) {
                                            th = th;
                                            j3 = j9;
                                            j4 = j2;
                                            jsaVar.n0(false, th);
                                            return sbiVar;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        j2 = j8;
                                        j9 = j9;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    j9 = j9;
                                    j2 = j8;
                                    j3 = j9;
                                    j4 = j2;
                                    jsaVar.n0(false, th);
                                    return sbiVar;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
            }
        } else {
            if (i2 == 1) {
                long j11 = oraVar.g;
                long j12 = oraVar.f;
                try {
                    ch3.d0(obj);
                    j5 = j11;
                    j6 = j12;
                    ((y8d) jsaVar.K1.getValue()).a.put(Long.valueOf(j5), jj8.a);
                    jsaVar.h0().c(new kfi(j6, j5, false));
                    return sbiVar;
                } catch (Throwable th6) {
                    th = th6;
                    j3 = j11;
                    j4 = j12;
                    try {
                        jsaVar.n0(false, th);
                        return sbiVar;
                    } finally {
                        ((y8d) jsaVar.K1.getValue()).a.put(Long.valueOf(j3), jj8.a);
                        jsaVar.h0().c(new kfi(j4, j3, false));
                    }
                }
            }
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = oraVar.f;
            rt2Var = oraVar.e;
            lnaVar2 = oraVar.d;
            ch3.d0(obj);
            sfaVar = (sfa) obj;
            if (sfaVar == null) {
                str2 = jsaVar.v;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, c0a.m(j, ") is null", qt4.s(jsaVar.c.a, "can't open poll result: chat(", ") message(")), null);
                    return sbiVar;
                }
            } else {
                o5dVarU = sfaVar.u();
                if (o5dVarU == null && o5dVarU.e != null) {
                    ic6 ic6Var = jsaVar.G2;
                    wpa wpaVar = wpa.b;
                    long j13 = rt2Var.a;
                    long j14 = ((jna) lnaVar2).a.b;
                    wpaVar.getClass();
                    StringBuilder sb = new StringBuilder(":polls/result?chat_id=");
                    sb.append(j13);
                    sb.append("&message_id=");
                    sb.append(j);
                    bc1.q(qt4.k(j14, "&poll_id=", sb), ic6Var);
                    return sbiVar;
                }
                str = jsaVar.v;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, c0a.m(j, ") poll or poll state is null", qt4.s(jsaVar.c.a, "can't open poll result: chat(", ") messageId(")), null);
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef A[PHI: r1
  0x00ef: PHI (r1v33 java.lang.Object) = (r1v28 java.lang.Object), (r1v32 java.lang.Object), (r1v38 java.lang.Object) binds: [B:62:0x014f, B:52:0x010f, B:47:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:79:0x019c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x019c, please report this as an issue */
    public static final Object I(jsa jsaVar, r8e r8eVar, tna tnaVar, nq4 nq4Var) {
        pra praVar;
        Object obj;
        String name;
        a4c a4cVar;
        je9 je9Var;
        Object objB;
        Object objC;
        jsaVar.getClass();
        Object pxiVar = qxi.a;
        d3j d3jVar = d3j.BUBBLE;
        Object obj2 = sbi.a;
        if (nq4Var instanceof pra) {
            praVar = (pra) nq4Var;
            int i = praVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                praVar.f = i - Integer.MIN_VALUE;
            } else {
                praVar = new pra(jsaVar, nq4Var);
            }
        } else {
            praVar = new pra(jsaVar, nq4Var);
        }
        pra praVar2 = praVar;
        Object obj3 = praVar2.d;
        Object obj4 = hu4.a;
        int i2 = praVar2.f;
        if (i2 == 0) {
            ch3.d0(obj3);
            MessageModel messageModelR = jsaVar.R(tnaVar.l());
            if ((messageModelR != null ? messageModelR.g : null) == f9j.Error) {
                jsaVar.x0(tnaVar.l());
                return obj2;
            }
            rt2 rt2Var = (rt2) r8eVar.a.getValue();
            if (rt2Var != null) {
                if (tnaVar instanceof pna) {
                    pna pnaVar = (pna) tnaVar;
                    ((b2a) jsaVar.B1.getValue()).d(rt2Var.a, jsaVar.d.a, pnaVar.a, false);
                    hyi hyiVar = (hyi) jsaVar.y1.getValue();
                    mg5 mg5Var = jsaVar.d.a;
                    oxi oxiVar = pnaVar.b;
                    praVar2.f = 1;
                    hyiVar.getClass();
                    oxi oxiVar2 = oxiVar != null ? oxiVar : null;
                    if (oxiVar2 == null) {
                        obj = obj4;
                        objB = obj2;
                    } else if (oxiVar2.d.a.getValue() instanceof c50) {
                        objC = ((ifi) hyiVar.a.getValue()).a(rt2Var.a, oxiVar2.a, oxiVar2.b, u60.b, praVar2);
                        if (objC == obj4) {
                            objB = objC;
                            obj = obj4;
                        } else {
                            obj = obj4;
                            objB = obj2;
                        }
                    } else if (oxiVar2.d.a.getValue() instanceof g50) {
                        objC = ((wj2) hyiVar.f.getValue()).a(oxiVar2.a, praVar2, oxiVar2.b);
                        if (objC == obj4) {
                            objB = objC;
                            obj = obj4;
                        } else {
                            obj = obj4;
                            objB = obj2;
                        }
                    } else {
                        if (oxiVar2.d.a.getValue() instanceof d50) {
                            r8e r8eVar2 = oxiVar2.d;
                            if (!(r8eVar2.a.getValue() instanceof g50) && !(r8eVar2.a.getValue() instanceof c50)) {
                                objC = ((tyi) hyiVar.e.getValue()).c(rt2Var.a, oxiVar.a, ns5.CHAT, praVar2);
                                if (objC == obj4) {
                                    objB = objC;
                                    obj = obj4;
                                } else {
                                    obj = obj4;
                                    objB = obj2;
                                }
                            }
                        }
                        r8e r8eVar3 = oxiVar2.d;
                        if (r8eVar3.a.getValue() instanceof f50) {
                            gjg gjgVar = r8eVar3.a;
                            if ((gjgVar.getValue() instanceof g50) || (gjgVar.getValue() instanceof c50)) {
                                obj = obj4;
                                name = hyi.class.getName();
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9Var = je9.f;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, name, s5h.x0("\n                        The click on video message isn't supported. \n                        Attach id: " + oxiVar2.c.h + ";\n                    "), null);
                                    }
                                }
                            } else {
                                obj = obj4;
                                objB = hyiVar.b(rt2Var, oxiVar2.a, mg5Var, oxiVar2.b, oxiVar2.e(), d3jVar, null, true, praVar2);
                                if (objB != obj) {
                                }
                            }
                            objB = obj2;
                        } else {
                            obj = obj4;
                            name = hyi.class.getName();
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, name, s5h.x0("\n                        The click on video message isn't supported. \n                        Attach id: " + oxiVar2.c.h + ";\n                    "), null);
                                }
                            }
                            objB = obj2;
                        }
                    }
                    if (objB == obj) {
                        return obj;
                    }
                } else if ((tnaVar instanceof mna) || (tnaVar instanceof nna)) {
                    hyi hyiVar2 = (hyi) jsaVar.y1.getValue();
                    long jL = tnaVar.l();
                    mg5 mg5Var2 = jsaVar.d.a;
                    String str = tnaVar.b().b;
                    l1j l1jVarE = tnaVar.b().e();
                    praVar2.f = 2;
                    if (hyiVar2.b(rt2Var, jL, mg5Var2, str, l1jVarE, d3jVar, null, true, praVar2) == obj4) {
                        return obj4;
                    }
                } else if (tnaVar instanceof ona) {
                    hyi hyiVar3 = (hyi) jsaVar.y1.getValue();
                    ona onaVar = (ona) tnaVar;
                    long j = onaVar.a;
                    mg5 mg5Var3 = jsaVar.d.a;
                    oxi oxiVar3 = onaVar.b;
                    String str2 = oxiVar3.b;
                    l1j l1jVarE2 = oxiVar3.e();
                    float f = onaVar.c;
                    boolean z = onaVar.d;
                    Float f2 = new Float(f);
                    praVar2.f = 3;
                    if (hyiVar3.b(rt2Var, j, mg5Var3, str2, l1jVarE2, d3jVar, f2, z, praVar2) == obj4) {
                        return obj4;
                    }
                } else {
                    if (tnaVar instanceof rna) {
                        a8j.x(jsaVar.f2, pxiVar);
                        return obj2;
                    }
                    if (!(tnaVar instanceof qna)) {
                        if (!(tnaVar instanceof sna)) {
                            ore.o();
                            return null;
                        }
                        a8j.x(jsaVar.E2, gub.a);
                        ic6 ic6Var = jsaVar.f2;
                        sna snaVar = (sna) tnaVar;
                        if (snaVar.c) {
                            pxiVar = new pxi(snaVar.b.b);
                        }
                        a8j.x(ic6Var, pxiVar);
                        return obj2;
                    }
                    a8j.x(jsaVar.E2, fub.a);
                    long j2 = ((qna) tnaVar).a;
                    praVar2.f = 4;
                    if (jsaVar.o0(r8eVar, j2, praVar2) == obj4) {
                        return obj4;
                    }
                }
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj3);
                return obj2;
            }
            if (i2 == 3) {
                ch3.d0(obj3);
                return obj2;
            }
            if (i2 == 4) {
                ch3.d0(obj3);
                return obj2;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj3);
        a8j.x(jsaVar.E2, hub.a);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [jsa] */
    /* JADX WARN: Type inference failed for: r5v4, types: [u8b] */
    /* JADX WARN: Type inference failed for: r6v5, types: [r66] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    public static final Object J(jsa jsaVar, rt2 rt2Var, nq4 nq4Var) {
        qra qraVar;
        ?? arrayList;
        List list;
        mjg mjgVar = jsaVar.e2;
        if (nq4Var instanceof qra) {
            qraVar = (qra) nq4Var;
            int i = qraVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qraVar.f = i - Integer.MIN_VALUE;
            } else {
                qraVar = new qra(jsaVar, nq4Var);
            }
        } else {
            qraVar = new qra(jsaVar, nq4Var);
        }
        Object objD0 = qraVar.d;
        int i2 = qraVar.f;
        if (i2 == 0) {
            ch3.d0(objD0);
            vg4 vg4VarW = rt2Var.w();
            if (vg4VarW == null || !rt2Var.F0()) {
                ak6 ak6Var = new ak6(cqb.b);
                mjgVar.getClass();
                mjgVar.j(null, ak6Var);
            } else {
                mjgVar.getClass();
                mjgVar.j(null, bk6.a);
                long jV = vg4VarW.v();
                qraVar.f = 1;
                objD0 = jsaVar.d0(jV, qraVar);
                hu4 hu4Var = hu4.a;
                if (objD0 == hu4Var) {
                    return hu4Var;
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objD0);
        ae3 ae3Var = (ae3) objD0;
        if (ae3Var == null || (list = ae3Var.c) == null) {
            arrayList = r66.a;
        } else {
            List list2 = list;
            arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((st2) it.next()).f);
            }
        }
        ?? u8bVar = new u8b();
        u8bVar.d(arrayList);
        ak6 ak6Var2 = new ak6(u8bVar);
        mjgVar.getClass();
        mjgVar.j(null, ak6Var2);
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object K(jsa jsaVar, vg4 vg4Var, nq4 nq4Var) {
        rra rraVar;
        mjg mjgVar = jsaVar.g2;
        if (nq4Var instanceof rra) {
            rraVar = (rra) nq4Var;
            int i = rraVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rraVar.f = i - Integer.MIN_VALUE;
            } else {
                rraVar = new rra(jsaVar, nq4Var);
            }
        } else {
            rraVar = new rra(jsaVar, nq4Var);
        }
        Object objB = rraVar.d;
        int i2 = rraVar.f;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(objB);
            List listS = vg4Var != null ? vg4Var.s() : null;
            List list = listS;
            if (list == null || list.isEmpty()) {
                mjgVar.setValue(null);
                return sbiVar;
            }
            cic cicVar = (cic) jsaVar.W1.getValue();
            Long l = (Long) ww3.t1(listS);
            rraVar.f = 1;
            objB = cicVar.b(l, rraVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objB);
        }
        yhc yhcVar = (yhc) objB;
        mjgVar.setValue(yhcVar != null ? new eic(yhcVar.b, yhcVar.g) : null);
        return sbiVar;
    }

    public static final Object L(jsa jsaVar, List list, g4b g4bVar, mdh mdhVar) {
        ita itaVar = jsaVar.c;
        if (itaVar.i == null) {
            return ((uua) jsaVar.D.getValue()).a(itaVar.a, list, g4bVar, mdhVar);
        }
        Iterator it = ww3.X1(list).iterator();
        while (it.hasNext()) {
            ((wzj) jsaVar.q1.getValue()).c(new ukf(itaVar.i, ((Number) it.next()).longValue()));
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0077, please report this as an issue */
    public static final void M(jsa jsaVar, rt2 rt2Var, long j) {
        String lastPathSegment;
        if (!rt2Var.d0()) {
            String str = jsaVar.v;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbS = qt4.s(rt2Var.a, "can share only from channel: ", " ");
                sbS.append(j);
                a4cVar.c(je9Var, str, sbS.toString(), null);
                return;
            }
            return;
        }
        w69 w69Var = (w69) jsaVar.r1.getValue();
        String str2 = rt2Var.b.J;
        boolean zW0 = rt2Var.w0();
        long jA = rt2Var.A();
        w69Var.getClass();
        String string = "";
        if (zW0) {
            if (jA != 0) {
                lastPathSegment = String.format(Locale.getDefault(), "c/%d", Long.valueOf(jA));
                if (!TextUtils.isEmpty(lastPathSegment)) {
                    Locale.getDefault();
                    string = w69.b(j, "https://max.ru/" + lastPathSegment + "/").toString();
                }
            }
        } else if (!TextUtils.isEmpty(str2)) {
            lastPathSegment = Uri.parse(str2).getLastPathSegment();
            if (!TextUtils.isEmpty(lastPathSegment)) {
                Locale.getDefault();
                string = w69.b(j, "https://max.ru/" + lastPathSegment + "/").toString();
            }
        }
        it3.a(jsaVar.U(), string);
        if (it3.b()) {
            a8j.x(jsaVar.E2, new n3g(new tnh(R.string.chat_screen_action_share_post_success_copied), Integer.valueOf(R.drawable.icon_check_round_fill), null, 4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object N(jsa jsaVar, List list, nq4 nq4Var) {
        dsa dsaVar;
        r8e r8eVar = jsaVar.w2;
        if (nq4Var instanceof dsa) {
            dsaVar = (dsa) nq4Var;
            int i = dsaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                dsaVar.g = i - Integer.MIN_VALUE;
            } else {
                dsaVar = new dsa(jsaVar, nq4Var);
            }
        } else {
            dsaVar = new dsa(jsaVar, nq4Var);
        }
        Object objA0 = dsaVar.e;
        int i2 = dsaVar.g;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objA0);
            if (((f5d) jsaVar.s).q() && (r8eVar.a.getValue() instanceof s04)) {
                dsaVar.d = list;
                dsaVar.g = 1;
                objA0 = jsaVar.A0(list, dsaVar);
                if (objA0 != obj) {
                }
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objA0);
                return objA0;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = dsaVar.d;
        ch3.d0(objA0);
        if (objA0 == null) {
            return Boolean.FALSE;
        }
        cea ceaVarY = jsaVar.Y();
        dsaVar.d = null;
        dsaVar.g = 2;
        ceaVarY.getClass();
        rt2 rt2Var = (rt2) r8eVar.a.getValue();
        Object objE = rt2Var == null ? Boolean.FALSE : ceaVarY.e(rt2Var, list, dsaVar);
        return objE == obj ? obj : objE;
    }

    public static final void O(jsa jsaVar) {
        h8c h8cVar = (h8c) jsaVar.E.getValue();
        h8cVar.h(new w8c(R.drawable.icon_warning));
        h8cVar.m(new tnh(R.string.chat_screen_message_resend_media_permission_error));
        h8cVar.c(new o8c(0, 0, jsaVar.Q2, 11));
        h8cVar.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A0(List list, nq4 nq4Var) {
        bsa bsaVar;
        if (nq4Var instanceof bsa) {
            bsaVar = (bsa) nq4Var;
            int i = bsaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bsaVar.f = i - Integer.MIN_VALUE;
            } else {
                bsaVar = new bsa(this, nq4Var);
            }
        } else {
            bsaVar = new bsa(this, nq4Var);
        }
        Object objJ = bsaVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = bsaVar.f;
        if (i2 == 0) {
            ch3.d0(objJ);
            bsaVar.f = 1;
            objJ = a0().j(list, bsaVar);
            if (objJ == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objJ);
        }
        Iterable iterable = (Iterable) objJ;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c0a.t(((sfa) it.next()).e, arrayList);
        }
        Set setX1 = ww3.X1(arrayList);
        if (setX1.size() != 1) {
            String str = this.v;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Early return. Selected messages from different authors.", null);
                    return null;
                }
            }
        } else {
            long jLongValue = ((Number) ww3.q1(setX1)).longValue();
            if (jLongValue != ((s7f) this.q).t()) {
                return new Long(jLongValue);
            }
        }
        return null;
    }

    public final void B0(int i, long j) {
        rt2 rt2Var = (rt2) this.w2.a.getValue();
        if (rt2Var == null || this.d.i()) {
            return;
        }
        yab.i0((wmi) this.H1.getValue(), ((n0c) this.j).b(), 0, new csa(this, j, i, rt2Var.z(), rt2Var.b.m, null), 2);
    }

    public final void C0(long j, t50 t50Var) {
        boolean z = t50Var instanceof aq6;
        dq5 dq5Var = dq5.a;
        ic6 ic6Var = this.G2;
        if (!z) {
            if (t50Var instanceof eag) {
                eag eagVar = (eag) t50Var;
                wpa wpaVar = wpa.b;
                long j2 = eagVar.c.a;
                String str = eagVar.b;
                wpaVar.getClass();
                a8j.x(ic6Var, wpa.l(j, j2, str, dq5Var));
                return;
            }
            if (t50Var instanceof oxi) {
                oxi oxiVar = (oxi) t50Var;
                wpa wpaVar2 = wpa.b;
                long j3 = oxiVar.c.a;
                String str2 = oxiVar.b;
                wpaVar2.getClass();
                a8j.x(ic6Var, wpa.l(j, j3, str2, dq5Var));
                return;
            }
            return;
        }
        aq6 aq6Var = (aq6) t50Var;
        wpa wpaVar3 = wpa.b;
        long j4 = aq6Var.a;
        String str3 = aq6Var.c;
        int iD = qt4.D(aq6Var.i);
        if (iD == 0) {
            dq5Var = dq5.c;
        } else if (iD != 1) {
            if (iD == 2) {
                dq5Var = dq5.d;
            } else {
                if (iD != 3) {
                    ore.o();
                    return;
                }
                dq5Var = dq5.f;
            }
        }
        dq5 dq5Var2 = dq5Var;
        wpaVar3.getClass();
        a8j.x(ic6Var, wpa.l(j, j4, str3, dq5Var2));
    }

    public final void D0(tnh tnhVar, ynh ynhVar) {
        a8j.x(this.E2, new n3g(ynhVar, null, tnhVar, 2));
    }

    public final void P(long j) {
        if (!this.H2.d(j)) {
            this.H2.a(j);
            jt4 jt4Var = this.o;
            jt4Var.getClass();
            e9i.j0(new dz6(new fz6(e9i.T(new bye(new vq(jt4Var, j, (lq4) null, 22)), jt4Var.b), new bra(this, null, 0), 3), new yw9(this, j, null)), this.b);
            return;
        }
        String str = this.v;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, nbh.s(j, "Copy media ", " already processing"), null);
        }
    }

    public final void Q(List list, boolean z) {
        a8j.t(this, ((n0c) this.j).a(), new qi4(this, list, z, (lq4) null, 7), 2);
    }

    public final MessageModel R(long j) {
        if (j != -9223372036854775805L) {
            return ((opa) this.y2.getValue()).h(j);
        }
        k79 k79Var = (k79) ww3.t1((List) this.A2.a.getValue());
        MessageModel messageModel = k79Var instanceof MessageModel ? (MessageModel) k79Var : null;
        if (messageModel == null || messageModel.a != j) {
            return null;
        }
        return messageModel;
    }

    public final void S(List list, boolean z) {
        rt2 rt2Var;
        if (list.size() != 1) {
            ic6 ic6Var = this.G2;
            wpa.b.getClass();
            a8j.x(ic6Var, wpa.j(list, false));
            return;
        }
        Long l = (Long) ww3.t1(list);
        if (l == null) {
            gm0.n(this.v, "Forward message: empty messagesIds, return");
            return;
        }
        long jLongValue = l.longValue();
        MessageModel messageModelH = ((opa) this.z2.a.getValue()).h(jLongValue);
        if (messageModelH == null) {
            String str = this.v;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, nbh.s(jLongValue, "Forward message: cant find message with id(", "), return"), null);
                return;
            }
            return;
        }
        ic6 ic6Var2 = this.G2;
        wpa wpaVar = wpa.b;
        boolean z2 = messageModelH.j.b instanceof aq6;
        wpaVar.getClass();
        a8j.x(ic6Var2, wpa.j(list, z2));
        if (!z || (rt2Var = (rt2) this.w2.a.getValue()) == null) {
            return;
        }
        ((ae9) this.I1.getValue()).h("forward_post_click", wm9.Q0(new ylc("channel_id", Long.valueOf(rt2Var.A())), new ylc("message_id", Long.valueOf(messageModelH.b))));
    }

    public final sdg T() {
        rt2 rt2Var = (rt2) this.w2.a.getValue();
        if (rt2Var == null) {
            return null;
        }
        return yql.a(rt2Var);
    }

    public final Application U() {
        return (Application) this.z.getValue();
    }

    public final sua V() {
        return (sua) this.C.getValue();
    }

    public final hy3 W() {
        return (hy3) this.K.getValue();
    }

    public final i65 X(long j, long j2, String str, boolean z) {
        wpa wpaVar = wpa.b;
        t73 t73Var = this.d;
        mg5 mg5Var = t73Var.a;
        boolean z2 = z || t73Var.i() || t73Var.a();
        wpaVar.getClass();
        byte b = mg5Var.a;
        StringBuilder sbT = qt4.t(j, ":attach/viewer?chat_id=", "&attach_id=", str);
        qt4.z(j2, "&msg_id=", "&single=", sbT);
        sbT.append(z2);
        sbT.append("&item_type_id=");
        sbT.append((int) b);
        return new i65(sbT.toString());
    }

    public final cea Y() {
        return (cea) this.x2.getValue();
    }

    public final p20 Z() {
        return (p20) this.i2.getValue();
    }

    public final j44 a0() {
        return (j44) this.B.getValue();
    }

    public final h4b b0() {
        return (h4b) this.F1.getValue();
    }

    public final x5b c0() {
        return (x5b) this.J2.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d0(long j, nq4 nq4Var) {
        dra draVar;
        if (nq4Var instanceof dra) {
            draVar = (dra) nq4Var;
            int i = draVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                draVar.g = i - Integer.MIN_VALUE;
            } else {
                draVar = new dra(this, nq4Var);
            }
        } else {
            draVar = new dra(this, nq4Var);
        }
        dra draVar2 = draVar;
        Object poeVar = draVar2.e;
        hu4 hu4Var = hu4.a;
        int i2 = draVar2.g;
        try {
            if (i2 == 0) {
                ch3.d0(poeVar);
                pvb pvbVar = (pvb) this.x.getValue();
                wy2 wy2Var = new wy2(new long[]{j}, (Long) null, 4);
                String str = this.v;
                draVar2.d = j;
                draVar2.g = 1;
                poeVar = qe7.E(pvbVar, wy2Var, str, 0L, 0, null, null, draVar2, 124);
                if (poeVar == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = draVar2.d;
                ch3.d0(poeVar);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str2 = this.v;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, zo5.j(j, "Failed to load mutual chats. contactServerId = "), thA);
                }
            }
        }
        if (poeVar instanceof poe) {
            return null;
        }
        return poeVar;
    }

    public final jcd e0() {
        return (jcd) this.G.getValue();
    }

    public final j0f f0() {
        return (j0f) this.V1.getValue();
    }

    public final fva g0() {
        return (fva) this.D2.getValue();
    }

    public final t51 h0() {
        return (t51) this.O1.getValue();
    }

    public final edi i0() {
        return (edi) this.C2.getValue();
    }

    public final void j0(String str, boolean z) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) this.j).b(), 2, new q40(this, str, z, null));
        this.m2.B(this, Z2[3], sggVarH0);
    }

    public final void k0(String str) {
        if (str == null) {
            gm0.Y(jsa.class.getName(), "Early return in handleMentionByLink cuz of link is null");
            return;
        }
        String strA = ((w69) this.r1.getValue()).a(str);
        if (strA == null) {
            gm0.Y(jsa.class.getName(), "Early return in handleMentionByLink cuz of links.channelProfileTagToLink(link) is null");
        } else {
            j0(strA, false);
        }
    }

    public final void l0(cga cgaVar, long j) {
        if (c0().h()) {
            c0().i(j);
            return;
        }
        if (zqa.$EnumSwitchMapping$3[cgaVar.c.ordinal()] == 1) {
            long j2 = cgaVar.a;
            if (j2 <= 0) {
                k0(cgaVar.b);
            } else {
                m0(j2);
            }
        }
    }

    public final void m0(long j) {
        yab.i0(this.b, null, 0, new nra(this, j, null, 1), 3);
    }

    public final void n0(boolean z, Throwable th) throws Throwable {
        if (th instanceof TimeoutCancellationException) {
            D0(new tnh(R.string.snack_network_error_description), new tnh(z ? R.string.messages_list_message_poll_revote_error : R.string.messages_list_message_poll_send_vote_error));
            return;
        }
        if (th instanceof CancellationException) {
            String str = this.v;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                throw th;
            }
            je9 je9Var = je9.f;
            if (!a4cVar.b(je9Var)) {
                throw th;
            }
            a4cVar.c(je9Var, str, "not sending vote due to cancellation", null);
            throw th;
        }
        if (!(th instanceof TamErrorException)) {
            D0(null, new tnh(R.string.common_service_error));
            return;
        }
        dih dihVarA = svl.a(((TamErrorException) th).a);
        if (dihVarA instanceof cih) {
            D0(null, new xnh(((cih) dihVarA).a));
            return;
        }
        if (dihVarA instanceof aih) {
            D0(new tnh(R.string.snack_network_error_description), new tnh(R.string.snack_network_error_title));
            return;
        }
        if (dihVarA instanceof bih) {
            D0(null, new tnh(R.string.common_service_error));
        } else if (dihVarA instanceof zhh) {
            D0(null, new tnh(R.string.common_service_error));
        } else {
            ore.o();
        }
    }

    public final Object o0(gjg gjgVar, long j, nq4 nq4Var) {
        rt2 rt2Var = (rt2) gjgVar.getValue();
        sbi sbiVar = sbi.a;
        if (rt2Var == null) {
            gm0.Y(this.v, "handleTranscriptionClick: chat == null");
            return sbiVar;
        }
        Object objD = ((e1i) this.F2.getValue()).d(j, rt2Var, nq4Var);
        return objD == hu4.a ? objD : sbiVar;
    }

    public final boolean p0() {
        nx2 nx2Var;
        zw2 zw2Var;
        rt2 rt2Var = (rt2) this.w2.a.getValue();
        return ((f5d) this.s).q() && rt2Var != null && rt2Var.d0() && (nx2Var = rt2Var.b) != null && (zw2Var = nx2Var.I) != null && zw2Var.m;
    }

    public final boolean q0() {
        return ((Boolean) this.d2.getValue()).booleanValue();
    }

    public final boolean r0() {
        return ((Boolean) this.c2.getValue()).booleanValue();
    }

    public final boolean s0(t50 t50Var, long j, String str) {
        Long lValueOf;
        h50 h50Var;
        if (c0().h()) {
            c0().i(j);
            return true;
        }
        q24 q24Var = this.c.i;
        boolean z = q24Var != null && j == -9223372036854775805L;
        r8e r8eVarL = z ? this.l.l(q24Var.a) : this.w2;
        Class<?> cls = null;
        if (z) {
            MessageModel messageModelR = R(-9223372036854775805L);
            lValueOf = messageModelR != null ? Long.valueOf(messageModelR.u) : null;
        } else {
            lValueOf = Long.valueOf(j);
        }
        if (lValueOf == null) {
            String str2 = this.v;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, zo5.j(j, "commented post model not found "), null);
                    return false;
                }
            }
            return false;
        }
        j44 j44VarV = z ? V() : a0();
        long jLongValue = lValueOf.longValue();
        if (t50Var instanceof jh4) {
            return false;
        }
        if (((t50Var instanceof yv3) && str == null) || (t50Var instanceof y90) || (t50Var instanceof oxi) || (t50Var instanceof e7d)) {
            return false;
        }
        aq6 aq6Var = t50Var instanceof aq6 ? (aq6) t50Var : null;
        if (aq6Var != null && (h50Var = (h50) aq6Var.m.a.getValue()) != null) {
            cls = h50Var.getClass();
        }
        ks9 ks9Var = this.l2;
        zv8 zv8Var = Z2[2];
        ((zu4) ks9Var.b).a(xw3.P0(t50Var, lValueOf, str, cls), new tqa(this, t50Var, j44VarV, jLongValue, r8eVarL, str));
        return true;
    }

    public final boolean t0(MessageModel messageModel) {
        if (!((Boolean) this.I2.getValue()).booleanValue()) {
            rt2 rt2Var = (rt2) this.w2.a.getValue();
            if (rt2Var == null) {
                String str = this.v;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, nbh.s(this.c.a, "onChangeLastReadMessage: chat #", " is null"), null);
                        return false;
                    }
                }
            } else {
                if (rt2Var.z() == messageModel.c && rt2Var.y0()) {
                    ((h5c) this.S1.getValue()).b(rt2Var.A());
                    ((aob) this.T1.getValue()).d(rt2Var.A(), messageModel.c);
                }
                if (messageModel.o(rt2Var)) {
                    this.k2.B(this, Z2[1], yab.h0(this.b, this.w, 2, new af8(this, messageModel, (lq4) null, 25)));
                    if (messageModel.b != 0) {
                        return true;
                    }
                } else {
                    String str2 = this.v;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.e;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "message cannot be read " + messageModel.x() + ", chat.selfReadMark=" + rt2Var.z(), null);
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        if (r0.a(r12, r5) == r6) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u0(defpackage.luk r26, defpackage.nq4 r27) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsa.u0(luk, nq4):java.lang.Object");
    }

    public final void v0(int i, List list) {
        u40 u40Var;
        long jLongValue;
        MessageModel messageModelH;
        t50 t50Var;
        Long l;
        je9 je9Var = je9.f;
        if (i == R.id.messages_list_context_action_reply) {
            Long l2 = (Long) ww3.t1(list);
            if (l2 != null) {
                a8j.x(this.E2, new h3g(l2.longValue()));
                return;
            }
            return;
        }
        if (i == R.id.messages_list_context_action_forward) {
            S(list, false);
            return;
        }
        if (i == R.id.messages_list_context_action_copy) {
            a8j.t(this, ((n0c) this.j).b(), new vra(list, this, null), 2);
            return;
        }
        if (i == R.id.messages_list_context_action_report) {
            a8j.t(this, ((n0c) this.j).b(), new wra(this, list, null, 0), 2);
            return;
        }
        if (i == R.id.messages_list_context_action_mark_as_unread) {
            this.j2.B(this, Z2[0], yab.h0(this.b, ((n0c) this.j).b(), 2, new me1(list, this, null)));
            return;
        }
        if (i == R.id.messages_list_context_action_delete) {
            a8j.t(this, ((n0c) this.j).b(), new wd9(this, list, (lq4) null, 8), 2);
            return;
        }
        if (i == R.id.messages_list_confirm_delete) {
            Q(list, true);
            return;
        }
        if (i == R.id.messages_list_confirm_delete_scheduled) {
            Q(list, false);
            return;
        }
        if (i == R.id.messages_list_context_action_pin) {
            rt2 rt2Var = (rt2) this.w2.a.getValue();
            if (rt2Var == null || (l = (Long) ww3.t1(list)) == null) {
                return;
            }
            boolean z = (rt2Var.b.M == 0 && rt2Var.e == null) ? false : true;
            ic6 ic6Var = this.E2;
            if (z) {
                kc4 kc4Var = ida.a;
                a8j.x(ic6Var, new x1g(Collections.singletonList(l), rt2Var.d0() ? new tnh(R.string.channel_screen_confirmation_replace_pin_title) : new tnh(R.string.chat_screen_confirmation_replace_pin_title), null, xw3.P0(new kc4(R.id.messages_list_confirm_pin_with_notify, new tnh(R.string.chat_screen_confirmation_pin_with_notify_button), 3, 56), new kc4(R.id.messages_list_confirm_pin_without_notify, new tnh(R.string.chat_screen_confirmation_pin_without_notify_button), 3, 56), ida.a), null, 48));
                return;
            } else {
                kc4 kc4Var2 = ida.a;
                a8j.x(ic6Var, new x1g(Collections.singletonList(l), rt2Var.d0() ? new tnh(R.string.channel_screen_confirmation_pin_title) : new tnh(R.string.chat_screen_confirmation_pin_title), null, xw3.P0(new kc4(R.id.messages_list_confirm_pin_with_notify, new tnh(R.string.chat_screen_confirmation_pin_with_notify_button), 3, 56), new kc4(R.id.messages_list_confirm_pin_without_notify, new tnh(R.string.chat_screen_confirmation_pin_without_notify_button), 3, 56), ida.a), null, 48));
                return;
            }
        }
        if (i == R.id.messages_list_confirm_pin_with_notify) {
            Long l3 = (Long) ww3.t1(list);
            if (l3 != null) {
                a8j.t(this, null, new asa(this, l3.longValue(), true, true, null), 3);
                return;
            }
            return;
        }
        if (i == R.id.messages_list_confirm_pin_without_notify) {
            Long l4 = (Long) ww3.t1(list);
            if (l4 != null) {
                a8j.t(this, null, new asa(this, l4.longValue(), false, true, null), 3);
                return;
            }
            return;
        }
        if (i == R.id.messages_list_context_action_unpin) {
            a8j.t(this, null, new gv7(this, list, null, 12), 3);
            return;
        }
        if (i == R.id.messages_list_context_action_select) {
            Long l5 = (Long) ww3.t1(list);
            if (l5 != null) {
                c0().i(l5.longValue());
                return;
            }
            return;
        }
        if (i == R.id.messages_list_context_action_edit) {
            Long l6 = (Long) ww3.t1(list);
            if (l6 != null) {
                a8j.x(this.E2, new b2g(l6.longValue()));
                return;
            }
            return;
        }
        if (i == R.id.chat_screen_message_send_error_resend_action_solo) {
            a8j.t(this, ((n0c) this.j).b(), new wra(this, list, null, 1), 2);
            return;
        }
        if (i == R.id.chat_screen_message_send_error_resend_action_multi) {
            a8j.t(this, ((n0c) this.j).b(), new ur8(this, null, 9), 2);
            return;
        }
        if (i == R.id.chat_screen_message_send_error_delete_action) {
            Q(list, true);
            return;
        }
        if (i == R.id.messages_list_context_action_save_to_gallery) {
            a8j.t(this, ((n0c) this.j).b(), new qz9(list, this, null, 7), 2);
            c0().b();
            return;
        }
        if (i == R.id.messages_list_context_action_copy_photo) {
            Long l7 = (Long) ww3.t1(list);
            if (l7 != null) {
                P(l7.longValue());
                return;
            }
            return;
        }
        if (i == R.id.messages_list_context_action_share_externally) {
            Long l8 = (Long) ww3.t1(list);
            if (l8 == null || (messageModelH = ((opa) this.z2.a.getValue()).h((jLongValue = l8.longValue()))) == null || (t50Var = messageModelH.j.b) == null) {
                return;
            }
            C0(jLongValue, t50Var);
            c0().b();
            return;
        }
        if (i == R.id.messages_list_context_action_share_post) {
            a8j.t(this, ((n0c) this.j).b(), new yra(list, this, (lq4) null), 2);
            return;
        }
        if (i == R.id.messages_list_context_action_share_message) {
            a8j.t(this, ((n0c) this.j).a(), new yra(this, list, (lq4) null), 2);
            return;
        }
        if (i == R.id.messages_list_context_action_scheduled_send_now) {
            a8j.t(this, ((n0c) this.j).a(), new vk4(this, list, null, 29), 2);
            return;
        }
        if (i == R.id.messages_list_context_action_scheduled_edit_time) {
            a8j.t(this, ((n0c) this.j).b(), new wz6(list, this, (lq4) null, 15), 2);
            return;
        }
        if (i == R.id.messages_list_context_action_poll_revote) {
            Long l9 = (Long) ww3.t1(list);
            if (l9 != null) {
                this.o2.B(this, Z2[5], a8j.t(this, ((n0c) this.j).a(), new f1j(this, l9.longValue(), (lq4) null, 10), 2));
                return;
            }
            String str = this.v;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "poll revote: messageIds is empty", null);
                return;
            }
            return;
        }
        if (i == R.id.messages_list_context_action_poll_finish) {
            Long l10 = (Long) ww3.t1(list);
            if (l10 == null) {
                String str2 = this.v;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "poll finish: messageIds is empty", null);
                    return;
                }
                return;
            }
            long jLongValue2 = l10.longValue();
            rt2 rt2Var2 = (rt2) this.w2.a.getValue();
            if (rt2Var2 == null) {
                String str3 = this.v;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, "poll finish: chat is null", null);
                    return;
                }
                return;
            }
            MessageModel messageModelH2 = ((opa) this.z2.a.getValue()).h(jLongValue2);
            t50 t50Var2 = (messageModelH2 == null || (u40Var = messageModelH2.j) == null) ? null : u40Var.b;
            e7d e7dVar = t50Var2 instanceof e7d ? (e7d) t50Var2 : null;
            if (e7dVar != null) {
                a8j.x(this.G2, new fgc(rt2Var2.a, jLongValue2, e7dVar.b));
                return;
            }
            String str4 = this.v;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str4, nbh.s(jLongValue2, "poll finish: pollId for message(", ") is null"), null);
            }
        }
    }

    public final void w0(long j) {
        MessageModel messageModelR = R(j);
        if (c0().h()) {
            c0().i(j);
            return;
        }
        if ((messageModelR != null ? messageModelR.g : null) == f9j.Error) {
            x0(j);
            return;
        }
        String str = this.v;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "showContextMenu #"), null);
            }
        }
        sgg sggVar = this.s2;
        if (sggVar == null || !sggVar.isActive()) {
            this.K2.set(j);
            this.s2 = yab.i0(this.b, ((n0c) this.j).a(), 0, new h99(this, j, (lq4) null, 2), 2);
        }
    }

    public final void x0(long j) {
        int size = ((opa) this.y2.getValue()).c().size();
        kc4 kc4Var = ida.a;
        rt2 rt2Var = (rt2) this.w2.a.getValue();
        boolean z = false;
        if (rt2Var != null && rt2Var.d0()) {
            z = true;
        }
        List listSingletonList = Collections.singletonList(Long.valueOf(j));
        tnh tnhVar = z ? new tnh(R.string.channel_screen_message_send_error_title) : new tnh(R.string.chat_screen_message_send_error_title);
        c79 c79VarW = yab.w();
        c79VarW.add(new kc4(R.id.chat_screen_message_send_error_resend_action_solo, z ? new tnh(R.string.channel_screen_message_send_error_resend_action_solo) : new tnh(R.string.chat_screen_message_send_error_resend_action_solo), 3, 56));
        if (size > 1) {
            c79VarW.add(new kc4(R.id.chat_screen_message_send_error_resend_action_multi, z ? new vnh(R.string.channel_screen_message_send_error_resend_action_multi, a.n1(new Object[]{Integer.valueOf(size)})) : new vnh(R.string.chat_screen_message_send_error_resend_action_multi, a.n1(new Object[]{Integer.valueOf(size)})), 3, 56));
        }
        c79VarW.add(new kc4(R.id.chat_screen_message_send_error_delete_action, z ? new tnh(R.string.channel_screen_message_send_error_delete_action) : new tnh(R.string.chat_screen_message_send_error_delete_action), 1, 56));
        a8j.x(this.E2, new x1g(listSingletonList, tnhVar, null, yab.j(c79VarW), null, 16));
    }

    @Override // defpackage.a8j
    public final void y() {
        Z().c();
        this.k.a();
        this.H2.c();
        o50 o50Var = this.t;
        p3c p3cVar = o50Var.e;
        zv8[] zv8VarArr = o50.g;
        vo8 vo8Var = (vo8) p3cVar.m(o50Var, zv8VarArr[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        o50Var.e.B(o50Var, zv8VarArr[0], null);
        o50Var.f.setValue(null);
        ((oka) this.L2.getValue()).clear();
        this.K2.set(0L);
        ((y8d) this.K1.getValue()).a.clear();
        rt2 rt2Var = (rt2) this.w2.a.getValue();
        if (rt2Var != null) {
            long jA = rt2Var.A();
            v8d v8dVar = (v8d) this.L1.getValue();
            v8dVar.x();
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) v8dVar.s.get(Long.valueOf(jA));
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.clear();
            }
            jfa jfaVar = (jfa) this.N1.getValue();
            jfaVar.b(jA);
            jfaVar.h.remove(Long.valueOf(jA));
        }
        ((ConcurrentHashMap) this.g.b).clear();
        ConcurrentHashMap concurrentHashMap = ((e1i) this.F2.getValue()).j;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((vo8) ((Map.Entry) it.next()).getValue()).b(null);
        }
        concurrentHashMap.clear();
    }

    public final void y0(Set set) {
        if (this.d.i()) {
            return;
        }
        yab.i0(this.b, ((n0c) this.j).a(), 0, new af8(this, set, (lq4) null, 26), 2);
    }

    public final void z0(boolean z) {
        fva fvaVarG0 = g0();
        String str = fvaVarG0.l;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("Update scroll to bottom state, visible:", z), null);
            }
        }
        mjg mjgVar = fvaVarG0.s;
        while (true) {
            Object value = mjgVar.getValue();
            boolean z2 = z;
            if (mjgVar.h(value, j6f.a((j6f) value, 0, z2, false, null, false, 29))) {
                return;
            } else {
                z = z2;
            }
        }
    }
}
