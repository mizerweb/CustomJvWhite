package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.exception.ChatNotFoundException;
import ru.ok.tamtam.exception.UserNotFoundException;
import ru.ok.tamtam.messages.ChatException;

/* JADX INFO: loaded from: classes.dex */
public final class qw2 extends h03 {
    public static final vv2 I = new vv2(0);
    public static final EnumSet J;
    public static final EnumSet K;
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final wmi D;
    public final xhh E;
    public final ny8 F;
    public ow2 G;
    public final dp5 n;
    public final t51 o;
    public final zed p;
    public final dp5 q;
    public final dp5 r;
    public final dp5 s;
    public final dp5 t;
    public final dp5 u;
    public final ny8 v;
    public final dp5 w;
    public final dp5 x;
    public final dp5 y;
    public final dp5 z;
    public final mjg b = p90.a(null);
    public final l9b c = new l9b();
    public final m8b d = new m8b(40);
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public volatile boolean l = false;
    public final wo8 m = new wo8(null);
    public final ReentrantLock H = new ReentrantLock();

    static {
        kx2 kx2Var = kx2.b;
        kx2 kx2Var2 = kx2.c;
        kx2 kx2Var3 = kx2.e;
        kx2 kx2Var4 = kx2.d;
        kx2 kx2Var5 = kx2.f;
        kx2 kx2Var6 = kx2.h;
        kx2 kx2Var7 = kx2.g;
        kx2 kx2Var8 = kx2.a;
        J = EnumSet.of(kx2Var8, kx2Var, kx2Var2, kx2Var3, kx2Var4, kx2Var5, kx2Var6, kx2Var7);
        K = EnumSet.of(kx2Var8, kx2Var7);
        EnumSet.of(kx2Var8);
    }

    public qw2(dp5 dp5Var, t51 t51Var, zed zedVar, dp5 dp5Var2, dp5 dp5Var3, dp5 dp5Var4, dp5 dp5Var5, dp5 dp5Var6, dp5 dp5Var7, dp5 dp5Var8, dp5 dp5Var9, dp5 dp5Var10, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, xhh xhhVar, ny8 ny8Var4, ny8 ny8Var5, wmi wmiVar) {
        this.n = dp5Var;
        this.o = t51Var;
        this.p = zedVar;
        this.q = dp5Var2;
        this.F = ny8Var;
        this.r = dp5Var3;
        this.s = dp5Var4;
        this.t = dp5Var5;
        this.u = dp5Var6;
        this.w = dp5Var7;
        this.x = dp5Var8;
        this.y = dp5Var9;
        this.z = dp5Var10;
        this.A = ny8Var2;
        this.C = ny8Var3;
        this.E = xhhVar;
        this.v = ny8Var4;
        this.B = ny8Var5;
        this.D = wmiVar;
    }

