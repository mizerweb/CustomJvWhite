package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yo9 extends LinkedHashMap {
    public final /* synthetic */ int a;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo9(int i) {
        super(4, 0.75f, true);
        this.a = 0;
        this.b = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                return super.size() > this.b;
            default:
                return size() > this.b;
        }
    }

    public /* synthetic */ yo9(int i, byte b) {
        this.a = i;
        this.b = 10;
    }
}
