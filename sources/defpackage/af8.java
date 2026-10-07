package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import one.me.devmenu.logsviewer.IntegrityLogsViewerScreen;
import one.me.messages.list.loader.MessageModel;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class af8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af8(qj9 qj9Var, List list, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 11;
        this.g = qj9Var;
        this.h = list;
        this.f = i;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x022f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0234  */
    /* JADX WARN: Code duplicated, block: B:117:0x023e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0250  */
    /* JADX WARN: Code duplicated, block: B:123:0x0277  */
    /* JADX WARN: Code duplicated, block: B:125:0x027c  */
    /* JADX WARN: Code duplicated, block: B:127:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:139:0x0319  */
    /* JADX WARN: Code duplicated, block: B:141:0x031d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0325  */
    /* JADX WARN: Code duplicated, block: B:146:0x032c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0334  */
    /* JADX WARN: Code duplicated, block: B:150:0x0345  */
    /* JADX WARN: Code duplicated, block: B:152:0x034b  */
    /* JADX WARN: Code duplicated, block: B:154:0x034f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0357  */
    /* JADX WARN: Code duplicated, block: B:159:0x035e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0362  */
    /* JADX WARN: Code duplicated, block: B:171:0x039f  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:190:0x0407  */
    /* JADX WARN: Code duplicated, block: B:192:0x040b  */
    /* JADX WARN: Code duplicated, block: B:203:0x042f  */
    /* JADX WARN: Code duplicated, block: B:209:0x044a  */
    /* JADX WARN: Code duplicated, block: B:230:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:232:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:235:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:237:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:239:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:242:0x04df  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:246:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:249:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:251:0x0503  */
    /* JADX WARN: Code duplicated, block: B:253:0x051f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:255:0x0521  */
    /* JADX WARN: Code duplicated, block: B:258:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[LOOP:0: B:184:0x03ec->B:259:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:? A[LOOP:1: B:201:0x0429->B:262:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02de, code lost:
    
        if (r0 == r9) goto L253;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0277, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object l(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af8.l(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj) {
        jsa jsaVar = (jsa) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            rt2 rt2Var = (rt2) jsaVar.w2.a.getValue();
            boolean z = false;
            if (rt2Var != null && rt2Var.d0()) {
                z = true;
            }
            Set set = (Set) this.h;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                MessageModel messageModel = (MessageModel) obj2;
                if (jsaVar.q0()) {
                    if (messageModel.b != 0) {
                        if (!z) {
                            fia fiaVar = messageModel.n;
                            if (!((fiaVar != null ? fiaVar.e : null) instanceof uha)) {
                            }
                        }
                        arrayList.add(obj2);
                    }
                } else if (messageModel.b != 0) {
                    arrayList.add(obj2);
                }
            }
            oka okaVar = (oka) jsaVar.L2.getValue();
            this.f = 1;
            Object objA = okaVar.a(arrayList, this);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    private final Object o(Object obj) {
        Object poeVar;
        fda fdaVar;
        long j;
        String str;
        a4c a4cVar;
        je9 je9Var;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                rt2 rt2Var = (rt2) ((fva) this.h).d.getValue();
                if (rt2Var != null && rt2Var.U()) {
                    fdaVar = rt2Var.d;
                    if (fdaVar == null) {
                        fva fvaVar = (fva) this.h;
                        ghb ghbVar = ew5.b;
                        long jO = qe7.O(2, lw5.SECONDS);
                        af8 af8Var = new af8(fvaVar, rt2Var, (lq4) null, 27);
                        this.g = null;
                        this.f = 1;
                        obj = lvb.M0(jO, af8Var, this);
                        if (obj == hu4Var) {
                        }
                    } else {
                        if (fdaVar == null) {
                            gm0.Y(((fva) this.h).l, "onMentionScrollButtonClicked but lastMentionedMessage is null");
                            return sbiVar;
                        }
                        j = fdaVar.a.a;
                        str = ((fva) this.h).l;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, zo5.j(j, "Scrolling to last mention with id="), null);
                            }
                        }
                        fva fvaVar2 = (fva) this.h;
                        i5f i5fVar = i5f.c;
                        this.g = null;
                        this.f = 2;
                        if (fva.d(fvaVar2, j, i5fVar, false, this, 4) == hu4Var) {
                        }
                    }
                }
            }
            if (i != 1) {
                if (i == 2) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            poeVar = (fda) obj;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        fva fvaVar3 = (fva) this.h;
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(fvaVar3.l, "onMentionScrollButtonClicked: sync remote message fail", thA);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        fdaVar = (fda) poeVar;
        if (fdaVar == null) {
            gm0.Y(((fva) this.h).l, "onMentionScrollButtonClicked but lastMentionedMessage is null");
            return sbiVar;
        }
        j = fdaVar.a.a;
        str = ((fva) this.h).l;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "Scrolling to last mention with id="), null);
            }
        }
        fva fvaVar4 = (fva) this.h;
        i5f i5fVar2 = i5f.c;
        this.g = null;
        this.f = 2;
        return fva.d(fvaVar4, j, i5fVar2, false, this, 4) == hu4Var ? hu4Var : sbiVar;
    }

    private final Object p(Object obj) {
        rt2 rt2Var = (rt2) this.h;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        dfh dfhVar = (dfh) ((fva) this.g).o.getValue();
        long jA = rt2Var.A();
        long j = rt2Var.b.h0;
        this.f = 1;
        Object objA = dfhVar.a(jA, j, this);
        hu4 hu4Var = hu4.a;
        return objA == hu4Var ? hu4Var : objA;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new af8((bf8) this.g, (String) obj2, lq4Var, 0);
            case 1:
                return new af8((we9) this.g, (IntegrityLogsViewerScreen) obj2, lq4Var, 1);
            case 2:
                af8 af8Var = new af8((js8) obj2, lq4Var, 2);
                af8Var.g = obj;
                return af8Var;
            case 3:
                af8 af8Var2 = new af8((i09) obj2, lq4Var, 3);
                af8Var2.g = obj;
                return af8Var2;
            case 4:
                return new af8(this.g, obj2, lq4Var, 4);
            case 5:
                return new af8((p29) this.g, (o29) obj2, lq4Var, 5);
            case 6:
                return new af8((p29) this.g, (yq0) obj2, lq4Var, 6);
            case 7:
                af8 af8Var3 = new af8((l49) obj2, lq4Var, 7);
                af8Var3.g = obj;
                return af8Var3;
            case 8:
                af8 af8Var4 = new af8((sc9) obj2, lq4Var, 8);
                af8Var4.g = obj;
                return af8Var4;
            case 9:
                return new af8((kf9) this.g, (nf9) obj2, lq4Var, 9);
            case 10:
                return new af8((ai9) this.g, (CharSequence) obj2, lq4Var, 10);
            case 11:
                return new af8((qj9) this.g, (List) obj2, this.f, lq4Var);
            case 12:
                return new af8((as9) this.g, (Long) obj2, lq4Var, 12);
            case 13:
                return new af8((q1a) obj2, lq4Var, 13);
            case 14:
                return new af8((z8a) this.g, (so4) obj2, lq4Var, 14);
            case 15:
                return new af8(this.g, lq4Var, (v9a) obj2, 15);
            case 16:
                return new af8((r00) this.g, (String) obj2, lq4Var, 16);
            case 17:
                return new af8(this.g, lq4Var, (qyc) obj2, 17);
            case 18:
                return new af8(this.g, lq4Var, (r00) obj2, 18);
            case 19:
                return new af8((bpa) this.g, (tga) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new af8((apa) this.g, (sga) obj2, lq4Var, 20);
            case 21:
                af8 af8Var5 = new af8((nr2) obj2, lq4Var, 21);
                af8Var5.g = obj;
                return af8Var5;
            case 22:
                return new af8((qqa) this.g, (vx9) obj2, lq4Var, 22);
            case 23:
                return new af8((jsa) obj2, lq4Var, 23);
            case 24:
                return new af8((jsa) this.g, (una) obj2, lq4Var, 24);
            case 25:
                return new af8((jsa) this.g, (MessageModel) obj2, lq4Var, 25);
            case 26:
                return new af8((jsa) this.g, (Set) obj2, lq4Var, 26);
            case 27:
                return new af8((fva) this.g, (rt2) obj2, lq4Var, 27);
            case 28:
                af8 af8Var6 = new af8((fva) obj2, lq4Var, 28);
                af8Var6.g = obj;
                return af8Var6;
            default:
                return new af8((fva) this.g, (MessageModel) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((af8) create((hs8) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((af8) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((af8) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((af8) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((af8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x02d8, code lost:
    
        if (r4 == r5) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0505, code lost:
    
        if (defpackage.jsa.J(r1, (defpackage.rt2) r2, r29) == r0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r12 == r13) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0829, code lost:
    
        if (r2.a(r29, r3) == r1) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if (defpackage.fva.d(r4, r1, r15, false, r29, 4) == r13) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0995, code lost:
    
        if (r0.emit(r2, r29) == r1) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0c2a, code lost:
    
        if (r1.c(r3, r29) == r2) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c5b, code lost:
    
        if (r1.c(r3, r29) == r2) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d6, code lost:
    
        if (r12 == r13) goto L30;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af8(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af8(Object obj, lq4 lq4Var, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af8(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
