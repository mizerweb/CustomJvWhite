package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class i1i {
    public final Layout a;
    public final boolean b;

    public i1i(Layout layout, boolean z) {
        this.a = layout;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1i)) {
            return false;
        }
        i1i i1iVar = (i1i) obj;
        return this.a.equals(i1iVar.a) && this.b == i1iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TranscriptionLayoutState(transcriptionLayout=" + this.a + ", isTranscriptionRecognized=" + this.b + ")";
    }
}
