package defpackage;

import android.net.Uri;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.ExtensionsKt;
import com.vk.push.core.network.utils.ResponseErrorKt;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ejk extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ kr6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ejk(String str, String str2, kr6 kr6Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = str;
        this.g = str2;
        this.h = kr6Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new ejk(this.f, this.g, this.h, lq4Var, 0);
            default:
                return new ejk(this.f, this.g, this.h, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((ejk) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        poe poeVar;
        poe poeVar2;
        int i = this.e;
        String str = "";
        Object poeVar3 = sbi.a;
        kr6 kr6Var = this.h;
        String str2 = this.g;
        String str3 = this.f;
        ch3.d0(obj);
        switch (i) {
            case 0:
                Object objM26executeRequestIoAF18A = ((HttpClient) kr6Var.a).m26executeRequestIoAF18A(new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), (HostInfoProvider) kr6Var.b).encodedPath(String.format("v1/topics/%s/subscribe", Arrays.copyOf(new Object[]{str2}, 1))).build().toString(), new JSONObject().put("push_token", str3).toString()));
                try {
                    ch3.d0(objM26executeRequestIoAF18A);
                    HttpResponse httpResponse = (HttpResponse) objM26executeRequestIoAF18A;
                    if (!ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                        if (httpResponse.isSuccessful()) {
                            httpResponse.getBody();
                        } else {
                            String message = httpResponse.getMessage();
                            if (message != null) {
                                str = message;
                            }
                            poeVar = new poe(new VkpnsRequestException(str, httpResponse.getCode()));
                        }
                        return new roe(poeVar3);
                    }
                    ResponseError errorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                    poeVar = new poe(new VkpnsRequestWithErrorBodyException(errorResponse.toString(), errorResponse.getCode()));
                    poeVar3 = poeVar;
                } catch (Exception e) {
                    poeVar3 = new poe(e);
                }
                return new roe(poeVar3);
            default:
                Object objM26executeRequestIoAF18A2 = ((HttpClient) kr6Var.a).m26executeRequestIoAF18A(new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), (HostInfoProvider) kr6Var.b).encodedPath(String.format("v1/topics/%s/unsubscribe", Arrays.copyOf(new Object[]{str2}, 1))).build().toString(), new JSONObject().put("push_token", str3).toString()));
                try {
                    ch3.d0(objM26executeRequestIoAF18A2);
                    HttpResponse httpResponse2 = (HttpResponse) objM26executeRequestIoAF18A2;
                    if (!ResponseErrorKt.hasErrorBody(httpResponse2.getBody())) {
                        if (httpResponse2.isSuccessful()) {
                            httpResponse2.getBody();
                        } else {
                            String message2 = httpResponse2.getMessage();
                            if (message2 != null) {
                                str = message2;
                            }
                            poeVar2 = new poe(new VkpnsRequestException(str, httpResponse2.getCode()));
                        }
                        return new roe(poeVar3);
                    }
                    ResponseError errorResponse2 = ResponseErrorKt.parseErrorResponse(httpResponse2.getBody());
                    poeVar2 = new poe(new VkpnsRequestWithErrorBodyException(errorResponse2.toString(), errorResponse2.getCode()));
                    poeVar3 = poeVar2;
                } catch (Exception e2) {
                    poeVar3 = new poe(e2);
                }
                return new roe(poeVar3);
        }
    }
}
