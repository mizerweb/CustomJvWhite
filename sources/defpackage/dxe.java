package defpackage;

import android.util.MutableBoolean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.sdk.tasks.service.OnMaxFailCountException;
import one.me.sdk.tasks.service.TooMuchPersistTasksException;

/* JADX INFO: loaded from: classes.dex */
public final class dxe {
    public final ny8 a;
    public final ny8 b;
    public final int c;
    public final int d;
    public final pfh e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ifh k;
    public final String l;
    public final AtomicInteger m;
    public final ifh n;

    public dxe(gu4 gu4Var, ifh ifhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, int i) {
        pfh pfhVar = new pfh(lw5.NANOSECONDS);
        this.a = ny8Var6;
        this.b = ny8Var7;
        this.c = i;
        this.d = 100;
        this.e = pfhVar;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        this.j = ny8Var5;
        this.k = new ifh(new x5(gu4Var, 28, ifhVar));
        this.l = dxe.class.getName();
        this.m = new AtomicInteger(0);
        this.n = new ifh(new ap9(23, this));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029c  */
    /* JADX WARN: Code duplicated, block: B:103:0x029e A[PHI: r3 r4 r5 r6 r12
  0x029e: PHI (r3v21 int) = (r3v20 int), (r3v22 int) binds: [B:97:0x027a, B:102:0x029d] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r4v9 vwe) = (r4v8 vwe), (r4v10 vwe) binds: [B:97:0x027a, B:102:0x029d] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r5v24 tjh) = (r5v23 tjh), (r5v27 tjh) binds: [B:97:0x027a, B:102:0x029d] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r6v24 java.util.Iterator) = (r6v23 java.util.Iterator), (r6v25 java.util.Iterator) binds: [B:97:0x027a, B:102:0x029d] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:97:0x027a, B:102:0x029d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:96:0x026b  */
    /* JADX WARN: Code duplicated, block: B:98:0x027c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x029c -> B:102:0x029d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x027a -> B:103:0x029e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.dxe r16, defpackage.nq4 r17) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.a(dxe, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum b(tjh tjhVar, nq4 nq4Var) {
        wwe wweVar;
        if (nq4Var instanceof wwe) {
            wweVar = (wwe) nq4Var;
            int i = wweVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                wweVar.g = i - Integer.MIN_VALUE;
            } else {
                wweVar = new wwe(this, nq4Var);
            }
        } else {
            wweVar = new wwe(this, nq4Var);
        }
        Object objI = wweVar.e;
        int i2 = wweVar.g;
        if (i2 == 0) {
            ch3.d0(objI);
            int i3 = tjhVar.e;
            long j = tjhVar.d;
            if (i3 != 0 && j != 0) {
                okh okhVarE = e();
                wweVar.d = tjhVar;
                wweVar.g = 1;
                objI = okhVarE.i(j, wweVar, null);
                hu4 hu4Var = hu4.a;
                if (objI == hu4Var) {
                    return hu4Var;
                }
            }
            return atc.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tjhVar = wweVar.d;
        ch3.d0(objI);
        if (((tjh) objI) != null && tjhVar.e == 1) {
            return atc.b;
        }
        return atc.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final Object c(btc btcVar, nq4 nq4Var) {
        xwe xweVar;
        if (nq4Var instanceof xwe) {
            xweVar = (xwe) nq4Var;
            int i = xweVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xweVar.g = i - Integer.MIN_VALUE;
            } else {
                xweVar = new xwe(this, nq4Var);
            }
        } else {
            xweVar = new xwe(this, nq4Var);
        }
        Object obj = xweVar.e;
        int i2 = xweVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                xweVar.d = btcVar;
                xweVar.g = 1;
                Object objH = btcVar.h(xweVar);
                Object obj2 = hu4.a;
                this = objH;
                btcVar = obj2;
                if (objH == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                btc btcVar2 = xweVar.d;
                ch3.d0(obj);
                this = this;
                btcVar = btcVar2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(this.l, "executeOnMaxFailCount", new OnMaxFailCountException(btcVar.getType(), th));
        }
        return sbi.a;
    }

    public final et3 d() {
        return (et3) this.f.getValue();
    }

    public final okh e() {
        return (okh) this.h.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r14.f(defpackage.ctc.TYPE_SYNC_CHAT_HISTORY, r0) == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r14.g(r11, r0, r4) == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (r14.f(defpackage.ctc.TYPE_CHAT_SUBSCRIBE, r0) == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (r14.f(defpackage.ctc.TYPE_MSG_CANCEL_REACTION, r0) == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        if (r14.g(r6, r0, r4) == r10) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.f(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Enum g(tjh tjhVar, ArrayList arrayList, m8b m8bVar, m8b m8bVar2, MutableBoolean mutableBoolean, nq4 nq4Var) {
        zwe zweVar;
        atc atcVar = atc.c;
        if (nq4Var instanceof zwe) {
            zweVar = (zwe) nq4Var;
            int i = zweVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zweVar.g = i - Integer.MIN_VALUE;
            } else {
                zweVar = new zwe(this, nq4Var);
            }
        } else {
            zweVar = new zwe(this, nq4Var);
        }
        Object objJ = zweVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = zweVar.g;
        if (i2 == 0) {
            ch3.d0(objJ);
            btc btcVar = tjhVar.f;
            if (btcVar instanceof ulf) {
                ulf ulfVar = (ulf) btcVar;
                if (!ulfVar.C()) {
                    arrayList.add(tjhVar);
                }
                if (uwe.$EnumSwitchMapping$0[ulfVar.e.ordinal()] != 1) {
                    m8bVar = m8bVar2;
                }
                if (m8bVar.d(ulfVar.c)) {
                    String str = this.l;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.e;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "task <" + btcVar + "> already in list, delete it!", null);
                        }
                    }
                    arrayList.add(tjhVar);
                } else {
                    m8bVar.a(ulfVar.c);
                }
                if (mutableBoolean.value) {
                    return atcVar;
                }
            } else if (btcVar instanceof amf) {
                amf amfVar = (amf) btcVar;
                AtomicInteger atomicInteger = amf.f;
                amf amfVar2 = amf.g;
                int i3 = 17;
                amfVar.d.removeIf(new u6(i3, new ez(amfVar2 != null ? rx8.j0(amfVar2.d) : ui9.a, 3)));
                amfVar.d.removeIf(new u6(i3, new ez(m8bVar, 3)));
                m8bVar.b(rx8.j0(amfVar.d));
                zweVar.d = tjhVar;
                zweVar.g = 1;
                objJ = amfVar.j();
                if (objJ != hu4Var) {
                }
                return hu4Var;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objJ);
                return atcVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tjhVar = zweVar.d;
        ch3.d0(objJ);
        atc atcVar2 = (atc) objJ;
        if (atcVar2 == atc.a) {
            return atcVar2;
        }
        okh okhVarE = e();
        long j = tjhVar.a;
        zweVar.d = null;
        zweVar.g = 2;
        if (okhVarE.m(j, zweVar) == hu4Var) {
            return hu4Var;
        }
        return atcVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0367  */
    /* JADX WARN: Code duplicated, block: B:110:0x0372  */
    /* JADX WARN: Code duplicated, block: B:113:0x039c  */
    /* JADX WARN: Code duplicated, block: B:115:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:119:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:121:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:124:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:127:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:132:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:135:0x041f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0423  */
    /* JADX WARN: Code duplicated, block: B:142:0x042a  */
    /* JADX WARN: Code duplicated, block: B:144:0x042d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0434  */
    /* JADX WARN: Code duplicated, block: B:152:0x0450  */
    /* JADX WARN: Code duplicated, block: B:153:0x0461  */
    /* JADX WARN: Code duplicated, block: B:155:0x0465  */
    /* JADX WARN: Code duplicated, block: B:161:0x0290 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x021c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0231  */
    /* JADX WARN: Code duplicated, block: B:67:0x023b  */
    /* JADX WARN: Code duplicated, block: B:68:0x023d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0277  */
    /* JADX WARN: Code duplicated, block: B:76:0x028a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:83:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:98:0x031d  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x041e, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0160, code lost:
    
        if (r0 == r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0308, code lost:
    
        if (r2.c(r12, r8) == r9) goto L26;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x03b5, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(long r23, java.util.ArrayList r25, defpackage.m8b r26, defpackage.m8b r27, android.util.MutableBoolean r28, defpackage.nq4 r29) {
        /*
            Method dump skipped, instruction units count: 1192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.h(long, java.util.ArrayList, m8b, m8b, android.util.MutableBoolean, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(int i, nq4 nq4Var) {
        bxe bxeVar;
        String string;
        Object objH;
        if (nq4Var instanceof bxe) {
            bxeVar = (bxe) nq4Var;
            int i2 = bxeVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bxeVar.h = i2 - Integer.MIN_VALUE;
            } else {
                bxeVar = new bxe(this, nq4Var);
            }
        } else {
            bxeVar = new bxe(this, nq4Var);
        }
        Object objI = bxeVar.f;
        int i3 = bxeVar.h;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(objI);
            okh okhVarE = e();
            bxeVar.d = i;
            bxeVar.h = 1;
            xkh xkhVarB = okhVarE.c().b();
            objI = ch3.I(bxeVar, xkhVarB.a, true, false, new u8h(10, xkhVarB));
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i3 == 1) {
            i = bxeVar.d;
            ch3.d0(objI);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    ch3.d0(objI);
                    return objI;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = bxeVar.d;
            string = bxeVar.e;
            ch3.d0(objI);
        }
        gm0.X(this.l, new TooMuchPersistTasksException(i, string), "too much tasks!", new Object[0]);
        okh okhVarE2 = e();
        bxeVar.e = null;
        bxeVar.d = i;
        bxeVar.h = 3;
        objH = okhVarE2.c().h(Integer.MAX_VALUE, bxeVar);
        if (objH != hu4Var) {
            return hu4Var;
        }
        return objH;
        List<sjh> list = (List) objI;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            qr7.d();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iA = ((sjh) next).a();
            do {
                Object next2 = it.next();
                int iA2 = ((sjh) next2).a();
                if (iA < iA2) {
                    next = next2;
                    iA = iA2;
                }
            } while (it.hasNext());
        }
        sjh sjhVar = (sjh) next;
        StringBuilder sb = new StringBuilder();
        for (sjh sjhVar2 : list) {
            sb.append(sjhVar2.b().name());
            sb.append('=');
            sb.append(sjhVar2.a());
            sb.append(';');
        }
        string = sb.toString();
        okh okhVarE3 = e();
        ctc ctcVarB = sjhVar.b();
        bxeVar.e = string;
        bxeVar.d = i;
        bxeVar.h = 2;
        if (okhVarE3.f(ctcVarB, bxeVar) != hu4Var) {
            gm0.X(this.l, new TooMuchPersistTasksException(i, string), "too much tasks!", new Object[0]);
            okh okhVarE4 = e();
            bxeVar.e = null;
            bxeVar.d = i;
            bxeVar.h = 3;
            objH = okhVarE4.c().h(Integer.MAX_VALUE, bxeVar);
            if (objH != hu4Var) {
                return objH;
            }
        }
        return hu4Var;
    }
}
