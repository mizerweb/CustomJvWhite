package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hl2 {
    public static final bh0 f = new bh0("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final bh0 g = new bh0("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final bh0 h = new bh0("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList a;
    public final dhc b;
    public final int c;
    public final List d;
    public final ghh e;

    public hl2(ArrayList arrayList, dhc dhcVar, int i, ArrayList arrayList2, ghh ghhVar) {
        this.a = arrayList;
        this.b = dhcVar;
        this.c = i;
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = ghhVar;
    }

    public final Range a() {
        Range range = (Range) this.b.b(h, yi0.h);
        Objects.requireNonNull(range);
        return range;
    }
}
