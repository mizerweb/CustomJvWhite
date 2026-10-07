package defpackage;

import org.webrtc.RTCStats;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bw2 implements tg4, j8e {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ bw2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                ((tw2) obj).h = str;
                break;
            default:
                f70 f70Var = (f70) obj;
                for (int i2 = 0; i2 < f70Var.b(); i2++) {
                    if (cqk.p(str, f70Var.d(i2).t)) {
                        if (i2 < 0 || i2 >= f70Var.b()) {
                            ore.p("index < 0 or index >= attaches.size()");
                        } else {
                            f70Var.a.remove(i2);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        RTCStats rTCStats = (RTCStats) obj;
        rTCStats.getClass();
        zv8Var.getClass();
        Object obj2 = rTCStats.getMembers().get(this.b);
        if (obj2 != null) {
            return obj2.toString();
        }
        return null;
    }
}
