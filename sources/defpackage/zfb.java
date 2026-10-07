package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import net.jpountz.lz4.LZ4Exception;
import ru.ok.tamtam.api.CorruptedInputDataException;
import ru.ok.tamtam.api.SessionSenderUnexpectedException;
import ru.ok.tamtam.api.UnknownOpcodeException;
import ru.ok.tamtam.internal.MalformedPacketException;

/* JADX INFO: loaded from: classes.dex */
public final class zfb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ agb b;

    public /* synthetic */ zfb(agb agbVar, int i) {
        this.a = i;
        this.b = agbVar;
    }

    public boolean a(klc klcVar) {
        agb agbVar = this.b;
        if (agbVar.c.get() != 2 && !agb.c(agbVar, klcVar, mf9.class)) {
            return false;
        }
        klcVar.b.c.f(new yhh("session.state", "session is in logged in state or login already in progress", null));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0278 A[Catch: all -> 0x026c, Exception -> 0x026f, IOException -> 0x0274, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x026f, blocks: (B:81:0x0238, B:83:0x023e, B:91:0x0278, B:92:0x027a, B:96:0x029a), top: B:133:0x0238 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0298  */
    /* JADX WARN: Code duplicated, block: B:95:0x0299  */
    public void b() {
        hlc hlcVar;
        jlc jlcVar;
        short s;
        short s2;
        short s3;
        jlc jlcVar2;
        hih hihVar;
        hih hihVar2;
        if (!this.b.o() || this.b.v.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger();
        for (klc klcVar : this.b.v) {
            if (!this.b.o() || this.b.n()) {
                gm0.W(this.b.a, "packet_sender, detect INACTIVE session or has NO connection", new Object[0]);
                break;
            }
            int i = klcVar.a;
            byte b = 2;
            if (i == 1 && (jlcVar = klcVar.b) != null) {
                hih hihVar3 = jlcVar.a;
                boolean z = hihVar3 instanceof mf9;
                boolean z2 = hihVar3 instanceof ah9;
                boolean z3 = hihVar3 instanceof rmf;
                int iP = hihVar3.p();
                hlc hlcVarA = null;
                if (iP == -1 || iP == this.b.l.get()) {
                    if (!z && !z2) {
                        agb agbVar = this.b;
                        Iterator it = agbVar.v.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                jlc jlcVar3 = ((klc) it.next()).b;
                                if (jlcVar3 == null || (hihVar2 = jlcVar3.a) == null || !(hihVar2 instanceof ah9)) {
                                }
                            } else {
                                Iterator it2 = agbVar.u.entrySet().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        jlc jlcVar4 = ((ilc) ((Map.Entry) it2.next()).getValue()).b.b;
                                        if (jlcVar4 == null || (hihVar = jlcVar4.a) == null || !(hihVar instanceof ah9)) {
                                        }
                                    }
                                }
                            }
                            gm0.n(this.b.a, "Skipping " + klcVar.b.a.getClass().getName() + " because logout task in queue");
                        }
                    }
                    if (klcVar.b.a.o() && this.b.c.get() != 2) {
                        short sK = klcVar.b.a.k();
                        lhb lhbVar = kfc.c;
                        if (sK != 5) {
                            gm0.n(this.b.a, "Skipping " + klcVar.b.a.getClass().getName() + " because need login");
                        }
                    } else if (this.b.h.get() || z3) {
                        if (z3) {
                            agb agbVar2 = this.b;
                            if (agbVar2.h.get()) {
                                klcVar.b.c.f(new yhh("session.state", "SESSION_INIT already initialized", null));
                            } else if (agb.c(agbVar2, klcVar, rmf.class)) {
                                klcVar.b.c.f(new yhh("session.state", "SESSION_INIT already requested", null));
                            }
                            gm0.W(this.b.a, "Double session init detected, skipping", new Object[0]);
                            arrayList.add(klcVar);
                        }
                        if (klcVar.e) {
                            gm0.W(this.b.a, "packet_sender: task %s is cancelled", klcVar.b.a);
                        } else {
                            long jG = ew5.g(klcVar.c) - System.currentTimeMillis();
                            agb agbVar3 = this.b;
                            if (jG > 0) {
                                String str = agbVar3.a;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9 je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        StringBuilder sbB = nbh.B(jG, "Skipping ", klcVar.b.a.getClass().getName(), " because to early for queue, left ");
                                        sbB.append("ms");
                                        a4cVar.c(je9Var, str, sbB.toString(), null);
                                    }
                                }
                            } else {
                                AtomicInteger atomicInteger2 = agbVar3.b;
                                atomicInteger2.incrementAndGet();
                                short sShortValue = atomicInteger2.shortValue();
                                if (z) {
                                    try {
                                        try {
                                            try {
                                                if (a(klcVar)) {
                                                    gm0.W(this.b.a, "Skipping " + klcVar.b.a.getClass().getName() + " because already login", new Object[0]);
                                                } else {
                                                    try {
                                                        ilc ilcVar = new ilc(klcVar.b.c, klcVar, System.currentTimeMillis());
                                                        this.b.u.put(Short.valueOf(sShortValue), ilcVar);
                                                        jlcVar2 = klcVar.b;
                                                        hih hihVar4 = jlcVar2.a;
                                                        if (jlcVar2.b) {
                                                            b = 0;
                                                        }
                                                        hlcVarA = hlc.a(hihVar4, b, (short) 0);
                                                        this.b.p.getClass();
                                                        byte[] bArrC = hlcVarA.c(sShortValue);
                                                        s2 = sShortValue;
                                                        try {
                                                            this.b.q(sd9.c, klcVar.b.c.g(), s2, klcVar.b.a.k(), true, klcVar.b.a.toString(), null, bArrC.length);
                                                            atomicInteger.set(this.b.l.get());
                                                            this.b.J.d(bArrC);
                                                            ilcVar.d = bArrC.length;
                                                            this.b.s.p.obtainMessage(3, klcVar.b.a.k(), bArrC.length).sendToTarget();
                                                        } catch (IOException e) {
                                                            e = e;
                                                            s = s2;
                                                            short s4 = s;
                                                            this.b.p(sd9.d, klcVar.b.c.g(), s4, klcVar.b.a.k(), true, e.getMessage());
                                                            klcVar.b.c.f(new thh("send_io"));
                                                            this.b.u.remove(Short.valueOf(s4));
                                                            this.b.m(atomicInteger.get());
                                                            this.b.t(e, false);
                                                            arrayList.add(klcVar);
                                                            this.b.v.removeAll(arrayList);
                                                            arrayList.clear();
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            this.b.p(sd9.d, klcVar.b.c.g(), s2, klcVar.b.a.k(), true, e.getMessage());
                                                            s3 = s2;
                                                            if (e instanceof ArrayIndexOutOfBoundsException) {
                                                                gm0.X(this.b.a, e, "exception in LZ4, packet = " + wdl.c(0, hlcVarA.b(s3)), new Object[0]);
                                                            } else {
                                                                gm0.X(this.b.a, e, "exception in LZ4, packet = " + wdl.c(0, hlcVarA.b(s3)), new Object[0]);
                                                            }
                                                            klcVar.b.c.f(new thh("send_error"));
                                                            this.b.u.remove(Short.valueOf(s3));
                                                            this.b.t(new SessionSenderUnexpectedException(e), false);
                                                        }
                                                    } catch (IOException e3) {
                                                        e = e3;
                                                        s2 = sShortValue;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                arrayList.add(klcVar);
                                                throw th;
                                            }
                                        } catch (IOException e4) {
                                            e = e4;
                                            s = sShortValue;
                                            short s5 = s;
                                            this.b.p(sd9.d, klcVar.b.c.g(), s5, klcVar.b.a.k(), true, e.getMessage());
                                            klcVar.b.c.f(new thh("send_io"));
                                            this.b.u.remove(Short.valueOf(s5));
                                            this.b.m(atomicInteger.get());
                                            this.b.t(e, false);
                                            arrayList.add(klcVar);
                                            this.b.v.removeAll(arrayList);
                                            arrayList.clear();
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        s2 = sShortValue;
                                        this.b.p(sd9.d, klcVar.b.c.g(), s2, klcVar.b.a.k(), true, e.getMessage());
                                        s3 = s2;
                                        if (((e instanceof ArrayIndexOutOfBoundsException) || (e instanceof LZ4Exception)) && hlcVarA != null) {
                                            gm0.X(this.b.a, e, "exception in LZ4, packet = " + wdl.c(0, hlcVarA.b(s3)), new Object[0]);
                                        }
                                        klcVar.b.c.f(new thh("send_error"));
                                        this.b.u.remove(Short.valueOf(s3));
                                        this.b.t(new SessionSenderUnexpectedException(e), false);
                                        arrayList.add(klcVar);
                                    }
                                } else {
                                    ilc ilcVar2 = new ilc(klcVar.b.c, klcVar, System.currentTimeMillis());
                                    this.b.u.put(Short.valueOf(sShortValue), ilcVar2);
                                    jlcVar2 = klcVar.b;
                                    hih hihVar5 = jlcVar2.a;
                                    if (jlcVar2.b) {
                                        b = 0;
                                    }
                                    hlcVarA = hlc.a(hihVar5, b, (short) 0);
                                    this.b.p.getClass();
                                    byte[] bArrC2 = hlcVarA.c(sShortValue);
                                    s2 = sShortValue;
                                    this.b.q(sd9.c, klcVar.b.c.g(), s2, klcVar.b.a.k(), true, klcVar.b.a.toString(), null, bArrC2.length);
                                    atomicInteger.set(this.b.l.get());
                                    this.b.J.d(bArrC2);
                                    ilcVar2.d = bArrC2.length;
                                    this.b.s.p.obtainMessage(3, klcVar.b.a.k(), bArrC2.length).sendToTarget();
                                }
                                arrayList.add(klcVar);
                            }
                        }
                    } else {
                        gm0.n(this.b.a, "Skipping " + klcVar.b.a.getClass().getName() + " because session not initialized");
                    }
                } else {
                    gm0.y(this.b.a, c0a.o("Removing ", klcVar.b.a.getClass().getName(), " because it has wrong connection number"), new Object[0]);
                    klcVar.b.c.f(new yhh("session.sequence", "Task has wrong connection number", null));
                    arrayList.add(klcVar);
                }
            } else if (i == 2 && (hlcVar = klcVar.d) != null) {
                try {
                    try {
                        this.b.p(sd9.e, 0L, hlcVar.c, hlcVar.d, true, "");
                        atomicInteger.set(this.b.l.get());
                        agb agbVar4 = this.b;
                        hlc hlcVar2 = klcVar.d;
                        agbVar4.J.d(hlcVar2.b(hlcVar2.c));
                    } catch (Throwable th2) {
                        arrayList.add(klcVar);
                        throw th2;
                    }
                } catch (IOException e6) {
                    agb agbVar5 = this.b;
                    sd9 sd9Var = sd9.d;
                    hlc hlcVar3 = klcVar.d;
                    agbVar5.p(sd9Var, 0L, hlcVar3.c, hlcVar3.d, true, e6.getMessage());
                    this.b.m(atomicInteger.get());
                    this.b.t(e6, false);
                }
                arrayList.add(klcVar);
            }
        }
        this.b.v.removeAll(arrayList);
        arrayList.clear();
    }

    /* JADX WARN: Code duplicated, block: B:344:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:349:0x04e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:350:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:356:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:368:0x057b  */
    /* JADX WARN: Code duplicated, block: B:371:0x0585  */
    /* JADX WARN: Code duplicated, block: B:374:0x0594  */
    /* JADX WARN: Code duplicated, block: B:376:0x059c  */
    /* JADX WARN: Code duplicated, block: B:378:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:380:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:382:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:384:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:386:0x063f  */
    public void c(byte[] bArr, hlc hlcVar, rhh rhhVar) throws Throwable {
        Object next;
        kih kihVar;
        kih kihVarI;
        nz2 nz2Var;
        boolean z;
        char c;
        char c2;
        String string;
        agb agbVar;
        String string2;
        String str;
        a4c a4cVar;
        je9 je9Var;
        v44 v44Var;
        kih wjbVar;
        sd9 sd9Var = hlcVar.b == 1 ? sd9.h : sd9.i;
        if (bArr.length <= 0) {
            this.b.q(sd9Var, rhhVar.g(), hlcVar.c, hlcVar.d, false, "empty", null, hlcVar.g);
            short s = hlcVar.d;
            lhb lhbVar = kfc.c;
            if (s != 20) {
                rhhVar.b(kih.b);
                return;
            }
            this.b.u.remove(Short.valueOf(hlcVar.c));
            rhhVar.b(kih.b);
            this.b.i(false, false, om5.j);
            return;
        }
        short s2 = hlcVar.d;
        int i = this.b.l.get();
        kih kihVar2 = kih.b;
        fka fkaVarA = xia.a(bArr);
        kfc.c.getClass();
        Iterator it = kfc.Z3.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((kfc) next).a != s2);
        kfc kfcVar = (kfc) next;
        lhb lhbVar2 = kfc.c;
        if (s2 == 18) {
            wjbVar = id0.d(fkaVarA);
        } else if (s2 == 23) {
            wjbVar = jd0.d(fkaVarA);
        } else if (s2 == 17) {
            wjbVar = ie0.d(fkaVarA);
        } else if (s2 == 49) {
            wjbVar = fz2.k(fkaVarA);
        } else if (s2 == 48) {
            nz2Var = new nz2(fkaVarA);
            if (nz2Var.c == null) {
                wjbVar = nz2Var;
                nz2Var.c = Collections.EMPTY_LIST;
                wjbVar = nz2Var;
            }
        } else if (s2 == 50) {
            wjbVar = ku6.e.i(fkaVarA);
        } else if (s2 == 34) {
            wjbVar = new qm4(fkaVarA);
        } else if (s2 == 32) {
            wjbVar = cy5.d.i(fkaVarA);
        } else if (s2 == 46) {
            wjbVar = j85.f.i(fkaVarA);
        } else if (s2 == 36) {
            wjbVar = new yj4(fkaVarA);
        } else if (s2 == 37) {
            wjbVar = new em4(fkaVarA);
        } else if (s2 == 39) {
            wjbVar = new ol4(fkaVarA);
        } else {
            if (s2 != 19) {
                if (s2 != 20) {
                    kfc kfcVar2 = kfc.X3;
                    if (s2 == kfcVar2.a) {
                        wjbVar = kfcVar2.b.i(fkaVarA);
                    } else if (s2 == 66) {
                        wjbVar = i3b.d(fkaVarA);
                    } else if (s2 == 64) {
                        wjbVar = s4b.n(fkaVarA);
                    } else if (s2 != 65) {
                        if (s2 == 67) {
                            wjbVar = p3b.d(fkaVarA);
                        } else if (s2 == 180) {
                            wjbVar = nhb.i.i(fkaVarA);
                        } else if (s2 == 181) {
                            wjbVar = new r3b(fkaVarA);
                        } else if (s2 != 52 && s2 != 54) {
                            if (s2 == kfc.a3.a) {
                                wjbVar = kihVar2;
                                wjbVar = kihVar2;
                                wjbVar = new qjb(fkaVarA);
                            } else {
                                kfc kfcVar3 = kfc.Z2;
                                if (s2 == kfcVar3.a) {
                                    wjbVar = kihVar2;
                                    wjbVar = kihVar2;
                                    wjbVar = kfcVar3.b.i(fkaVarA);
                                } else {
                                    kfc kfcVar4 = kfc.X2;
                                    if (s2 == kfcVar4.a) {
                                        wjbVar = kihVar2;
                                        wjbVar = kihVar2;
                                        wjbVar = kfcVar4.b.i(fkaVarA);
                                    } else if (s2 == kfc.b3.a) {
                                        wjbVar = kihVar2;
                                        wjbVar = kihVar2;
                                        wjbVar = new okb(fkaVarA);
                                    } else if (s2 == kfc.c3.a) {
                                        wjbVar = kihVar2;
                                        wjbVar = kihVar2;
                                        wjbVar = new njb(fkaVarA);
                                    } else if (s2 == kfc.Y2.a) {
                                        wjbVar = kihVar2;
                                        wjbVar = kihVar2;
                                        wjbVar = new zkb(fkaVarA);
                                    } else if (s2 == kfc.d3.a) {
                                        wjbVar = kihVar2;
                                        wjbVar = kihVar2;
                                        wjbVar = kihVar2;
                                        wjbVar = new bjb(fkaVarA);
                                    } else if (s2 != 1) {
                                        if (s2 == 16) {
                                            wjbVar = new dmd(fkaVarA);
                                        } else if (s2 == 21) {
                                            wjbVar = new efh(fkaVarA);
                                        } else if (s2 == 68) {
                                            wjbVar = new zd3(fkaVarA);
                                        } else if (s2 == 73) {
                                            wjbVar = new j4b(fkaVarA);
                                        } else if (s2 == 70) {
                                            wjbVar = new x4b(fkaVarA);
                                        } else if (s2 == 83) {
                                            wjbVar = new a3j(fkaVarA);
                                        } else if (s2 == 86) {
                                            wjbVar = new o93(fkaVarA);
                                        } else if (s2 == 51) {
                                            wjbVar = new v13(fkaVarA);
                                        } else if (s2 == 96) {
                                            wjbVar = new eof(fkaVarA);
                                        } else if (s2 == 97) {
                                            wjbVar = new bof(fkaVarA);
                                        } else if (s2 == 98) {
                                            wjbVar = new ntc(fkaVarA);
                                        } else if (s2 == 99) {
                                            wjbVar = new mtc(fkaVarA);
                                        } else if (s2 == 25) {
                                            wjbVar = xvc.l.i(fkaVarA);
                                        } else if (s2 == 3) {
                                            wjbVar = new yae(fkaVarA);
                                        } else if (s2 == 2) {
                                            wjbVar = new x45(fkaVarA);
                                        } else if (s2 != 5) {
                                            if (s2 == 53) {
                                                wjbVar = kihVar2;
                                                wjbVar = new ii3(fkaVarA);
                                            } else if (s2 == 26) {
                                                wjbVar = kihVar2;
                                                wjbVar = new my(fkaVarA);
                                            } else if (s2 == 27) {
                                                xy xyVar = new xy(fkaVarA);
                                                if (xyVar.d == null) {
                                                    wjbVar = kihVar2;
                                                    xyVar.d = Collections.EMPTY_LIST;
                                                }
                                                wjbVar = kihVar2;
                                                if (xyVar.e == null) {
                                                    xyVar.e = Collections.EMPTY_MAP;
                                                }
                                                if (xyVar.f == null) {
                                                    xyVar.f = Collections.EMPTY_MAP;
                                                }
                                                if (xyVar.g == null) {
                                                    xyVar.g = Collections.EMPTY_LIST;
                                                }
                                                if (xyVar.h == null) {
                                                    xyVar.h = Collections.EMPTY_MAP;
                                                }
                                                Map map = xyVar.i;
                                                wjbVar = xyVar;
                                                if (map == null) {
                                                    xyVar.i = Collections.EMPTY_MAP;
                                                    wjbVar = xyVar;
                                                }
                                            } else if (s2 == 28) {
                                                ly lyVar = new ly(fkaVarA);
                                                if (lyVar.c == null) {
                                                    wjbVar = kihVar2;
                                                    lyVar.c = Collections.EMPTY_LIST;
                                                }
                                                wjbVar = kihVar2;
                                                if (lyVar.d == null) {
                                                    lyVar.d = Collections.EMPTY_LIST;
                                                }
                                                if (lyVar.e == null) {
                                                    lyVar.e = Collections.EMPTY_LIST;
                                                }
                                                List list = lyVar.f;
                                                wjbVar = lyVar;
                                                if (list == null) {
                                                    lyVar.f = Collections.EMPTY_LIST;
                                                    wjbVar = lyVar;
                                                }
                                            } else if (s2 == 74) {
                                                wjbVar = kihVar2;
                                                wjbVar = new z3b(fkaVarA);
                                            } else if (s2 == 6) {
                                                wjbVar = kihVar2;
                                                wjbVar = new smf(fkaVarA, i);
                                            } else if (s2 != 56) {
                                                if (s2 == 55) {
                                                    wjbVar = kihVar2;
                                                    wjbVar = kihVar2;
                                                    wjbVar = new dg3(fkaVarA);
                                                } else if (s2 == 60) {
                                                    wjbVar = kihVar2;
                                                    wjbVar = kihVar2;
                                                    wjbVar = new yxd(fkaVarA);
                                                } else if (s2 != 58) {
                                                    if (s2 == 77) {
                                                        wjbVar = kihVar2;
                                                        wjbVar = kihVar2;
                                                        wjbVar = kihVar2;
                                                        wjbVar = new f73(fkaVarA);
                                                    } else if (s2 != 75) {
                                                        if (s2 == 78) {
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = cy5.m.i(fkaVarA);
                                                        } else if (s2 == kfc.f3.a) {
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = new yib(fkaVarA);
                                                        } else if (s2 == 87) {
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = new ft6(fkaVarA);
                                                        } else if (s2 == kfc.g3.a) {
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = new sjb(fkaVarA);
                                                        } else if (s2 == 42) {
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = new sm4(fkaVarA);
                                                        } else if (s2 == 43) {
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = new wie(fkaVarA);
                                                        } else if (s2 == 79) {
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = new fui(fkaVarA);
                                                        } else if (s2 == kfc.h3.a) {
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = new jkb(fkaVarA);
                                                        } else if (s2 == 92) {
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = kihVar2;
                                                            wjbVar = m3b.d(fkaVarA);
                                                        } else {
                                                            kfc kfcVar5 = kfc.i3;
                                                            if (s2 == kfcVar5.a) {
                                                                wjbVar = kihVar2;
                                                                wjbVar = kihVar2;
                                                                wjbVar = kihVar2;
                                                                wjbVar = kihVar2;
                                                                wjbVar = kfcVar5.b.i(fkaVarA);
                                                            } else if (s2 == kfc.j3.a) {
                                                                wjbVar = kihVar2;
                                                                wjbVar = kihVar2;
                                                                wjbVar = kihVar2;
                                                                wjbVar = kihVar2;
                                                                wjbVar = lkb.d(fkaVarA);
                                                            } else if (s2 == kfc.k3.a) {
                                                                wjbVar = kihVar2;
                                                                wjbVar = kihVar2;
                                                                wjbVar = kihVar2;
                                                                wjbVar = kihVar2;
                                                                wjbVar = new nkb(fkaVarA);
                                                            } else if (s2 != 117) {
                                                                if (s2 == 118) {
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = new q4b(fkaVarA);
                                                                } else if (s2 == kfc.l3.a) {
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = new zib(fkaVarA);
                                                                } else if (s2 == kfc.m3.a) {
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = kihVar2;
                                                                    wjbVar = new ou2(fkaVarA);
                                                                } else {
                                                                    kfc kfcVar6 = kfc.n3;
                                                                    if (s2 == kfcVar6.a) {
                                                                        wjbVar = kihVar2;
                                                                        wjbVar = kihVar2;
                                                                        wjbVar = kihVar2;
                                                                        wjbVar = kihVar2;
                                                                        wjbVar = kihVar2;
                                                                        wjbVar = kfcVar6.b.i(fkaVarA);
                                                                    } else if (s2 != 125) {
                                                                        if (s2 == 124) {
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = new hd9(fkaVarA);
                                                                        } else if (s2 == 126) {
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = kihVar2;
                                                                            wjbVar = new il7(fkaVarA, 1);
                                                                        } else if (s2 != kfc.p3.a) {
                                                                            if (s2 == kfc.o3.a) {
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = new wjb(fkaVarA);
                                                                            } else {
                                                                                if (s2 == 127) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new il7(fkaVarA, 0);
                                                                                } else if (s2 == 103) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new hl7(fkaVarA, 0);
                                                                                } else if (s2 == kfc.q3.a) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new pib(fkaVarA);
                                                                                } else if (s2 == 261) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new py(fkaVarA);
                                                                                } else if (s2 == 259) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new vy(fkaVarA);
                                                                                } else if (s2 == 260) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new sy(fkaVarA);
                                                                                } else if (s2 == 29) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new iy(fkaVarA);
                                                                                } else if (s2 == 193) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new ilg(fkaVarA);
                                                                                } else if (s2 == 81) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new vmg(fkaVarA);
                                                                                } else if (s2 == 194) {
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    wjbVar = kihVar2;
                                                                                    kihVarI = new smg(fkaVarA);
                                                                                } else if (s2 != kfc.r3.a) {
                                                                                    if (s2 == 195) {
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        kihVarI = kihVar2;
                                                                                        kihVarI = new hl7(fkaVarA, 1);
                                                                                    } else if (s2 == kfc.s3.a) {
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        wjbVar = kihVar2;
                                                                                        kihVarI = kihVar2;
                                                                                        kihVarI = ae3.d(fkaVarA);
                                                                                    } else {
                                                                                        kfc kfcVar7 = kfc.t3;
                                                                                        if (s2 == kfcVar7.a) {
                                                                                            wjbVar = kihVar2;
                                                                                            wjbVar = kihVar2;
                                                                                            wjbVar = kihVar2;
                                                                                            wjbVar = kihVar2;
                                                                                            wjbVar = kihVar2;
                                                                                            wjbVar = kihVar2;
                                                                                            wjbVar = kihVar2;
                                                                                            kihVarI = kihVar2;
                                                                                            kihVarI = kfcVar7.b.i(fkaVarA);
                                                                                        } else {
                                                                                            kfc kfcVar8 = kfc.x3;
                                                                                            if (s2 == kfcVar8.a) {
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                kihVarI = kihVar2;
                                                                                                kihVarI = kfcVar8.b.i(fkaVarA);
                                                                                            } else if (s2 == 105) {
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                wjbVar = kihVar2;
                                                                                                kihVarI = kihVar2;
                                                                                                kihVarI = lhb.g.i(fkaVarA);
                                                                                            } else {
                                                                                                kfc kfcVar9 = kfc.u3;
                                                                                                if (s2 == kfcVar9.a) {
                                                                                                    wjbVar = kihVar2;
                                                                                                    wjbVar = kihVar2;
                                                                                                    wjbVar = kihVar2;
                                                                                                    wjbVar = kihVar2;
                                                                                                    wjbVar = kihVar2;
                                                                                                    wjbVar = kihVar2;
                                                                                                    wjbVar = kihVar2;
                                                                                                    kihVarI = kihVar2;
                                                                                                    kihVarI = kfcVar9.b.i(fkaVarA);
                                                                                                } else {
                                                                                                    fu3 fu3Var = kfcVar != null ? kfcVar.b : null;
                                                                                                    if (fu3Var != null) {
                                                                                                        kihVarI = fu3Var.i(fkaVarA);
                                                                                                    } else {
                                                                                                        kihVar = null;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                wjbVar = kihVar2;
                                                                                kihVarI = kihVar2;
                                                                                kihVar = kihVarI;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z = kihVar instanceof smf;
                if (z) {
                    this.b.d = ((smf) kihVar).g;
                }
                if (!z && ((smf) kihVar).d != 1) {
                    this.b.h.set(true);
                } else if (z && ((smf) kihVar).d == 1) {
                    rhhVar.b(kihVar);
                    this.b.h(true);
                    return;
                }
                if (kihVar instanceof nf9) {
                    this.b.u(2);
                    agbVar = this.b;
                    if (agbVar.o() || (v44Var = agbVar.K) == null) {
                        c = 'C';
                        c2 = 'B';
                    } else {
                        long j = v44Var.j();
                        wc4 wc4VarA = agbVar.J.e().a();
                        if (wc4VarA.g == agbVar.l.get()) {
                            c2 = 'B';
                            long jP = qe7.P(wc4VarA.a, lw5.MILLISECONDS);
                            String str2 = agbVar.a;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 == null) {
                                c = 'C';
                            } else {
                                c = 'C';
                                je9 je9Var2 = je9.e;
                                if (a4cVar2.b(je9Var2)) {
                                    int i2 = wc4VarA.g;
                                    String strT = ew5.t(jP);
                                    String strT2 = ew5.t(j);
                                    String strT3 = ew5.t(ew5.p(jP, j));
                                    StringBuilder sbA = nbh.A(i2, "\n                          Session transition: DISCONNECTED -> CONNECTED(", ") -> LOGGED_IN\n                              took ~ ", strT, " + ");
                                    sbA.append(strT2);
                                    sbA.append(" = ");
                                    sbA.append(strT3);
                                    sbA.append("\n                        ");
                                    a4cVar2.c(je9Var2, str2, s5h.x0(sbA.toString()), null);
                                }
                            }
                        } else {
                            c = 'C';
                            c2 = 'B';
                        }
                    }
                    if (agbVar.o()) {
                        rnf rnfVar = agbVar.s;
                        string2 = Integer.toString(agbVar.m);
                        str = rnfVar.f;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "onLoggedIn for sessionId=".concat(string2), null);
                            }
                        }
                        rnfVar.p.obtainMessage(2, string2).sendToTarget();
                    }
                } else {
                    c = 'C';
                    c2 = 'B';
                }
                if (kihVar == null) {
                    UnknownOpcodeException unknownOpcodeException = new UnknownOpcodeException(hlcVar.d);
                    this.b.q(sd9Var, rhhVar.g(), hlcVar.c, hlcVar.d, false, unknownOpcodeException.toString(), null, hlcVar.g);
                    gm0.V(this.b.a, "unknown opcode", unknownOpcodeException);
                    this.b.t(unknownOpcodeException, false);
                    rhhVar.f(unknownOpcodeException.a);
                    return;
                }
                if (kihVar instanceof xe9) {
                    b5d b5dVar = ((g5d) ((gjf) this.b.r.a.c(97))).a.q0;
                    zv8[] zv8VarArr = e5d.S6;
                    string = ((xe9) kihVar).a(((Boolean) b5dVar.a(zv8VarArr[c2]).i()).booleanValue(), ((Boolean) ((g5d) ((gjf) this.b.r.a.c(97))).a.r0.a(zv8VarArr[c]).i()).booleanValue());
                } else {
                    string = kihVar.toString();
                }
                this.b.q(sd9Var, rhhVar.g(), hlcVar.c, hlcVar.d, false, string, null, hlcVar.g);
                rhhVar.b(kihVar);
            }
            wjbVar = kihVar2;
            wjbVar = a8g.k.i(fkaVarA);
        }
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = kihVar2;
        wjbVar = nz2Var;
        kihVar = wjbVar;
        z = kihVar instanceof smf;
        if (z) {
            this.b.d = ((smf) kihVar).g;
        }
        if (!z) {
            if (z) {
                rhhVar.b(kihVar);
                this.b.h(true);
                return;
            }
        } else if (z) {
            rhhVar.b(kihVar);
            this.b.h(true);
            return;
        }
        if (kihVar instanceof nf9) {
            this.b.u(2);
            agbVar = this.b;
            if (agbVar.o()) {
                c = 'C';
                c2 = 'B';
            } else {
                c = 'C';
                c2 = 'B';
            }
            if (agbVar.o()) {
                rnf rnfVar2 = agbVar.s;
                string2 = Integer.toString(agbVar.m);
                str = rnfVar2.f;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "onLoggedIn for sessionId=".concat(string2), null);
                    }
                }
                rnfVar2.p.obtainMessage(2, string2).sendToTarget();
            }
        } else {
            c = 'C';
            c2 = 'B';
        }
        if (kihVar == null) {
            UnknownOpcodeException unknownOpcodeException2 = new UnknownOpcodeException(hlcVar.d);
            this.b.q(sd9Var, rhhVar.g(), hlcVar.c, hlcVar.d, false, unknownOpcodeException2.toString(), null, hlcVar.g);
            gm0.V(this.b.a, "unknown opcode", unknownOpcodeException2);
            this.b.t(unknownOpcodeException2, false);
            rhhVar.f(unknownOpcodeException2.a);
            return;
        }
        if (kihVar instanceof xe9) {
            b5d b5dVar2 = ((g5d) ((gjf) this.b.r.a.c(97))).a.q0;
            zv8[] zv8VarArr2 = e5d.S6;
            string = ((xe9) kihVar).a(((Boolean) b5dVar2.a(zv8VarArr2[c2]).i()).booleanValue(), ((Boolean) ((g5d) ((gjf) this.b.r.a.c(97))).a.r0.a(zv8VarArr2[c]).i()).booleanValue());
        } else {
            string = kihVar.toString();
        }
        this.b.q(sd9Var, rhhVar.g(), hlcVar.c, hlcVar.d, false, string, null, hlcVar.g);
        rhhVar.b(kihVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x015f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0165  */
    /* JADX WARN: Code duplicated, block: B:54:0x017b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0183 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0184  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public void d() throws Throwable {
        byte[] bArr;
        ilc ilcVar;
        short s;
        String strC;
        String str;
        a4c a4cVar;
        je9 je9Var;
        byte b;
        yhh yhhVarD;
        byte[] bArr2 = new byte[10];
        this.b.J.b(bArr2);
        hlc hlcVar = new hlc(bArr2);
        ilc ilcVar2 = (ilc) this.b.u.get(Short.valueOf(hlcVar.c));
        int i = hlcVar.g;
        byte[] bArrA = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i3 < hlcVar.g) {
            int iC = this.b.J.c(i3, bArrA, Math.min(np0.n, i - i3));
            if (iC < 0) {
                c.n();
                return;
            } else {
                i3 += iC;
                this.b.e.set(System.currentTimeMillis());
            }
        }
        int i4 = i + 10;
        long jCurrentTimeMillis = ilcVar2 != null ? System.currentTimeMillis() - ilcVar2.c : 0L;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        try {
            byte b2 = hlcVar.e;
            if (b2 != -1) {
                if (b2 > 0) {
                    gm0.m(this.b.a, "applying lz4 decompression for packet = %s, cof = %d", hlcVar, Byte.valueOf(b2));
                    int i5 = hlcVar.g * hlcVar.e;
                    byte[] bArr3 = new byte[i5];
                    rx8.G().safeDecompressor().decompress(bArrA, 0, i, bArr3, 0, i5);
                    bArr = bArr3;
                }
                agb.e(this.b, hlcVar, i4, ilcVar2, jCurrentTimeMillis, bArr.length + 10, hlcVar.e != 0 ? System.currentTimeMillis() - jCurrentTimeMillis2 : 0L);
                if (hlcVar.b == 0) {
                    c(bArr, hlcVar, new cmf(this, i2, hlcVar));
                    return;
                }
                ilcVar = (ilc) this.b.u.get(Short.valueOf(hlcVar.c));
                if (ilcVar != null) {
                    s = hlcVar.c;
                    short s2 = hlcVar.d;
                    kfc.c.getClass();
                    strC = lhb.c(s2);
                    str = this.b.a;
                    a4cVar = gm0.f;
                    if (a4cVar == null) {
                        return;
                    }
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        Locale locale = Locale.US;
                        a4cVar.c(je9Var, str, zo5.i(s, "illegal state in handleResponse, reader task is null, seq=", ", opcode=", strC), null);
                        return;
                    }
                    return;
                }
                this.b.u.remove(Short.valueOf(hlcVar.c));
                if (ilcVar.e) {
                }
                b = hlcVar.b;
                if (b != 1) {
                    c(bArr, hlcVar, ilcVar.a);
                    return;
                }
                if (b != 3) {
                    String strH = zo5.h(b, "illegal state in handleResponse, cmd: ");
                    IllegalStateException illegalStateException = new IllegalStateException(strH);
                    gm0.V(this.b.a, strH, illegalStateException);
                    this.b.t(illegalStateException, false);
                    return;
                }
                yhhVarD = wvl.d(xia.a(bArr));
                this.b.q(sd9.g, ilcVar.a.g(), hlcVar.c, ilcVar.b.b.a.k(), false, yhhVarD.toString(), yhhVarD.b, bArr.length);
                if ("proto.state".equals(yhhVarD.b) && this.b.J.close()) {
                    this.b.i(true, false, om5.i);
                }
                ilcVar.a.f(yhhVarD);
            }
            ((j7f) this.b.H.getValue()).getClass();
            bArrA = j7f.a(bArrA);
            bArr = bArrA;
            agb.e(this.b, hlcVar, i4, ilcVar2, jCurrentTimeMillis, bArr.length + 10, hlcVar.e != 0 ? System.currentTimeMillis() - jCurrentTimeMillis2 : 0L);
            if (hlcVar.b == 0) {
                c(bArr, hlcVar, new cmf(this, i2, hlcVar));
                return;
            }
            ilcVar = (ilc) this.b.u.get(Short.valueOf(hlcVar.c));
            if (ilcVar != null) {
                s = hlcVar.c;
                short s3 = hlcVar.d;
                kfc.c.getClass();
                strC = lhb.c(s3);
                str = this.b.a;
                a4cVar = gm0.f;
                if (a4cVar == null) {
                    return;
                }
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    return;
                }
                Locale locale2 = Locale.US;
                a4cVar.c(je9Var, str, zo5.i(s, "illegal state in handleResponse, reader task is null, seq=", ", opcode=", strC), null);
                return;
            }
            this.b.u.remove(Short.valueOf(hlcVar.c));
            if (ilcVar.e) {
                b = hlcVar.b;
                if (b != 1) {
                    c(bArr, hlcVar, ilcVar.a);
                    return;
                }
                if (b != 3) {
                    String strH2 = zo5.h(b, "illegal state in handleResponse, cmd: ");
                    IllegalStateException illegalStateException2 = new IllegalStateException(strH2);
                    gm0.V(this.b.a, strH2, illegalStateException2);
                    this.b.t(illegalStateException2, false);
                    return;
                }
                yhhVarD = wvl.d(xia.a(bArr));
                this.b.q(sd9.g, ilcVar.a.g(), hlcVar.c, ilcVar.b.b.a.k(), false, yhhVarD.toString(), yhhVarD.b, bArr.length);
                if ("proto.state".equals(yhhVarD.b)) {
                    this.b.i(true, false, om5.i);
                }
                ilcVar.a.f(yhhVarD);
            }
        } catch (Throwable th) {
            long j = jCurrentTimeMillis;
            try {
                gm0.X(this.b.a, th, "decompress failure! packet = %s", hlcVar);
                throw th;
            } catch (Throwable th2) {
                agb.e(this.b, hlcVar, i4, ilcVar2, j, i4, hlcVar.e != 0 ? System.currentTimeMillis() - jCurrentTimeMillis2 : 0L);
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                agb agbVar = this.b;
                String str = agbVar.a;
                AtomicInteger atomicInteger = new AtomicInteger();
                while (agbVar.o()) {
                    try {
                        while (agbVar.n()) {
                            try {
                                if (agbVar.o()) {
                                    try {
                                        Thread.sleep(100L);
                                    } catch (InterruptedException unused) {
                                        gm0.q(str, "waiting in packet_reader was interrupted, EXIT");
                                    }
                                } else {
                                    gm0.W(str, "PacketReader: session is not active!", new Object[0]);
                                }
                                agb.b(agbVar);
                                agb.f(agbVar);
                                return;
                            } catch (MalformedPacketException e) {
                                gm0.X(str, e, "Malformed input packet detected", new Object[0]);
                                agbVar.l(atomicInteger.get(), e);
                                agbVar.t(new CorruptedInputDataException(), false);
                            } catch (IOException e2) {
                                gm0.X(str, e2, "IOException in packet reader", new Object[0]);
                                agbVar.l(atomicInteger.get(), e2);
                                agbVar.t(e2, false);
                            } catch (Exception e3) {
                                gm0.V(str, "exception in packet reader", e3);
                                agbVar.t(e3, false);
                            }
                        }
                        atomicInteger.set(agbVar.l.get());
                        d();
                    } catch (Throwable th) {
                        agb.b(agbVar);
                        agb.f(agbVar);
                        throw th;
                    }
                }
                agb.b(agbVar);
                agb.f(agbVar);
                return;
        }
        while (this.b.o()) {
            try {
                s74 s74Var = this.b.y;
                s74Var.getClass();
                try {
                    s74Var.p(500L);
                    z = true;
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    z = false;
                }
                agb agbVar2 = this.b;
                if (!z) {
                    gm0.W(agbVar2.a, "waiting in packet_sender was interrupted, EXIT", new Object[0]);
                    agb.b(this.b);
                    agb.f(this.b);
                }
                try {
                    synchronized (agbVar2.w) {
                        try {
                            b();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Exception e4) {
                    gm0.V(this.b.a, "exception in packet sender", e4);
                    this.b.t(e4, false);
                }
            } catch (Throwable th3) {
                agb.b(this.b);
                agb.f(this.b);
                throw th3;
            }
            agb.b(this.b);
            agb.f(this.b);
            throw th3;
        }
        agb.b(this.b);
        agb.f(this.b);
    }
}