    public static void B(tw2 tw2Var) {
        cx2 cx2Var = tw2Var.o;
        if (cx2Var == null) {
            cx2Var = cx2.h;
        }
        bx2 bx2VarA = cx2Var.a();
        bx2VarA.e = 0L;
        tw2Var.o = new cx2(bx2VarA);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    public static void F(tw2 tw2Var, long j, long j2, int i, long j3, Map map, long j4, int i2, long j5, long j6, String str, String str2, xva xvaVar, long j7, long j8) {
        lx2 lx2Var;
        dx2 dx2Var;
        if (i == 2 || j2 != 0) {
            tw2Var.l = j2;
        }
        if (i == 2 || j != 0) {
            tw2Var.a = j;
        }
        int iD = qt4.D(i);
        if (iD == 1) {
            lx2Var = lx2.a;
        } else if (iD == 2) {
            lx2Var = lx2.b;
        } else if (iD == 3) {
            lx2Var = lx2.c;
        } else if (iD != 4) {
            lx2Var = lx2.b;
        } else {
            lx2Var = lx2.d;
        }
        tw2Var.b = lx2Var;
        if (i == 3) {
            tw2Var.J = Collections.singletonList(Long.valueOf(j3));
            Long lValueOf = Long.valueOf(j3);
            rw2 rw2VarA = sw2.a();
            rw2VarA.c(j3);
            rw2VarA.e(4095);
            tw2Var.d(Collections.singletonMap(lValueOf, rw2VarA.a()));
        }
        if (i2 != 0) {
            tw2Var.w0 = qt4.D(i2) == 1 ? 1 : 2;
        } else {
            tw2Var.w0 = 2;
        }
        tw2Var.c = kx2.h;
        tw2Var.d = j3;
        tw2Var.H = map.size();
        tw2Var.c().putAll(map);
        tw2Var.k = j4;
        tw2Var.n0 = j5;
        tw2Var.p0 = j6;
        tw2Var.g = str;
        tw2Var.h = str2;
        if (xvaVar != null) {
            long[] jArr = (long[]) xvaVar.b;
            if (jArr.length > 0) {
                dx2Var = new dx2(jArr);
            } else {
                dx2Var = null;
            }
        } else {
            dx2Var = null;
        }
        tw2Var.E = dx2Var;
        tw2Var.s0 = j7;
        tw2Var.u0 = j8;
    }

    public static /* synthetic */ String p(String str) {
        return c0a.o("syncSelf(", str, "): unlocked");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0068 A[RETURN] */
    public static boolean y(rt2 rt2Var, Set set, boolean z) {
        nx2 nx2Var = rt2Var.b;
        if (nx2Var.b == lx2.c) {
            if (!rt2Var.d0() || rt2Var.G0() || nx2Var.a().e != 0) {
                if (z) {
                    boolean z2 = rt2Var.R() || rt2Var.M();
                    if ((rt2Var.Q() || z2) && rt2Var.W()) {
                        return true;
                    }
                } else if (rt2Var.A0()) {
                    return true;
                }
            }
            return false;
        }
        kx2 kx2Var = nx2Var.c;
        if (z || !rt2Var.e0() || !rt2Var.C0() || rt2Var.B0() || !rt2Var.g0()) {
            if (!rt2Var.e0() || rt2Var.C0() || !rt2Var.W() || nx2Var.a().e != 0) {
                return set.contains(kx2Var);
            }
            return false;
        }
        return true;
    }

    public final void A(long j, long j2, boolean z) {
        Object value;
        gm0.m("qw2", "clearChatInternal: id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        rt2 rt2VarN = N(j);
        if (rt2VarN != null) {
            ((hjc) this.w.get()).b(rt2VarN.b.a);
        }
        f9b f9bVar = (f9b) this.a.computeIfAbsent(Long.valueOf(j), new am(5, new xk1(21)));
        do {
            value = f9bVar.getValue();
        } while (!f9bVar.h(value, null));
        v(j, false, new x50(1 + j2, 7));
        C(j, j2, z, null);
        v(j, false, new x50(j2, 4));
        j3b j3bVar = new j3b(j, 0L, j2, mg5.REGULAR);
        t51 t51Var = this.o;
        t51Var.c(j3bVar);
        t51Var.c(new wo3(Collections.singletonList(Long.valueOf(j)), false));
    }

    public final int C(long j, long j2, boolean z, tw2 tw2Var) {
        tw2 tw2Var2;
        gm0.m("qw2", "clearMessagesInChat id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        qfa qfaVar = (qfa) this.u.get();
        qfaVar.getClass();
        qfaVar.f.c(j, j2, mg5.REGULAR);
        ose oseVar = (ose) qfaVar.b.c();
        oseVar.getClass();
        int iIntValue = ((Number) ch3.G(((toa) oseVar.h()).a, false, true, new x14(2, j, j2))).intValue();
        if (z) {
            if (tw2Var == null) {
                v(j, false, new x50(0L, 5));
            } else {
                tw2Var.y = 0L;
            }
            tw2Var2 = tw2Var;
        } else {
            tw2Var2 = tw2Var;
            G(j, tw2Var2, j2);
        }
        H(j, tw2Var2);
        return iIntValue;
    }

    public final s04 D(q24 q24Var, nx2 nx2Var) {
        ny2 ny2Var = (ny2) this.y.get();
        return new s04(q24Var, (jzb) ny2Var.f.getValue(), (ef3) ny2Var.a.getValue(), this.p.a.t(), nx2Var, new my2(0, ny2Var));
    }

    public final rt2 E() {
        sfa sfaVar;
        sfa sfaVarB;
        mjg mjgVar = this.b;
        if (mjgVar.getValue() != null) {
            return (rt2) mjgVar.getValue();
        }
        if (this.p.a.t() == -1) {
            throw new UserNotFoundException("no user id");
        }
        long jS = S();
        dp5 dp5Var = this.n;
        hre hreVarA = ((n25) dp5Var.get()).a();
        ox2 ox2Var = (ox2) ((j35) hreVarA.e.getValue()).a(new ln3(hreVarA, jS, 1));
        if (ox2Var != null) {
            sfaVar = null;
            ose oseVar = (ose) ((n25) dp5Var.get()).c();
            gga ggaVarG = ((toa) oseVar.h()).g(ox2Var.b.j);
            if (ggaVarG != null) {
                sfaVarB = oseVar.b(ggaVarG);
            }
            this.g.put(Long.valueOf(ox2Var.a), ox2Var);
            rt2 rt2VarU = u(ox2Var, sfaVarB);
            mjgVar.getClass();
            mjgVar.j(sfaVar, rt2VarU);
            return (rt2) mjgVar.getValue();
        }
        Map mapSingletonMap = Collections.singletonMap(Long.valueOf(jS), 0L);
        tw2 tw2Var = new tw2();
        sfaVar = null;
        F(tw2Var, 0L, 0L, 2, jS, mapSingletonMap, 0L, 3, 0L, 0L, "", "", null, 0L, 0L);
        nx2 nx2Var = new nx2(tw2Var);
        ox2Var = new ox2(((n25) dp5Var.get()).a().h(nx2Var), nx2Var);
        sfaVarB = sfaVar;
        this.g.put(Long.valueOf(ox2Var.a), ox2Var);
        rt2 rt2VarU2 = u(ox2Var, sfaVarB);
        mjgVar.getClass();
        mjgVar.j(sfaVar, rt2VarU2);
        return (rt2) mjgVar.getValue();
    }

    public final void G(long j, tw2 tw2Var, long j2) {
        if (j2 == BuildConfig.MAX_TIME_TO_UPLOAD) {
            j2--;
        }
        qfa qfaVar = (qfa) this.u.get();
        qfaVar.getClass();
        sfa sfaVarZ = ((ose) qfaVar.b.c()).z(j, j2 + 1, mg5.REGULAR);
        gm0.m("qw2", "findAndUpdateFirstMessage, chatId = %d, time = %s, message = %s", Long.valueOf(j), vd7.K(Long.valueOf(j2)), sfaVarZ);
        if (tw2Var == null) {
            v(j, false, new x50(sfaVarZ != null ? sfaVarZ.a : 0L, 5));
        } else {
            tw2Var.y = sfaVarZ != null ? sfaVarZ.a : 0L;
        }
    }

    public final rt2 H(long j, tw2 tw2Var) {
        gm0.m("qw2", "findAndUpdateLastMessage: chatId = %d", Long.valueOf(j));
        qfa qfaVar = (qfa) this.u.get();
        qfaVar.getClass();
        return g0(j, qfaVar.k(j, mg5.REGULAR), true, tw2Var);
    }

    public final void I(long j) {
        gm0.m("qw2", "findAndUpdateLastMessage: chatId = %d", Long.valueOf(j));
        H(j, null);
    }

    public final ArrayList J(final kn3 kn3Var) {
        return O(K, false, new fdd() { // from class: xv2
            @Override // defpackage.fdd
            public final boolean test(Object obj) {
                rt2 rt2Var = (rt2) obj;
                if (rt2Var.y0()) {
                    return rt2Var.b.k > 0;
                }
                fdd fddVar = kn3Var;
                return fddVar == null || fddVar.test(rt2Var);
            }
        });
    }

    public final rt2 K(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.j;
        rt2 rt2Var = (rt2) concurrentHashMap.get(lValueOf);
        if (rt2Var != null) {
            return rt2Var;
        }
        t();
        return (rt2) concurrentHashMap.get(Long.valueOf(j));
    }

    public final ox2 L(long j) {
        ox2 ox2Var = (ox2) this.g.get(Long.valueOf(j));
        return (ox2Var != null || this.l) ? ox2Var : a0(j);
    }

    public final ox2 M(long j) {
        ox2 ox2Var = (ox2) this.h.get(Long.valueOf(j));
        if (ox2Var != null || this.l) {
            return ox2Var;
        }
        hre hreVarA = ((n25) this.n.get()).a();
        ph3 ph3Var = (ph3) hreVarA.e();
        jy2 jy2Var = (jy2) ch3.G(ph3Var.a, true, false, new lh3(j, ph3Var, 0));
        if (jy2Var != null) {
            return hreVarA.a(jy2Var);
        }
        return null;
    }

    public final rt2 N(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.i;
        rt2 rt2Var = (rt2) concurrentHashMap.get(lValueOf);
        if (rt2Var != null) {
            return z(rt2Var);
        }
        t();
        return z((rt2) concurrentHashMap.get(Long.valueOf(j)));
    }

    public final ArrayList O(Set set, boolean z, fdd fddVar) {
        boolean zTest;
        t();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.i.entrySet().iterator();
        while (it.hasNext()) {
            rt2 rt2Var = (rt2) ((Map.Entry) it.next()).getValue();
            if (fddVar != null) {
                try {
                    zTest = fddVar.test(rt2Var);
                } catch (Exception e) {
                    gm0.V("qw2", "getChats, can't pass predicate because exception", e);
                    zTest = true;
                }
            } else {
                zTest = true;
            }
            if (zTest) {
                this.p.b.a();
                if (y(rt2Var, set, z)) {
                    arrayList.add(rt2Var);
                }
            }
        }
        return arrayList;
    }

    public final List P(Comparator comparator) {
        ArrayList arrayListJ = J(null);
        Collections.sort(arrayListJ, comparator);
        return Collections.unmodifiableList(arrayListJ);
    }

    public final rt2 Q(long j) {
        return (rt2) this.f.get(Long.valueOf(j ^ S()));
    }

    public final mjg R() {
        mjg mjgVar = this.b;
        if (mjgVar.getValue() == null) {
            qv1.u("saved message chat is null!", "qw2", "saved message chat is null!");
        }
        return mjgVar;
    }

    public final long S() {
        return this.p.a.t();
    }

    public final sfa T(long j, gda gdaVar, Long l) {
        zed zedVar;
        long j2;
        gm0.n("qw2", "insertMessageIfNeeded");
        if (gdaVar == null) {
            gm0.n("qw2", "insertMessageIfNeeded, message is null");
            return null;
        }
        long j3 = gdaVar.f;
        dp5 dp5Var = this.u;
        sfa sfaVarF = ((qfa) dp5Var.get()).f(j, gdaVar.a);
        zed zedVar2 = this.p;
        if (sfaVarF == null || sfaVarF.h == j) {
            zedVar = zedVar2;
        } else {
            zedVar2.a.E(true);
            zedVar = zedVar2;
            gm0.V("qw2", "insertMessageIfNeeded 1", new ChatException.WrongMessage(gdaVar.a, sfaVarF.h, j));
        }
        if (sfaVarF != null) {
            return sfaVarF;
        }
        if (j3 != 0) {
            ose oseVar = (ose) ((qfa) dp5Var.get()).b.c();
            toa toaVar = (toa) oseVar.h();
            j2 = j3;
            gga ggaVar = (gga) ch3.G(toaVar.a, true, false, new koa(j, j3, toaVar, 0));
            sfa sfaVarB = ggaVar != null ? oseVar.b(ggaVar) : null;
            if (sfaVarB != null && sfaVarB.h != j) {
                zedVar.a.E(true);
                gm0.V("qw2", "insertMessageIfNeeded 2", new ChatException.WrongMessage(gdaVar.a, sfaVarB.h, j));
            }
            if (sfaVarB != null && sfaVarB.b == 0) {
                gm0.m("qw2", "last message for chat %d founded by cid %d. Update it", Long.valueOf(j), Long.valueOf(j2));
                uoa uoaVarC = ((n25) this.n.get()).c();
                List list = xfa.b;
                long jT = zedVar.a.t();
                ose oseVar2 = (ose) uoaVarC;
                oseVar2.getClass();
                oseVar2.D(gdaVar, j, false, null, jT, dnl.a(l));
                ((qfa) dp5Var.get()).o(sfaVarB, pm9.e(gdaVar.h, (m7f) this.s.get()));
                return ((qfa) dp5Var.get()).l(sfaVarB.a);
            }
        } else {
            j2 = j3;
        }
        gm0.m("qw2", "insertMessageIfNeeded: insert message, cid = %d, chatId = %d, messageTime = %d", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0125: INVOKE 
              ("qw2")
              ("insertMessageIfNeeded: insert message, cid = %d, chatId = %d, messageTime = %d")
              (wrap java.lang.Object[]:0x011f: FILLED_NEW_ARRAY 
              (wrap java.lang.Long:0x0111: INVOKE (r19v1 'j2' long) STATIC call: java.lang.Long.valueOf(long):java.lang.Long A[MD:(long):java.lang.Long (c), WRAPPED])
              (wrap java.lang.Long:0x0115: INVOKE (r24v0 'j' long) STATIC call: java.lang.Long.valueOf(long):java.lang.Long A[MD:(long):java.lang.Long (c), WRAPPED])
              (wrap java.lang.Long:0x011b: INVOKE (wrap long:0x0119: IGET (r8v0 ?? I:??[OBJECT, ARRAY]) A[WRAPPED] gda.b long) STATIC call: java.lang.Long.valueOf(long):java.lang.Long A[MD:(long):java.lang.Long (c), WRAPPED])
             A[WRAPPED] elemType: java.lang.Object)
             STATIC call: gm0.m(java.lang.String, java.lang.String, java.lang.Object[]):void A[MD:(java.lang.String, java.lang.String, java.lang.Object[]):void VARARG (m), VARARG_CALL] in method: qw2.T(long, gda, java.lang.Long):sfa, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw2.T(long, gda, java.lang.Long):sfa");
    }

    public final void U() {
        this.i.clear();
        this.f.clear();
        this.j.clear();
        this.g.clear();
        this.e.clear();
        this.h.clear();
        this.k.clear();
        this.b.setValue(null);
    }

    public final boolean V(rt2 rt2Var) {
        rt2 rt2Var2;
        if (rt2Var == null || (rt2Var2 = (rt2) R().getValue()) == null) {
            return false;
        }
        return rt2Var == rt2Var2 || rt2Var.a == rt2Var2.a;
    }

    public final void W(long j, long j2) {
        rt2 rt2VarN = N(j);
        if (rt2VarN != null) {
            x(rt2VarN, j2, true);
            ((pvb) this.r.get()).o(rt2VarN.a);
        }
    }

    public final void X(long j, rt2 rt2Var) {
        if (rt2Var instanceof s04) {
            gm0.r("qw2", "comments chat cannot be stored", new pw2((s04) rt2Var));
            ore.p("comments chat cannot be stored");
            return;
        }
        Long lValueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.i;
        boolean zContainsKey = concurrentHashMap.containsKey(lValueOf);
        concurrentHashMap.put(Long.valueOf(j), rt2Var);
        boolean zY0 = rt2Var.y0();
        nx2 nx2Var = rt2Var.b;
        if (!zY0) {
            this.f.put(Long.valueOf(nx2Var.l), rt2Var);
        }
        if (zY0 || nx2Var.a != 0) {
            this.j.put(Long.valueOf(nx2Var.a), rt2Var);
        }
        boolean zR = ch3.r(nx2Var.J);
        ConcurrentHashMap concurrentHashMap2 = this.k;
        if (zR) {
            concurrentHashMap2.remove(Long.valueOf(j));
        } else {
            concurrentHashMap2.put(Long.valueOf(j), rt2Var);
        }
        if (zContainsKey) {
            gm0.m("qw2", "putChat: send update event, chatId=%d", Long.valueOf(j));
            this.o.c(new wo3((Collection) Collections.singletonList(Long.valueOf(j)), false, false, mg5.REGULAR, (yq0) null, true, (Set) c76.a));
            List listSingletonList = Collections.singletonList(rt2Var);
            ow2 ow2Var = this.G;
            if (ow2Var != null) {
                ow2Var.a(listSingletonList);
            }
        }
    }

    public final void Y(long j, ox2 ox2Var) {
        this.g.put(Long.valueOf(j), ox2Var);
        nx2 nx2Var = ox2Var.b;
        long j2 = nx2Var.a;
        if (j2 != 0 || nx2Var.e(this.p.a.t())) {
            this.h.put(Long.valueOf(j2), ox2Var);
        }
        this.e.put(Long.valueOf(ox2Var.b.l), ox2Var);
    }

    public final void Z(long j, uw2 uw2Var) {
        rt2 rt2VarN = N(j);
        if (rt2VarN == null || !rt2VarN.b.C.contains(uw2Var)) {
            return;
        }
        v(j, false, new yv2(uw2Var, 1));
    }

    public final ox2 a0(long j) {
        hre hreVarA = ((n25) this.n.get()).a();
        ph3 ph3Var = (ph3) hreVarA.e();
        jy2 jy2Var = (jy2) ch3.G(ph3Var.a, true, false, new hh3(j, ph3Var, 3));
        if (jy2Var != null) {
            return hreVarA.a(jy2Var);
        }
        return null;
    }

    public final void b0(long j, long j2, boolean z) {
        v(j, false, new x50(j2, 8));
        if (z) {
            ((pvb) this.r.get()).o(j);
        }
        this.o.c(new wo3(Collections.singletonList(Long.valueOf(j)), true));
    }

    public final m8b c0(List list) {
        return j(list, null, true, false);
    }

    public final Object d0(String str, rah rahVar) {
        a4c a4cVar;
        je9 je9Var = je9.d;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "qw2", qv1.g(')', "syncSelf(", str), null);
        }
        if (this.H.isLocked() && (a4cVar = gm0.f) != null) {
            je9 je9Var2 = je9.f;
            if (a4cVar.b(je9Var2)) {
                StringBuilder sbV = qt4.v("syncSelf(", str, "): self is locked! ");
                sbV.append(this.H.getHoldCount());
                a4cVar.c(je9Var2, "qw2", sbV.toString(), null);
            }
        }
        this.H.lock();
        try {
            Object obj = rahVar.get();
            this.H.unlock();
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 == null || !a4cVar3.b(je9Var)) {
                return obj;
            }
            a4cVar3.c(je9Var, "qw2", p(str), null);
            return obj;
        } catch (Throwable th) {
            this.H.unlock();
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, "qw2", p(str), null);
            }
            throw th;
        }
    }

