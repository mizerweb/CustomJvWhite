package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.push.PushClient;
import com.vk.push.core.utils.AidlExtensionsKt;
import com.vk.push.core.utils.BinderExtensionsKt;
import com.vk.push.core.utils.StringExtensionsKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zgk extends PushClient.Stub {
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public zgk(ifh ifhVar, ifh ifhVar2, ifh ifhVar3) {
        this.c = ifhVar;
        this.d = ifhVar2;
        this.e = ifhVar3;
    }

    @Override // com.vk.push.core.push.PushClient
    public final void isPushTokenExist(String str, AsyncCallback asyncCallback) {
        if (efk.s == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Is push token exist called with client sdk not being initialized"), (Logger) this.e.getValue());
                return;
            }
            return;
        }
        if (asyncCallback == null || str == null) {
            Logger.DefaultImpls.warn$default((Logger) this.e.getValue(), "Token or callback argument is null for some reason", null, 2, null);
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("token is null"), (Logger) this.e.getValue());
                return;
            }
            return;
        }
        kdk kdkVar = (kdk) this.d.getValue();
        CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
        Logger.DefaultImpls.info$default(kdkVar.g, "Checking is push token " + StringExtensionsKt.hideSensitive(str) + " exist...", null, 2, null);
        yab.i0(kdkVar.h, null, 0, new gv7(21, null, kdkVar, callingIds, asyncCallback, str), 3);
    }

    @Override // com.vk.push.core.push.PushClient
    public final void onDeletedMessages(AsyncCallback asyncCallback) {
        if (efk.s == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Delete messages called with client sdk not being initialized"), (Logger) this.e.getValue());
            }
        } else {
            if (asyncCallback == null) {
                Logger.DefaultImpls.warn$default((Logger) this.e.getValue(), "Callback is null for some reason", null, 2, null);
                return;
            }
            kdk kdkVar = (kdk) this.d.getValue();
            CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
            Logger.DefaultImpls.info$default(kdkVar.g, "On delete messages has requested", null, 2, null);
            yab.i0(kdkVar.h, null, 0, new rjj(kdkVar, callingIds, asyncCallback, null, 15), 3);
        }
    }

    @Override // com.vk.push.core.push.PushClient
    public final void onMessagesReceived(List list, AsyncCallback asyncCallback) {
        if (efk.s == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Messages received called with client sdk not being initialized"), (Logger) this.e.getValue());
            }
        } else if (list != null && !list.isEmpty() && asyncCallback != null) {
            hgk hgkVar = (hgk) this.c.getValue();
            yab.i0(hgkVar.g, null, 0, new poi(20, null, hgkVar, BinderExtensionsKt.getCallingIds(this), asyncCallback, list), 3);
        } else {
            Logger.DefaultImpls.warn$default((Logger) this.e.getValue(), "Callback or messages is null for some reason", null, 2, null);
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("messages is null"), (Logger) this.e.getValue());
            }
        }
    }

    @Override // com.vk.push.core.push.PushClient
    public final void onTokenInvalidated(AsyncCallback asyncCallback) {
        if (efk.s == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Token invalidated called with client sdk not being initialized"), (Logger) this.e.getValue());
            }
        } else {
            if (asyncCallback == null) {
                Logger.DefaultImpls.warn$default((Logger) this.e.getValue(), "Callback is null for some reason", null, 2, null);
                return;
            }
            kdk kdkVar = (kdk) this.d.getValue();
            CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
            Logger.DefaultImpls.info$default(kdkVar.g, "Token invalidation has requested", null, 2, null);
            yab.i0(kdkVar.h, null, 0, new poi(kdkVar, callingIds, asyncCallback, null), 3);
        }
    }
}
