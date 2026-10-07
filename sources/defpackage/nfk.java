package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nfk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc9 b;
    public final /* synthetic */ pve c;

    public /* synthetic */ nfk(dc9 dc9Var, pve pveVar, int i) {
        this.a = i;
        this.b = dc9Var;
        this.c = pveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        pve pveVar = this.c;
        dc9 dc9Var = this.b;
        switch (i) {
            case 0:
                for (sve sveVar : (CopyOnWriteArrayList) dc9Var.c) {
                    try {
                        sveVar.d.put(pveVar, Long.valueOf(sveVar.c.getAndIncrement()));
                    } catch (Throwable th) {
                        ((y3e) dc9Var.b).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsubmit", th);
                    }
                }
                break;
            case 1:
                Iterator it = ((CopyOnWriteArrayList) dc9Var.c).iterator();
                while (it.hasNext()) {
                    try {
                        ((sve) it.next()).d.remove(pveVar);
                    } catch (Throwable th2) {
                        ((y3e) dc9Var.b).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandremove", th2);
                    }
                }
                break;
            default:
                for (sve sveVar2 : (CopyOnWriteArrayList) dc9Var.c) {
                    try {
                        Long l = (Long) sveVar2.d.get(pveVar);
                        if (l != null) {
                            sveVar2.b.log(sveVar2.a, "-> [" + l + "]: " + pveVar);
                        }
                    } catch (Throwable th3) {
                        ((y3e) dc9Var.b).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsent", th3);
                    }
                }
                break;
        }
    }
}
