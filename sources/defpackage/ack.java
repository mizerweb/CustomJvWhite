package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ack implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eck b;

    public /* synthetic */ ack(eck eckVar, int i) {
        this.a = i;
        this.b = eckVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        eck eckVar = this.b;
        switch (i) {
            case 0:
                try {
                    eckVar.k();
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                hak hakVar = eckVar.f;
                Object[] objArr = {new n8k(), new k8k(2)};
                ArrayList arrayList = new ArrayList(2);
                while (i2 < 2) {
                    Object obj = objArr[i2];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    i2++;
                }
                hakVar.e(Collections.unmodifiableList(arrayList), w4k.a);
                break;
            default:
                hak hakVar2 = eckVar.f;
                Object[] objArr2 = {new n8k(), new k8k(2)};
                ArrayList arrayList2 = new ArrayList(2);
                while (i2 < 2) {
                    Object obj2 = objArr2[i2];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    i2++;
                }
                hakVar2.e(Collections.unmodifiableList(arrayList2), w4k.c);
                break;
        }
    }
}
