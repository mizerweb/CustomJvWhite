package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e76 implements h76 {
    public final tnh a;
    public final tnh b;
    public final tlg c;

    public e76(tlg tlgVar) {
        tnh tnhVar = new tnh(R.string.chat_screen_empty_dialog_state_title);
        tnh tnhVar2 = new tnh(R.string.chat_screen_empty_dialog_state_subtitle);
        this.a = tnhVar;
        this.b = tnhVar2;
        this.c = tlgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e76) && cqk.d(this.c, ((e76) obj).c);
    }

    public final int hashCode() {
        tlg tlgVar = this.c;
        if (tlgVar == null) {
            return 0;
        }
        return tlgVar.hashCode();
    }

    public final String toString() {
        return "WithSticker(sticker=" + this.c + ")";
    }
}
