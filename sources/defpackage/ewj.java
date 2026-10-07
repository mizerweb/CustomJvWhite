package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.Logging;

/* JADX INFO: loaded from: classes2.dex */
public final class ewj implements vxa {
    public long a;
    public final ArrayList b;

    public ewj() {
        this.a = SystemClock.elapsedRealtime();
        this.b = new ArrayList();
    }

    public CharSequence a() {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            awj awjVar = (awj) next;
            if ((awjVar instanceof dwj) && ((dwj) awjVar).c) {
                break;
            }
        }
        dwj dwjVar = next instanceof dwj ? (dwj) next : null;
        if (dwjVar != null) {
            return dwjVar.a;
        }
        return null;
    }

    @Override // defpackage.vxa
    public void onSample(int i, int i2, int i3, dlc dlcVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.a;
        ArrayList arrayList = this.b;
        if (j > 5000 && !arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder("buffers[mic][");
            sb.append(jElapsedRealtime - this.a);
            sb.append("]: ");
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                sb2.append((int) ((ikk) obj).b);
                sb2.append(",");
            }
            sb.append((Object) sb2);
            Logging.d("SharedPeerConnectionFac", sb.toString());
            arrayList.clear();
            this.a = jElapsedRealtime;
        }
        int i5 = dlcVar.a;
        short s = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            short sA = dlcVar.a(i6);
            if (sA > s) {
                s = sA;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new ikk(s));
            return;
        }
        ikk ikkVar = (ikk) qv1.f(1, arrayList);
        int i7 = ikkVar.a;
        if (i7 >= 10) {
            arrayList.add(new ikk(s));
            return;
        }
        if (ikkVar.b < s) {
            ikkVar.b = s;
        }
        ikkVar.a = i7 + 1;
    }

    public ewj(long j, ArrayList arrayList) {
        this.a = j;
        this.b = arrayList;
    }
}
