package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xyh extends gm0 {
    public xyh() {
        if (r5h.X0("UI")) {
            ore.p("Perfetto shared track name must not be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xyh);
    }

    public final int hashCode() {
        return 2708;
    }

    public final String toString() {
        return "SharedTrack(name=UI)";
    }
}
