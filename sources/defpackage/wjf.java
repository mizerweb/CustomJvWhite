package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class wjf extends pdh {
    public static final ConcurrentHashMap j = new ConcurrentHashMap();
    public final long d;
    public final long e;
    public long f;
    public final CopyOnWriteArrayList g;
    public final ylc h;
    public final String i;

    public wjf(long j2, long j3, m8b m8bVar, long j4) {
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = new CopyOnWriteArrayList(rx8.l0(m8bVar));
        this.h = new ylc(Long.valueOf(j2), Long.valueOf(j3));
        StringBuilder sb = new StringBuilder("TYPE_CHAT_MARK_BATCH(#");
        sb.append(j2);
        sb.append('/');
        sb.append(j3);
        sb.append('/');
        this.i = qt4.p(sb, m8bVar.d, ')');
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:121:0x0234  */
    /* JADX WARN: Code duplicated, block: B:132:0x025a  */
    /* JADX WARN: Code duplicated, block: B:134:0x025e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0265  */
    /* JADX WARN: Code duplicated, block: B:141:0x0278  */
    /* JADX WARN: Code duplicated, block: B:143:0x0286  */
    /* JADX WARN: Code duplicated, block: B:146:0x028d  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:155:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f2 A[Catch: all -> 0x0334, TamErrorException -> 0x0339, TRY_ENTER, TryCatch #5 {TamErrorException -> 0x0339, all -> 0x0334, blocks: (B:173:0x0354, B:179:0x038b, B:183:0x03a2, B:160:0x02f2, B:170:0x033e, B:163:0x02fb, B:165:0x0301, B:186:0x03ac, B:188:0x03b2, B:182:0x0398, B:176:0x035f, B:178:0x0365), top: B:221:0x0354 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02fb A[Catch: all -> 0x0334, TamErrorException -> 0x0339, TryCatch #5 {TamErrorException -> 0x0339, all -> 0x0334, blocks: (B:173:0x0354, B:179:0x038b, B:183:0x03a2, B:160:0x02f2, B:170:0x033e, B:163:0x02fb, B:165:0x0301, B:186:0x03ac, B:188:0x03b2, B:182:0x0398, B:176:0x035f, B:178:0x0365), top: B:221:0x0354 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:70:0x0174  */
    /* JADX WARN: Code duplicated, block: B:79:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:88:0x01af  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [a4c] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v4, types: [a4c] */
    /* JADX WARN: Type inference failed for: r12v6, types: [a4c] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Throwable, lq4] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v26, types: [njf] */
    /* JADX WARN: Type inference failed for: r1v30, types: [njf] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Long, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [a4c] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43, types: [a4c] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Long, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Long, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [a4c] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.concurrent.ConcurrentHashMap] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x02ed -> B:159:0x02ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x0351 -> B:221:0x0354). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object E(defpackage.wjf r23, defpackage.gu4 r24, defpackage.nq4 r25) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjf.E(wjf, gu4, nq4):java.lang.Object");
    }

    @Override // defpackage.mjf
    public final void A() {
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        this.f = ((s7f) njfVar.c()).f();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            D(((Number) it.next()).longValue());
        }
    }

    @Override // defpackage.pdh
    public final Object C(gu4 gu4Var, lq4 lq4Var) {
        return E(this, gu4Var, (nq4) lq4Var);
    }

    public final void D(long j2) {
        j.compute(Long.valueOf(j2), new mw1(16, new s81(17, this)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Comparable F(rt2 rt2Var, fda fdaVar, nq4 nq4Var) {
        ujf ujfVar;
        long j2;
        if (nq4Var instanceof ujf) {
            ujfVar = (ujf) nq4Var;
            int i = ujfVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujfVar.g = i - Integer.MIN_VALUE;
            } else {
                ujfVar = new ujf(this, nq4Var);
            }
        } else {
            ujfVar = new ujf(this, nq4Var);
        }
        Object obj = ujfVar.e;
        int i2 = ujfVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            long jC = g1b.c();
            k13 k13Var = new k13(b().u().a.g(), rt2Var.A(), fdaVar.getC(), fdaVar.a.b, false, false, false);
            ujfVar.d = jC;
            ujfVar.g = 1;
            njf njfVar = this.a;
            Object objF = ((sih) (njfVar != null ? njfVar : null).j.getValue()).f(k13Var, ujfVar);
            hu4 hu4Var = hu4.a;
            if (objF != hu4Var) {
                objF = sbi.a;
            }
            if (objF == hu4Var) {
                return hu4Var;
            }
            j2 = jC;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = ujfVar.d;
            ch3.d0(obj);
        }
        return new ew5(ish.a(j2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(nq4 nq4Var) {
        vjf vjfVar;
        if (nq4Var instanceof vjf) {
            vjfVar = (vjf) nq4Var;
            int i = vjfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vjfVar.f = i - Integer.MIN_VALUE;
            } else {
                vjfVar = new vjf(this, nq4Var);
            }
        } else {
            vjfVar = new vjf(this, nq4Var);
        }
        Object objN = vjfVar.d;
        int i2 = vjfVar.f;
        if (i2 == 0) {
            ch3.d0(objN);
            njf njfVar = this.a;
            if (njfVar == null) {
                njfVar = null;
            }
            r8e r8eVar = ((jg9) njfVar.k.getValue()).I;
            ghb ghbVar = ew5.b;
            j3 j3VarX = tre.X(r8eVar, ew5.g(qe7.O(5, lw5.SECONDS)), new nb4(2, null, 1));
            vjfVar.f = 1;
            objN = e9i.N(j3VarX, vjfVar);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        return ((roe) objN).a;
    }

    @Override // defpackage.btc
    public final void d() {
        u().d(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjf)) {
            return false;
        }
        wjf wjfVar = (wjf) obj;
        return this.e == wjfVar.e && cqk.d(this.g, wjfVar.g);
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChatMarkBatch chatMarkBatch = new Tasks.ChatMarkBatch();
        chatMarkBatch.taskId = this.d;
        chatMarkBatch.maxMark = this.e;
        chatMarkBatch.chatIds = ww3.U1(this.g);
        chatMarkBatch.lastFailTime = this.f;
        return sia.toByteArray(chatMarkBatch);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.d;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_MARK_BATCH;
    }

    public final int hashCode() {
        return this.g.hashCode() + qt4.g(wjf.class.hashCode() * 31, 31, this.e);
    }

    @Override // defpackage.pdh, defpackage.btc
    public final atc j() {
        atc atcVar = atc.b;
        atc atcVar2 = atc.c;
        atc atcVarJ = super.j();
        atc atcVar3 = atc.a;
        if (atcVarJ != atcVar3) {
            return atcVarJ;
        }
        if (this.g.isEmpty()) {
            String str = this.i;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "empty chats: remove", null);
                    return atcVar2;
                }
            }
        } else {
            njf njfVar = this.a;
            if (njfVar == null) {
                njfVar = null;
            }
            if (njfVar.a().b()) {
                njf njfVar2 = this.a;
                if (njfVar2 == null) {
                    njfVar2 = null;
                }
                if (njfVar2.e().d()) {
                    ghb ghbVar = ew5.b;
                    njf njfVar3 = this.a;
                    if (njfVar3 == null) {
                        njfVar3 = null;
                    }
                    long jF = ((s7f) njfVar3.c()).f();
                    lw5 lw5Var = lw5.MILLISECONDS;
                    long jP = qe7.P(jF, lw5Var);
                    njf njfVar4 = this.a;
                    if (njfVar4 == null) {
                        njfVar4 = null;
                    }
                    long jO = qe7.O(((Number) ((g5d) ((gjf) njfVar4.f.getValue())).a.r4.a(e5d.S6[279]).i()).intValue(), lw5.SECONDS);
                    long jO2 = ew5.o(jP, qe7.P(this.f, lw5Var));
                    if (ew5.d(jO2, jO) >= 0) {
                        return atcVar3;
                    }
                    String str2 = this.i;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, qv1.l("skip task! timeout after fail is too small: diff=", ew5.t(jO2), ", chat-history-warm-fail-interval=", ew5.t(jO)), null);
                        }
                    }
                }
                return atcVar;
            }
        }
        return atcVar2;
    }

    @Override // defpackage.btc
    public final int l() {
        return 5;
    }

    public final String toString() {
        StringBuilder sbC = nbh.C("TYPE_CHAT_MARK_BATCH(#");
        sbC.append(this.d);
        sbC.append(",ids=[");
        ww3.y1(this.g, sbC, null, null, 126);
        sbC.append(']');
        sbC.append(')');
        return sbC.toString();
    }
}
