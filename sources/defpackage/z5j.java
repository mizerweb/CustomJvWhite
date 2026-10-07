package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public interface z5j {
    boolean B();

    void D(q5j q5jVar, t50 t50Var, long j, boolean z, boolean z2);

    void J();

    default View getPreviewView() {
        return null;
    }

    boolean n();

    void s(boolean z);

    void setVideoClickListener(qf7 qf7Var);

    void setVideoLongClickListener(qf7 qf7Var);

    default boolean z() {
        return false;
    }
}
