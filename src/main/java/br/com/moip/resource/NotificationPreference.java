package br.com.moip.resource;

import lombok.Data;

/**
 * Created by emanuel on 07/08/17.
 */
@Data
public class NotificationPreference
{
	private String event;

	private Resource resource;

	private String token;
}
