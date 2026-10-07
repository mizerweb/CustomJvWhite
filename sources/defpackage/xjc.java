package defpackage;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xjc {
    public final Size a;
    public final int b;
    public final String c;
    public final zjc d;
    public final yjc e;
    public final akc f;
    public final bkc g;
    public final List h;

    public xjc(Size size, int i, String str, zjc zjcVar, yjc yjcVar, akc akcVar, bkc bkcVar, List list) {
        this.a = size;
        this.b = i;
        this.c = str;
        this.d = zjcVar;
        this.e = yjcVar;
        this.f = akcVar;
        this.g = bkcVar;
        this.h = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append((Object) d4h.b(this.b));
        sb.append(", camera=");
        String str = this.c;
        sb.append((Object) (str == null ? "null" : ef2.b(str)));
        sb.append(", mirrorMode=");
        sb.append(this.d);
        sb.append(", timestampBase=null, dynamicRangeProfile=");
        sb.append(this.e);
        sb.append(", streamUseCase=");
        sb.append(this.f);
        sb.append(", streamUseHint=");
        sb.append(this.g);
        sb.append(", sensorPixelModes=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
