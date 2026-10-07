package defpackage;

import android.net.Uri;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.AppInfoJsonParser;
import com.vk.push.core.network.utils.ExtensionsKt;
import com.vk.push.core.network.utils.MapperKt;
import com.vk.push.core.network.utils.ResponseErrorKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class qn9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ List f;
    public final /* synthetic */ MasterHostApi g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn9(List list, MasterHostApi masterHostApi, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = list;
        this.g = masterHostApi;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MasterHostApi masterHostApi = this.g;
        List list = this.f;
        switch (i) {
            case 0:
                return new qn9(list, masterHostApi, lq4Var, 0);
            default:
                return new qn9(list, masterHostApi, lq4Var, 1);
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
        return ((qn9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        Object poeVar2;
        int i = this.e;
        String str = "";
        List list = this.f;
        MasterHostApi masterHostApi = this.g;
        switch (i) {
            case 0:
                ch3.d0(obj);
                Object objM26executeRequestIoAF18A = masterHostApi.a.m26executeRequestIoAF18A(new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), masterHostApi.b).encodedPath("v1/multihost/list").build().toString(), new JSONObject().put("packages", new JSONArray((Collection) list)).toString()));
                try {
                    ch3.d0(objM26executeRequestIoAF18A);
                    HttpResponse httpResponse = (HttpResponse) objM26executeRequestIoAF18A;
                    if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                        ResponseError errorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                        poeVar = new poe(new VkpnsRequestWithErrorBodyException(errorResponse.toString(), errorResponse.getCode()));
                    } else if (httpResponse.isSuccessful()) {
                        poeVar = MapperKt.getSortedAppInfoListByArbiter(AppInfoJsonParser.INSTANCE.parseAppInfoList(httpResponse.getBody()));
                    } else {
                        String message = httpResponse.getMessage();
                        if (message != null) {
                            str = message;
                        }
                        poeVar = new poe(new VkpnsRequestException(str, httpResponse.getCode()));
                    }
                    break;
                } catch (Exception e) {
                    poeVar = new poe(e);
                }
                return new roe(poeVar);
            default:
                ch3.d0(obj);
                List list2 = list;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new JSONObject((String) it.next()));
                }
                Object objM26executeRequestIoAF18A2 = masterHostApi.a.m26executeRequestIoAF18A(new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), masterHostApi.b).encodedPath("v1/multihost/master").build().toString(), new JSONObject().put("host_app_info", new JSONArray((Collection) arrayList)).toString()));
                try {
                    ch3.d0(objM26executeRequestIoAF18A2);
                    HttpResponse httpResponse2 = (HttpResponse) objM26executeRequestIoAF18A2;
                    if (ResponseErrorKt.hasErrorBody(httpResponse2.getBody())) {
                        ResponseError errorResponse2 = ResponseErrorKt.parseErrorResponse(httpResponse2.getBody());
                        poeVar2 = new poe(new VkpnsRequestWithErrorBodyException(errorResponse2.toString(), errorResponse2.getCode()));
                    } else if (httpResponse2.isSuccessful()) {
                        poeVar2 = MapperKt.toAppInfo(AppInfoJsonParser.INSTANCE.parseAppInfo(httpResponse2.getBody()));
                    } else {
                        String message2 = httpResponse2.getMessage();
                        if (message2 != null) {
                            str = message2;
                        }
                        poeVar2 = new poe(new VkpnsRequestException(str, httpResponse2.getCode()));
                    }
                    break;
                } catch (Exception e2) {
                    poeVar2 = new poe(e2);
                }
                return new roe(poeVar2);
        }
    }
}
