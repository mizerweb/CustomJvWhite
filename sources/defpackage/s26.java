package defpackage;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s26 {
    public final ry9 a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;
    public final j36 f;
    public final l6m g;
    public final boolean h;
    public long i;

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    public s26(r26 r26Var) {
        i36 i36Var;
        l6m l6mVar = l6m.r;
        boolean z = r26Var.b;
        l6m l6mVar2 = r26Var.g;
        boolean zEquals = false;
        lvb.Z("Audio and video cannot both be removed", (z && r26Var.c) ? false : true);
        if (d(r26Var.a)) {
            lvb.R(r26Var.d != -9223372036854775807L);
            lvb.R(!r26Var.b);
            lvb.R(r26Var.f.a.isEmpty());
            lvb.R(l6mVar2 == l6mVar);
        }
        if (l6mVar2 != l6mVar) {
            boolean z2 = r26Var.h;
            j36 j36Var = r26Var.f;
            if (z2) {
                c98 c98Var = j36Var.a;
                c98 c98Var2 = j36Var.b;
                if (!c98Var.isEmpty()) {
                    fb0 fb0Var = (fb0) j36Var.a.get(0);
                    if (!(fb0Var instanceof reg) || ((reg) fb0Var).c.equals(l6mVar2)) {
                        if (c98Var2.isEmpty()) {
                            zEquals = true;
                        } else {
                            i36Var = (i36) c98Var2.get(0);
                            if (i36Var instanceof fth) {
                                zEquals = ((fth) i36Var).b.equals(l6mVar2);
                            } else {
                                zEquals = true;
                            }
                        }
                    }
                } else if (c98Var2.isEmpty()) {
                    i36Var = (i36) c98Var2.get(0);
                    if (i36Var instanceof fth) {
                        zEquals = ((fth) i36Var).b.equals(l6mVar2);
                    } else {
                        zEquals = true;
                    }
                } else {
                    zEquals = true;
                }
                lvb.b0(zEquals);
                lvb.b0(!izl.d(r26Var.f, true));
            } else {
                lvb.b0(!izl.d(j36Var, false));
            }
        }
        this.a = r26Var.a;
        this.b = r26Var.b;
        this.c = r26Var.c;
        this.d = r26Var.d;
        this.e = r26Var.e;
        this.f = r26Var.f;
        this.g = l6mVar2;
        this.h = r26Var.h;
        this.i = -9223372036854775807L;
    }

    public static boolean d(ry9 ry9Var) {
        return Objects.equals(ry9Var.a, "androidx-media3-GapMediaItem");
    }

    public static JSONObject e(ry9 ry9Var) throws JSONException {
        String string;
        int iLastIndexOf;
        JSONObject jSONObject = new JSONObject();
        jy9 jy9Var = ry9Var.b;
        dy9 dy9Var = ry9Var.e;
        jSONObject.put("extension", (jy9Var == null || (iLastIndexOf = (string = jy9Var.a.toString()).lastIndexOf(46)) <= 0 || iLastIndexOf >= string.length() + (-1)) ? "UNSET" : string.substring(iLastIndexOf + 1));
        if (dy9Var.equals(cy9.i)) {
            jSONObject.put("clipping", "UNSET");
            return jSONObject;
        }
        long j = dy9Var.c;
        String strValueOf = j == Long.MIN_VALUE ? "END_OF_SOURCE" : String.valueOf(j);
        jSONObject.put("clippingStartMs", dy9Var.a);
        jSONObject.put("clippingEndMs", strValueOf);
        return jSONObject;
    }

    public final r26 a() {
        r26 r26Var = new r26();
        r26Var.a = this.a;
        r26Var.b = this.b;
        r26Var.c = this.c;
        r26Var.d = this.d;
        r26Var.e = this.e;
        r26Var.f = this.f;
        r26Var.g = this.g;
        r26Var.h = this.h;
        return r26Var;
    }

    public final long b(long j) {
        long jI;
        l6m l6mVar = l6m.r;
        l6m l6mVar2 = this.g;
        if (l6mVar2 != l6mVar) {
            return erl.a(l6mVar2, j);
        }
        boolean z = this.b;
        j36 j36Var = this.f;
        long j2 = -9223372036854775807L;
        if (z) {
            jI = -9223372036854775807L;
        } else {
            a98 a98VarListIterator = j36Var.a.listIterator(0);
            jI = j;
            while (a98VarListIterator.hasNext()) {
                jI = ((fb0) a98VarListIterator.next()).i(jI);
            }
        }
        if (!this.c) {
            a98 a98VarListIterator2 = j36Var.b.listIterator(0);
            while (a98VarListIterator2.hasNext()) {
                j = ((i36) a98VarListIterator2.next()).e(j);
            }
            j2 = j;
        }
        return Math.max(jI, j2);
    }

    public final long c() {
        if (this.i == -9223372036854775807L) {
            ry9 ry9Var = this.a;
            boolean zEquals = ry9Var.e.equals(cy9.i);
            long j = this.d;
            if (zEquals || j == -9223372036854775807L) {
                this.i = j;
            } else {
                dy9 dy9Var = ry9Var.e;
                boolean z = dy9Var.f;
                long j2 = dy9Var.b;
                long j3 = dy9Var.d;
                lvb.R(!z);
                if (j3 == Long.MIN_VALUE) {
                    this.i = j - j2;
                } else {
                    lvb.R(j3 <= j);
                    this.i = j3 - j2;
                }
            }
            this.i = b(this.i);
        }
        return this.i;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mediaItem", e(this.a));
            jSONObject.put("effects", this.f.a());
            jSONObject.put("removeAudio", this.b);
            jSONObject.put("removeVideo", this.c);
            jSONObject.put("durationUs", this.d);
            jSONObject.put("presentationDuration", c());
            return jSONObject;
        } catch (JSONException e) {
            lvb.H0("EditedMediaItem", "JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return f().toString();
    }
}
