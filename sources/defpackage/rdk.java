package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;
import one.video.calls.sdk_private.dF;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rdk implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdk b;

    public /* synthetic */ rdk(sdk sdkVar, int i) {
        this.a = i;
        this.b = sdkVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        sdk sdkVar = this.b;
        hek hekVar = (hek) obj;
        switch (i) {
            case 0:
                try {
                    sdkVar.b(ti8.g(hekVar.b()), hekVar);
                } catch (IOException unused) {
                    return;
                } catch (dF unused2) {
                    hekVar.a(966049156L);
                }
                break;
            default:
                try {
                    InputStream inputStreamB = hekVar.b();
                    if (ti8.g(inputStreamB) == 65) {
                        sdkVar.b(ti8.g(inputStreamB), hekVar);
                    }
                } catch (IOException unused3) {
                    return;
                } catch (dF unused4) {
                    hekVar.a(966049156L);
                    hekVar.b(966049156L);
                    return;
                }
                break;
        }
    }
}
