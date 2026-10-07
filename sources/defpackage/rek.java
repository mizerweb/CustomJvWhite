package defpackage;

import android.util.Log;
import com.vk.push.common.component.PushTokenComponent;
import com.vk.push.common.component.TopicComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class rek implements TopicComponent, h4k, PushTokenComponent {
    public static efk b() {
        efk efkVar = efk.s;
        if (efkVar != null) {
            return efkVar;
        }
        ore.k("Client SDK is not initialized, did you call init method in your Application class?");
        return null;
    }

    public static boolean c() {
        return efk.s != null;
    }

    @Override // defpackage.h4k
    public final ljh a() {
        if (c()) {
            return b().a();
        }
        Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
        ik5 ik5Var = new ik5(5, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        ljh ljhVar = new ljh();
        ljhVar.g((IllegalStateException) ik5Var.b);
        return ljhVar;
    }

    @Override // com.vk.push.common.component.PushTokenComponent
    public final ljh deleteToken() {
        if (c()) {
            return b().deleteToken();
        }
        Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
        ik5 ik5Var = new ik5(5, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        ljh ljhVar = new ljh();
        ljhVar.g((IllegalStateException) ik5Var.b);
        return ljhVar;
    }

    @Override // com.vk.push.common.component.PushTokenComponent
    public final ljh getToken() {
        if (c()) {
            return b().getToken();
        }
        Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
        ik5 ik5Var = new ik5(5, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        ljh ljhVar = new ljh();
        ljhVar.g((IllegalStateException) ik5Var.b);
        return ljhVar;
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final ljh subscribeToTopic(String str) {
        if (c()) {
            return b().subscribeToTopic(str);
        }
        Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
        ik5 ik5Var = new ik5(5, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        ljh ljhVar = new ljh();
        ljhVar.g((IllegalStateException) ik5Var.b);
        return ljhVar;
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final ljh unsubscribeFromTopic(String str) {
        if (c()) {
            return b().unsubscribeFromTopic(str);
        }
        Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
        ik5 ik5Var = new ik5(5, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        ljh ljhVar = new ljh();
        ljhVar.g((IllegalStateException) ik5Var.b);
        return ljhVar;
    }
}
