package defpackage;

import one.video.calls.sdk.conversation.hold.HoldException;

/* JADX INFO: loaded from: classes3.dex */
public final class ny7 implements py7 {
    public final HoldException a;

    public ny7(HoldException holdException) {
        this.a = holdException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ny7) && this.a.equals(((ny7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ")";
    }
}
