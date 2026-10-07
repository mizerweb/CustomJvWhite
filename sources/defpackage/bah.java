package defpackage;

import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class bah implements Runnable {
    public final /* synthetic */ SuggestionsWidget a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ib h;

    public bah(wf4 wf4Var, SuggestionsWidget suggestionsWidget, int i, int i2, int i3, int i4, float f, boolean z, ib ibVar) {
        this.a = suggestionsWidget;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = z;
        this.h = ibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SuggestionsWidget suggestionsWidget = this.a;
        if (suggestionsWidget.getView() != null) {
            suggestionsWidget.z = this.b - this.c;
            suggestionsWidget.A = this.d - this.e;
            suggestionsWidget.B = this.f;
            suggestionsWidget.C = this.g ? 1.0f : 0.0f;
            this.h.o(suggestionsWidget.s1().getTop());
        }
    }
}
