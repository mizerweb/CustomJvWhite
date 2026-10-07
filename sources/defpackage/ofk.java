package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ofk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc9 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ ofk(dc9 dc9Var, byte[] bArr, int i, int i2) {
        this.a = i2;
        this.b = dc9Var;
        this.c = bArr;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.d;
        byte[] bArr = this.c;
        dc9 dc9Var = this.b;
        switch (i) {
            case 0:
                for (sve sveVar : (CopyOnWriteArrayList) dc9Var.c) {
                    try {
                        y3e y3eVar = sveVar.b;
                        String str = sveVar.a;
                        int i3 = q3k.a[qt4.D(i2)];
                        y3eVar.log(str, "<- ".concat(i3 != 1 ? i3 != 2 ? "<unknown>" : zu7.a(bArr) : new String(bArr)));
                    } catch (Throwable th) {
                        ((y3e) dc9Var.b).reportException("CallsListeners", "rtc.command.handle.listeners.ondatareceive", th);
                    }
                }
                break;
            default:
                for (sve sveVar2 : (CopyOnWriteArrayList) dc9Var.c) {
                    try {
                        y3e y3eVar2 = sveVar2.b;
                        String str2 = sveVar2.a;
                        int i4 = q3k.a[qt4.D(i2)];
                        y3eVar2.log(str2, "-> ".concat(i4 != 1 ? i4 != 2 ? "<unknown>" : zu7.a(bArr) : new String(bArr)));
                    } catch (Throwable th2) {
                        ((y3e) dc9Var.b).reportException("CallsListeners", "rtc.command.handle.listeners.ondatasend", th2);
                    }
                }
                break;
        }
    }
}
