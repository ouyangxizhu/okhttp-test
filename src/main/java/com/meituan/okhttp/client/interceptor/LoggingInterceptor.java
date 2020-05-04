package com.meituan.okhttp.client.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class LoggingInterceptor implements Interceptor {
	private static final String TAG = "LoggingInterceptor";
//	private static final Logger logger = LogManager.getLogger();
	@NotNull
	@Override
	public Response intercept(@NotNull Chain chain)
			throws IOException {
		Request request = chain.request();
		long startTime = System.nanoTime();
		Response response = chain.proceed(request);
		System.out.println("time" + (System.nanoTime()-startTime));
		return response;
	}

}
