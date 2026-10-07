package defpackage;

import android.net.TrafficStats;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class rfk implements j7k {
    public final /* synthetic */ int a;

    @Override // defpackage.j7k
    public final byte a(long j, String str) throws Throwable {
        Throwable th;
        Socket socket;
        Object poeVar;
        Object poeVar2;
        int iIntValue = 443;
        Socket socket2 = null;
        try {
            try {
                switch (this.a) {
                    case 0:
                        try {
                            TrafficStats.setThreadStatsTag(str.hashCode());
                            try {
                                return ((InetAddress.getAllByName(str).length == 0 ? (char) 1 : (char) 0) ^ 1) == true ? (byte) 1 : (byte) 0;
                            } finally {
                                TrafficStats.clearThreadStatsTag();
                            }
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (Exception unused) {
                            return (byte) 0;
                        }
                    case 1:
                        try {
                            socket = new Socket();
                            try {
                                TrafficStats.setThreadStatsTag(str.hashCode());
                                try {
                                    String strP1 = r5h.p1(':', str, "");
                                    if (!r5h.X0(strP1)) {
                                        int i = 0;
                                        while (true) {
                                            if (i >= strP1.length()) {
                                                try {
                                                    poeVar = Integer.valueOf(Integer.parseInt(strP1));
                                                } catch (Throwable th2) {
                                                    poeVar = new poe(th2);
                                                }
                                                boolean z = poeVar instanceof poe;
                                                Object obj = poeVar;
                                                if (z) {
                                                    obj = 443;
                                                }
                                                iIntValue = ((Number) obj).intValue();
                                                break;
                                            } else if (Character.isDigit(strP1.charAt(i))) {
                                                i++;
                                            }
                                        }
                                    }
                                    socket.connect(new InetSocketAddress(str, iIntValue), (int) j);
                                    TrafficStats.clearThreadStatsTag();
                                    try {
                                        socket.close();
                                        break;
                                    } catch (Throwable unused2) {
                                    }
                                    return (byte) 2;
                                } catch (Throwable th3) {
                                    TrafficStats.clearThreadStatsTag();
                                    throw th3;
                                }
                            } catch (InterruptedException e2) {
                                socket2 = socket;
                                throw e2;
                            } catch (Exception unused3) {
                                socket2 = socket;
                                if (socket2 == null) {
                                    return (byte) 0;
                                }
                                try {
                                    socket2.close();
                                    return (byte) 0;
                                } catch (Throwable unused4) {
                                    return (byte) 0;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (socket != null) {
                                    try {
                                        socket.close();
                                        break;
                                    } catch (Throwable unused5) {
                                    }
                                }
                                throw th;
                            }
                        } catch (InterruptedException e3) {
                            throw e3;
                        } catch (Exception unused6) {
                        }
                        break;
                    default:
                        try {
                            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
                            try {
                                TrafficStats.setThreadStatsTag(str.hashCode());
                                try {
                                    String strP2 = r5h.p1(':', str, "");
                                    if (!r5h.X0(strP2)) {
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= strP2.length()) {
                                                try {
                                                    poeVar2 = Integer.valueOf(Integer.parseInt(strP2));
                                                } catch (Throwable th5) {
                                                    poeVar2 = new poe(th5);
                                                }
                                                boolean z2 = poeVar2 instanceof poe;
                                                Object obj2 = poeVar2;
                                                if (z2) {
                                                    obj2 = 443;
                                                }
                                                iIntValue = ((Number) obj2).intValue();
                                                break;
                                            } else if (Character.isDigit(strP2.charAt(i2))) {
                                                i2++;
                                            }
                                        }
                                    }
                                    sSLSocket.connect(new InetSocketAddress(str, iIntValue), (int) j);
                                    sSLSocket.startHandshake();
                                    TrafficStats.clearThreadStatsTag();
                                    try {
                                        sSLSocket.close();
                                        break;
                                    } catch (Throwable unused7) {
                                    }
                                    return (byte) 4;
                                } catch (Throwable th6) {
                                    TrafficStats.clearThreadStatsTag();
                                    throw th6;
                                }
                            } catch (InterruptedException e4) {
                                socket2 = sSLSocket;
                                throw e4;
                            } catch (Exception unused8) {
                                socket2 = sSLSocket;
                                if (socket2 == null) {
                                    return (byte) 0;
                                }
                                try {
                                    socket2.close();
                                    return (byte) 0;
                                } catch (Throwable unused9) {
                                    return (byte) 0;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                socket2 = sSLSocket;
                                if (socket2 != null) {
                                    try {
                                        socket2.close();
                                        break;
                                    } catch (Throwable unused10) {
                                    }
                                }
                                throw th;
                            }
                        } catch (InterruptedException e5) {
                            throw e5;
                        } catch (Exception unused11) {
                        }
                        break;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            socket = socket2;
        }
    }
}
