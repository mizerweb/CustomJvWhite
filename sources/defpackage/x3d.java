package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class x3d implements Handler.Callback {
    public final qf a;
    public final rj5 b;
    public k15 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final TreeMap e = new TreeMap();
    public final Handler d = vqi.p(this);
    public final pt c = new pt(false);

    public x3d(k15 k15Var, rj5 rj5Var, qf qfVar) {
        this.f = k15Var;
        this.b = rj5Var;
        this.a = qfVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.i) {
            if (message.what != 1) {
                return false;
            }
            v3d v3dVar = (v3d) message.obj;
            long j = v3dVar.a;
            long j2 = v3dVar.b;
            Long lValueOf = Long.valueOf(j2);
            TreeMap treeMap = this.e;
            Long l = (Long) treeMap.get(lValueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            }
            if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
