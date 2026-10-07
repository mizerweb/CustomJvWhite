package defpackage;

import javax.inject.Provider;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dli implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dli(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                eli eliVar = (eli) obj;
                return (ze2) eliVar.a.invoke(((ve2) eliVar.d.getValue()).a);
            case 1:
                return ((ve2) ((eli) obj).d.getValue()).b;
            default:
                return ((Uploader) obj).getSink();
        }
    }
}