    public final rt2 e0(long j, boolean z) {
        sfa sfaVarL;
        rt2 rt2VarN = N(j);
        if (rt2VarN != null) {
            long j2 = rt2VarN.a;
            if (j2 != j) {
                gm0.V("qw2", "updateChatCache fail", new ChatException.InvalidLocalId(j, j2));
            }
        }
        ox2 ox2VarL = L(j);
        if (ox2VarL != null && ox2VarL.a != j) {
            gm0.V("qw2", "updateChatCache fail", new ChatException.InvalidLocalId(j, rt2VarN.a));
        }
        if (ox2VarL == null) {
            throw new ChatNotFoundException(zo5.j(j, "chat is null for #"));
        }
        nx2 nx2Var = ox2VarL.b;
        rt2 rt2VarA = null;
        if (rt2VarN == null || z) {
            return u(ox2VarL, null);
        }
        long j3 = nx2Var.j;
        nx2 nx2Var2 = rt2VarN.b;
        boolean z2 = j3 == nx2Var2.j;
        boolean z3 = nx2Var.M == nx2Var2.M;
        boolean z4 = nx2Var.h0 == nx2Var2.h0;
        if (!z2 || !z3 || !z4) {
            return u(ox2VarL, null);
        }
        fda fdaVar = rt2VarN.c;
        boolean zA0 = rt2VarN.a0();
        dp5 dp5Var = this.y;
        if (zA0 && fdaVar == null && (sfaVarL = ((qfa) this.u.get()).l(nx2Var.j)) != null) {
            rt2VarA = ((ny2) dp5Var.get()).b(ox2VarL, sfaVarL);
        }
        if (rt2VarA == null) {
            rt2VarA = ((ny2) dp5Var.get()).a(j, this.p.a.t(), ox2VarL.b, fdaVar, rt2VarN.d, rt2VarN.e, new cw2(0, this));
        }
        X(j, rt2VarA);
        return rt2VarA;
    }

