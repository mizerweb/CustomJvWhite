package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ock implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ock(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                pbk pbkVar = (pbk) obj;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (arrayList.get(i2) != qck.h) {
                        ((Consumer) arrayList.get(i2)).accept((o8k) pbkVar.c.get(i2));
                    }
                }
                break;
            case 1:
                arrayList.add((Map.Entry) obj);
                break;
            default:
                Map.Entry entry = (Map.Entry) obj;
                arrayList.add(new AbstractMap.SimpleEntry(((String) entry.getKey()).toLowerCase(), (String) ((List) entry.getValue()).stream().collect(Collectors.joining(","))));
                break;
        }
    }
}
