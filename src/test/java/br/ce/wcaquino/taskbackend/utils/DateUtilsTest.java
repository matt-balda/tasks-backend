package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		LocalDate date = LocalDate.of(2030, 01, 01);
		boolean expectativa = DateUtils.isEqualOrFutureDate(date);
		Assert.assertFalse(expectativa);
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		LocalDate date = LocalDate.of(2020, 01, 01);
		boolean expectativa = DateUtils.isEqualOrFutureDate(date);
		Assert.assertFalse(expectativa);;
	}
	
	@Test
	public void deveRetornarTrueParaDatasAtual() {
		LocalDate date = LocalDate.now();
		boolean expectativa = DateUtils.isEqualOrFutureDate(date);
		Assert.assertTrue(expectativa);;
	}
}