    public final void f0(long j, nx2 nx2Var, long j2) {
        gm0.m("qw2", "updateChatWriteTime: chatId=%d, chatWriteTime=%d", Long.valueOf(j), Long.valueOf(j2));
        if (nx2Var == null || nx2Var.b0 >= j2) {
            return;
        }
        v(j, false, new x50(j2, 9));
    }

    public final rt2 g0(long j, sfa sfaVar, boolean z, tw2 tw2Var) {
        if (sfaVar != null && sfaVar.D()) {
            return N(j);
        }
        if (sfaVar != null) {
            long j2 = sfaVar.h;
            if (j2 != j) {
                this.p.a.E(true);
                StringBuilder sb = new StringBuilder("updateLastMessage: invalid chatId=");
                sb.append(j);
                gm0.V("qw2", qt4.k(j2, " messageDb.chatId=", sb), new ChatException.WrongLastMessage(j, sfaVar));
                return N(j);
            }
        }
        gm0.n("qw2", "updateLastMessage: chatId = " + j + ", messageDb = " + sfaVar + ", force = " + z);
        if (tw2Var == null) {
            return v(j, true, new dw2(this, sfaVar, z, j));
        }
        h0(sfaVar, z, tw2Var);
        return N(j);
    }

    public final void h0(sfa sfaVar, boolean z, tw2 tw2Var) {
        if (sfaVar == null) {
            tw2Var.j = 0L;
            return;
        }
        sfa sfaVarL = !z ? ((qfa) this.u.get()).l(tw2Var.j) : null;
        if (z || sfaVarL == null || sfaVar.c > sfaVarL.c) {
            tw2Var.e(sfaVar);
        }
    }

