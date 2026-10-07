package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public interface or0 extends k79 {
    Integer getIcon();

    ynh getText();

    @Override // defpackage.k79
    default boolean h(k79 k79Var) {
        return getItemId() == k79Var.getItemId();
    }

    @Override // defpackage.k79
    default int j() {
        return R.id.oneme_invite_action_view_type;
    }

    @Override // defpackage.k79
    default boolean m(k79 k79Var) {
        return equals(k79Var);
    }
}
