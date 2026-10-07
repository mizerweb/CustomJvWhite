package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.transition.ChangeBounds;
import android.transition.TransitionSet;
import android.view.animation.PathInterpolator;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executors;
import one.me.android.media.service.OneMeMediaSessionService;
import one.me.pinbars.PinBarsWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yxb implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ yxb(ldc ldcVar) {
        this.a = 9;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = 1;
        switch (this.a) {
            case 0:
                return new ShapeDrawable();
            case 1:
                return rki.c(R.drawable.saved_messages_avatar).toString();
            case 2:
                ao5 ao5Var = ao5.a;
                return rk9.a;
            case 3:
                int i2 = OneMeMediaSessionService.k;
                r7 r7Var = r7.a;
                return new au9(r7.d(ha9.b));
            case 4:
                return new bac(gm0.K(3.0f * yl5.d().getDisplayMetrics().density), yl5.d().getDisplayMetrics().density * 4.0f);
            case 5:
                return Executors.newSingleThreadExecutor();
            case 6:
                HandlerThread handlerThread = new HandlerThread("ov-playback-thread", -16);
                handlerThread.start();
                return handlerThread;
            case 7:
                return ((HandlerThread) ldc.a0.getValue()).getLooper();
            case 8:
                return new Exception();
            case 10:
                boolean z = nec.a;
            case 9:
                return null;
            case 11:
                return new Handler(Looper.getMainLooper());
            case 12:
                return new na6("one.me.sdk.OneVideoPreloadConfig.Disabled", dec.INSTANCE, new Annotation[0]);
            case 13:
                return r66.a;
            case 14:
                return new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
            case 15:
                return new Paint(1);
            case 16:
                return new re7(i, new String[0]);
            case 17:
                zv8[] zv8VarArr = PinBarsWidget.z;
                return new kzc(null, null, 1, false);
            case 18:
                zv8[] zv8VarArr2 = PinBarsWidget.z;
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.setOrdering(0);
                transitionSet.setDuration(300L);
                transitionSet.addTransition(new iv7());
                transitionSet.addTransition(new ChangeBounds());
                return transitionSet;
            case 19:
                zv8[] zv8VarArr3 = e5d.S6;
                return "Быстрый старт в чатах";
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zv8[] zv8VarArr4 = e5d.S6;
                return "Быстрое завершение звонка";
            case 21:
                return new String[]{"0 - Используется старая логика", "> 0 - Время в секундах, через которое будет осуществлена проверка на включенные уведомления"};
            case 22:
                return new String[]{"0 - Фича выключена", "> 0 - Время в секундах на соединение с сигналингом, после которого предлагаем позвонить по сотовой сети"};
            case 23:
                return new String[]{"JSON { \"isOpponentNoNetwork\": boolean, \"recallToPhone\": boolean, \"timeout\": int }", "timeout > 0 — таймер ожидания регистрации адресата", "isOpponentNoNetwork = true — статус «Подключение…»", "recallToPhone = true — при наличии номера"};
            case 24:
                return new String[]{"секунды ожидания после ответа до экрана завершения (default -1)"};
            case 25:
                return new String[]{"Время в секундах, через которое будет осуществлена проверка на отключение режима энергосбережения", "> 0 - Время в секундах, через которое будет осуществлена проверка на включенные уведомления"};
            case 26:
                return new String[]{"Включение шторки энергосбережения"};
            case 27:
                zv8[] zv8VarArr5 = e5d.S6;
                return "Уведомления об ответах на ваши комментарии";
            case 28:
                zv8[] zv8VarArr6 = e5d.S6;
                return "Включить публикацию историй";
            default:
                zv8[] zv8VarArr7 = e5d.S6;
                return " Отключить аудио пайплайн";
        }
    }

    public /* synthetic */ yxb(int i) {
        this.a = i;
    }
}