    public final void i0(long j, final long j2, final long j3, final String str) {
        gm0.m("qw2", "updateLastPushMessage %d", Long.valueOf(j));
        rt2 rt2VarK = K(j);
        if (rt2VarK == null) {
            gm0.W("qw2", "updateLastPushMessage: chat not found! %d", Long.valueOf(j));
            return;
        }
        long j4 = rt2VarK.a;
        v(j4, true, new tg4() { // from class: lw2
            @Override // defpackage.tg4
            public final void accept(Object obj) {
                tw2 tw2Var = (tw2) obj;
                tw2Var.getClass();
                tw2Var.k0 = new hx2(str, j3, j2);
            }
        });
        this.o.c(new wo3(Collections.singletonList(Long.valueOf(j4)), true));
    }

    public final void j0(int i, long j) {
        gm0.n("qw2", zo5.g(i, j, "updateNewMessages, chatId = ", ", count = "));
        v(j, false, new iw2(this, i, 0));
        this.o.c(new wo3(Collections.singletonList(Long.valueOf(j)), false));
    }

    public final void k0(long j) {
        gm0.m("qw2", "updatePinMessage: chatId = %d", Long.valueOf(j));
        e0(j, true);
    }

    public final rt2 q(lx2 lx2Var, List list, String str, String str2) {
        ox2 ox2Var;
        ox2 ox2Var2;
        a4c a4cVar;
        je9 je9Var = je9.d;
        if (lx2Var == lx2.a) {
            Long l = (Long) list.get(0);
            long jLongValue = l.longValue();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "qw2", zo5.j(jLongValue, "insertDialog contactId="), null);
            }
            long jS = S();
            long jS2 = S() ^ jLongValue;
            mw mwVar = new mw(2);
            mwVar.put(Long.valueOf(jS), 0L);
            mwVar.put(l, 0L);
            tw2 tw2Var = new tw2();
            F(tw2Var, jS2, jS2, 2, jS, mwVar, 0L, 3, 0L, 0L, "", "", null, 0L, 0L);
            nx2 nx2Var = new nx2(tw2Var);
            rt2 rt2VarQ = Q(jLongValue);
            dp5 dp5Var = this.n;
            if (rt2VarQ != null) {
                ((n25) dp5Var.get()).a().l(rt2VarQ.a, nx2Var);
                ox2Var2 = new ox2(rt2VarQ.a, rt2VarQ.b);
            } else {
                ox2Var = new ox2(((n25) dp5Var.get()).a().h(nx2Var), nx2Var);
            }
            a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "qw2", "add chat; chatId=" + ox2Var2.a + ",type=" + lx2Var, null);
            }
            Y(ox2Var2.a, ox2Var2);
            return e0(ox2Var2.a, false);
        }
        long jS3 = S();
        long jNanoTime = System.nanoTime();
        mw mwVarA = rpk.a(list);
        mwVarA.put(Long.valueOf(jS3), 0L);
        tw2 tw2Var2 = new tw2();
        F(tw2Var2, 0L, jNanoTime, 3, jS3, mwVarA, 0L, 3, 0L, 0L, str, str2, null, 0L, 0L);
        nx2 nx2Var2 = new nx2(tw2Var2);
        ox2Var = new ox2(((n25) this.n.get()).a().h(nx2Var2), nx2Var2);
        ox2Var2 = ox2Var;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            a4cVar.c(je9Var, "qw2", "add chat; chatId=" + ox2Var2.a + ",type=" + lx2Var, null);
        }
        Y(ox2Var2.a, ox2Var2);
        return e0(ox2Var2.a, false);
    }

    public final void r(long j, uw2 uw2Var) {
        rt2 rt2VarN = N(j);
        if (rt2VarN == null || !rt2VarN.b.C.contains(uw2Var)) {
            v(j, false, new yv2(uw2Var, 0));
        }
    }

    public final void s(long j, List list) {
        rt2 rt2VarN = N(j);
        if (rt2VarN != null) {
            v(j, false, new zv2(0, list));
            this.o.c(new wo3(Collections.singletonList(Long.valueOf(rt2VarN.a)), false));
        }
    }

    public final void t() {
        if (this.l) {
            return;
        }
        d0("awaitLoading", new gve(new e6(8, this)));
    }

    public final rt2 u(ox2 ox2Var, sfa sfaVar) {
        rt2 rt2VarB = ((ny2) this.y.get()).b(ox2Var, sfaVar);
        X(ox2Var.a, rt2VarB);
        return rt2VarB;
    }

    public final rt2 v(long j, boolean z, tg4 tg4Var) {
        if (L(j) == null) {
            t();
        }
        ox2 ox2VarL = L(j);
        if (ox2VarL == null) {
            gm0.n("qw2", "changeChatField: chat with id = " + j + " not found");
            return null;
        }
        tw2 tw2VarH = ox2VarL.b.h();
        try {
            tg4Var.accept(tw2VarH);
            Y(j, new ox2(j, new nx2(tw2VarH)));
            yab.i0(this.D, null, 0, new i20(this, j, (lq4) null, 7), 3);
            return e0(j, z);
        } catch (Throwable th) {
            qr7.o(th);
            return null;
        }
    }

    public final rt2 w(long j, kx2 kx2Var) {
        return v(j, false, new aw2(kx2Var));
    }

    public final void x(rt2 rt2Var, long j, boolean z) {
        StringBuilder sb = new StringBuilder("changeMuteUntil, chatId = ");
        long j2 = rt2Var.a;
        sb.append(j2);
        sb.append(", dontDisturbUntil = ");
        sb.append(j);
        gm0.n("qw2", sb.toString());
        v(j2, false, new x50(j, 3));
        if (z) {
            this.o.c(new wo3(Collections.singletonList(Long.valueOf(j2)), false));
        }
    }

    public final rt2 z(rt2 rt2Var) {
        if (rt2Var == null) {
            return null;
        }
        nx2 nx2Var = rt2Var.b;
        if (rt2Var.c == null && nx2Var.j != 0) {
            ox2 ox2VarA0 = a0(rt2Var.a);
            sfa sfaVarL = ((qfa) this.u.get()).l(nx2Var.j);
            if (sfaVarL != null) {
                gm0.W("qw2", "checkChat! lastMessage is null but chat.data.getLastMessageId() not 0", new Object[0]);
                ((t1c) ((ed6) this.q.get())).a(new IllegalStateException("check.chat.error"));
                Y(ox2VarA0.a, ox2VarA0);
                return u(ox2VarA0, sfaVarL);
            }
        }
        return rt2Var;
    }
}
