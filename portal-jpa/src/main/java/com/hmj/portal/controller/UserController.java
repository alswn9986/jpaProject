package com.hmj.portal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hmj.portal.entity.UserEntity;
import com.hmj.portal.repository.UserRepository;
import com.hmj.portal.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/")
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	/**
     * 회원 목록 조회
     * @return
     */
	@Operation(summary = "회원 목록 조회", description = "회원 목록을 조회합니다.", tags = { "User Controller" })
	@ApiResponses({
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = UserEntity.class))),
        @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
        @ApiResponse(responseCode = "404", description = "NOT FOUND"),
        @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
	})
	@GetMapping("member")
    public List<UserEntity> getMemberList() {
		return userService.findAll();
    }
	
	/**
     * 회원 등록
     * @return
     */
	@Operation(summary = "회원 등록", description = "회원을 등록합니다.", tags = { "User Controller" })
	@ApiResponses({
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = UserEntity.class))),
        @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
        @ApiResponse(responseCode = "404", description = "NOT FOUND"),
        @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
	})
	@PostMapping("member")
    public UserEntity saveMember(UserEntity userEntity) {
		logger.debug("saveMember ::: {}", userEntity.toString());
		userService.save(userEntity);
		return userEntity;
    }
	
}
