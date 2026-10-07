package ru.ok.tamtam.messages;

import defpackage.a4c;
import defpackage.az3;
import defpackage.b9b;
import defpackage.bi4;
import defpackage.c0a;
import defpackage.cqk;
import defpackage.dol;
import defpackage.gm0;
import defpackage.h60;
import defpackage.je9;
import defpackage.jn;
import defpackage.kfi;
import defpackage.ky3;
import defpackage.m8b;
import defpackage.mg5;
import defpackage.mm;
import defpackage.nbh;
import defpackage.nv4;
import defpackage.ny8;
import defpackage.p24;
import defpackage.p4c;
import defpackage.q24;
import defpackage.qr7;
import defpackage.rt2;
import defpackage.s04;
import defpackage.sfa;
import defpackage.sfe;
import defpackage.t51;
import defpackage.tcd;
import defpackage.u6;
import defpackage.ui9;
import defpackage.v14;
import defpackage.vcd;
import defpackage.zed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final t51 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public b(t51 t51Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = t51Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
    }

    public static void a(rt2 rt2Var, sfa sfaVar) {
        if (rt2Var != null) {
            boolean z = rt2Var instanceof s04;
            if ((!z || (sfaVar instanceof ky3)) && (z || !(sfaVar instanceof ky3))) {
                return;
            }
            long j = sfaVar.a;
            boolean z2 = sfaVar instanceof ky3;
            long j2 = rt2Var.a;
            s04 s04Var = z ? (s04) rt2Var : null;
            ChatException.ChatMessageTypeMismatch chatMessageTypeMismatch = new ChatException.ChatMessageTypeMismatch(j, z2, j2, s04Var != null ? s04Var.r : null);
            gm0.r("PreProcessDataCache", "Wrong chat/message type", chatMessageTypeMismatch);
            qr7.w(chatMessageTypeMismatch);
        }
    }

    public final void b() {
        vcd vcdVar = vcd.a;
        dol.a(this.g, vcdVar);
        dol.a(this.h, vcdVar);
    }

    public final void c(long j, long j2, mg5 mg5Var) {
        a4c a4cVar;
        if (!this.g.entrySet().removeIf(new u6(14, new v14(j, j2, mg5Var))) || (a4cVar = gm0.f) == null) {
            return;
        }
        je9 je9Var = je9.e;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "PreProcessDataCache", "clearPreprocessedDataInChat: chatId = " + j + ", itemType = " + mg5Var, null);
        }
    }

    public final void d(rt2 rt2Var, sfa sfaVar) {
        long j = sfaVar.a;
        if (j == 0) {
            gm0.V("PreProcessDataCache", "zero message in PreProcessDataCache", new MessageException.ZeroId());
            e(rt2Var, sfaVar);
            return;
        }
        if (rt2Var != null && sfaVar.h != rt2Var.a) {
            ((zed) this.d.getValue()).a.E(true);
            gm0.V("PreProcessDataCache", "Wrong message for chat, place=createAndPutPreprocessedData", new ChatException.WrongMessage(sfaVar.a, sfaVar.h, rt2Var.a));
        }
        a(rt2Var, sfaVar);
        c cVarE = e(null, sfaVar);
        (sfaVar instanceof ky3 ? this.h : this.g).put(Long.valueOf(j), cVarE);
        cVarE.l(rt2Var);
    }

    public final c e(rt2 rt2Var, sfa sfaVar) {
        return new c((p4c) this.b.getValue(), (bi4) this.c.getValue(), (zed) this.d.getValue(), sfaVar, rt2Var, (jn) this.e.getValue());
    }

    public final c f(rt2 rt2Var, sfa sfaVar) {
        long j = sfaVar.a;
        if (j == 0) {
            gm0.V("PreProcessDataCache", "zero message in PreProcessDataCache", new MessageException.ZeroId());
            return e(rt2Var, sfaVar);
        }
        if (rt2Var != null && sfaVar.h != rt2Var.a) {
            ((zed) this.d.getValue()).a.E(true);
            gm0.V("PreProcessDataCache", "Wrong message for chat, place=getOrCreatePreprocessedData", new ChatException.WrongMessage(sfaVar.a, sfaVar.h, rt2Var.a));
        }
        a(rt2Var, sfaVar);
        sfe sfeVar = new sfe();
        sfeVar.a = true;
        c cVar = (c) (sfaVar instanceof ky3 ? this.h : this.g).computeIfAbsent(Long.valueOf(j), new mm(16, new tcd(sfeVar, this, sfaVar, rt2Var)));
        if (rt2Var != null && sfeVar.a) {
            cVar.l(rt2Var);
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01e0 A[EDGE_INSN: B:122:0x01e0->B:92:0x01e0 BREAK  A[LOOP:3: B:81:0x0195->B:91:0x01dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01dd A[LOOP:3: B:81:0x0195->B:91:0x01dd, LOOP_END] */
    public final m8b g(Collection collection, nv4 nv4Var, ConcurrentHashMap concurrentHashMap) {
        je9 je9Var = je9.e;
        String str = cqk.d(concurrentHashMap, this.g) ? "messages" : "comments";
        if (collection.isEmpty()) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "PreProcessDataCache", c0a.o("invalidatePreprocessedDataByContacts for ", str, " ignored, contactIds is empty!"), null);
            }
            return ui9.a;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "PreProcessDataCache", nbh.r(collection.size(), "invalidatePreprocessedDataByContacts for ", str, " contactIds = "), null);
        }
        ArrayList<sfa> arrayList = new ArrayList();
        m8b m8bVar = new m8b();
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            c cVar = (c) ((Map.Entry) it.next()).getValue();
            if (collection.contains(Long.valueOf(cVar.d.e)) && m8bVar.a(cVar.d.a)) {
                arrayList.add(cVar.d);
            }
            sfa sfaVar = cVar.d.q;
            if (sfaVar != null && collection.contains(Long.valueOf(sfaVar.e)) && m8bVar.a(cVar.d.a)) {
                arrayList.add(cVar.d);
            }
            h60 h60VarQ = cVar.d.q();
            if (h60VarQ != null) {
                if (!collection.contains(Long.valueOf(h60VarQ.b))) {
                    Iterator it2 = h60VarQ.c.iterator();
                    while (it2.hasNext()) {
                        if (collection.contains((Long) it2.next())) {
                            if (!m8bVar.a(cVar.d.a)) {
                                break;
                            }
                            arrayList.add(cVar.d);
                            break;
                        }
                    }
                } else if (m8bVar.a(cVar.d.a)) {
                    arrayList.add(cVar.d);
                }
            }
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, "PreProcessDataCache", nbh.r(arrayList.size(), "invalidatePreprocessedDataByContacts for ", str, ": invalidated messages count = "), null);
        }
        b9b b9bVar = new b9b();
        for (sfa sfaVar2 : arrayList) {
            rt2 rt2Var = (rt2) nv4Var.invoke(sfaVar2);
            if (rt2Var == null) {
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar4.b(je9Var2)) {
                        a4cVar4.c(je9Var2, "PreProcessDataCache", c0a.o("invalidatePreprocessedDataByContacts for ", str, ": chat is null! ignore update"), null);
                    }
                }
            } else {
                d(rt2Var, sfaVar2);
                if (rt2Var instanceof s04) {
                    q24 q24Var = ((s04) rt2Var).r;
                    Object objD = b9bVar.d(q24Var);
                    if (objD == null) {
                        objD = new ArrayList();
                        b9bVar.o(q24Var, objD);
                    }
                    ((ArrayList) objD).add(Long.valueOf(sfaVar2.a));
                } else {
                    this.a.c(new kfi(sfaVar2.h, sfaVar2.a, false));
                }
            }
        }
        if (b9bVar.f()) {
            Object[] objArr = b9bVar.b;
            Object[] objArr2 = b9bVar.c;
            long[] jArr = b9bVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                ((p24) this.f.getValue()).a(new az3((q24) objArr[i4], (ArrayList) objArr2[i4], false));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return m8bVar;
    }
}
