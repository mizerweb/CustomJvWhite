package defpackage;

import java.util.Collection;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class a3g implements vpa {
    public final MessageModel a;
    public final Collection b;
    public final boolean c;

    public a3g(MessageModel messageModel, Collection collection, boolean z) {
        this.a = messageModel;
        this.b = collection;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3g)) {
            return false;
        }
        a3g a3gVar = (a3g) obj;
        return cqk.d(this.a, a3gVar.a) && this.b.equals(a3gVar.b) && this.c == a3gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowMessageContextMenu(message=");
        sb.append(this.a);
        sb.append(", actions=");
        sb.append(this.b);
        sb.append(", showReadBy=");
        return qt4.r(sb, this.c, ")");
    }
}
