package defpackage;

import java.util.Collection;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sp4 implements k79 {
    public final Collection a;

    public sp4(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.messages_list_context_actions_view_type;
    }
}
